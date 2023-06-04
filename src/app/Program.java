package app;
import Domain.*;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws IOException, InterruptedException {
        try{
            Scanner entrada = new Scanner(System.in);
            System.out.println("Digite o nome do filme:");
            String termo = entrada.next();
            BuscaFilme(termo);
        }
        catch (Exception e){
            System.out.println("finalizando o programa devido um erro de mensagem -> " +e.getMessage()
            + " | Trace -> " + e.getStackTrace());
        }

    }

    private static void BuscaFilme(String term) throws IOException, InterruptedException {
            String site = "http://www.omdbapi.com/?t=";
            String key = "&apikey=f62f0f8e";
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    //.uri(URI.create("http://www.omdbapi.com/?t=matrix&apikey=f62f0f8e")) //minha chave no IMDB
                    .uri(URI.create(site+term+key))
                    .build();
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            String json = response.body();
            System.out.println(json);

            Gson  gson = new GsonBuilder()
                    .setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
                    .create();

            ImdbResponse  meuTituloOmdb = gson.fromJson(json, ImdbResponse.class);
            //System.out.println(meuTituloOmdb);
            TituloImdb meuTitulo = new TituloImdb(meuTituloOmdb);
            System.out.println("Titulo já convertido");
            System.out.println(meuTitulo);
    }

    private static void ExemploDeFilmesSeries() {
        Series series = new Series("Dragon Ball Z");
        ArrayList<Filme> filmesAnderson = new ArrayList<>();

        Episodeo ep1 = new Episodeo("A morte de Goku",1);
        Episodeo ep2 = new Episodeo("A morte de Veggeta",1);
        Episodeo ep3 = new Episodeo("A morte de Piccolo",1);

        Filme f1 = new Filme("Bastardos Inglórios", 2000);
        Filme f2 = new Filme("The Wolf of Wall Street", 2010);
        Filme f3 = new Filme("Senhor dos Aneis: As Duas Torres", 2005);

        series.Episodeos.add(ep1);
        series.Episodeos.add(ep2);
        series.Episodeos.add(ep3);

        filmesAnderson.add(f1);
        filmesAnderson.add(f2);
        filmesAnderson.add(f3);

        Random random = new Random();

        for(int j = 0 ; j < filmesAnderson.size() ; j++) {
            int x = random.nextInt(1,1000);
            for(int i = 0; i <=x ; i++){
                filmesAnderson.get(j).curtir();
            }
        }
        for(int j = 0 ; j < series.Episodeos.size() ; j++) {
            int x = random.nextInt(1,1000);
            for(int i = 0; i <=x ; i++){
                series.Episodeos.get(j).curtir();
            }
        }
        for (Filme f:filmesAnderson) {
            System.out.println(" O filme " + f.getNome() + " possui " + f.getCurtidas() );
        }
        for (Episodeo e: series.Episodeos) {
            System.out.println("A serie "+ series.getNome() + ", no episodeo " + e.getNome() + " possui " + e.getCurtidas() + " curtidas" );
        }
        System.out.println("A série no total tem " + series.getCurtidas() + " curtidas!");
    }
}

