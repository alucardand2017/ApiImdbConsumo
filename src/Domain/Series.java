package Domain;

import java.util.ArrayList;

public class Series extends Titulo {
    public ArrayList<Episodeo> Episodeos = new ArrayList<>();
    public int getCurtidas(){
        int totalCurtidas =0;
        for (Episodeo ep: Episodeos) {
            totalCurtidas += ep.getCurtidas();
        }
        return  totalCurtidas;
    }
    public Series(String nome) {
        super(nome);
    }
}

