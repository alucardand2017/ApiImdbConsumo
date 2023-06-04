package Domain;

public class Episodeo extends Titulo{
    private int Temporada;
    private String NomeEpisodeo;
    private int Curtidas;
    public int getTemporada() {
        return Temporada;
    }
    public int getCurtidas() {
        return Curtidas;
    }
    public Episodeo(String Nome, int temporada ){
        super(Nome);
        Temporada = temporada;
    }
    public void curtir(){
        Curtidas ++;
    }

}

