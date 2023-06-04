package Domain;

public class Filme extends Titulo {
    private int AnoLancamento;
    private int Curtidas;
    public int getCurtidas() {
        return Curtidas;
    }
    public int getAnoLancamento() {
        return AnoLancamento;
    }
    public void curtir(){
        Curtidas++;
    }
    public Filme(String nome, int anoLancamento) {
        super(nome);
        AnoLancamento = anoLancamento;
    }
}

