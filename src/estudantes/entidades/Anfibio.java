package entidades;

public class Anfibio extends Animal {
    public int PACIENCIA_MAXIMA = 45;

    public Anfibio(int id, String nome, String especie, int andarDesejado,
    int peso, int temperaturaIdeal){
        super(id, nome, especie, andarDesejado, peso, temperaturaIdeal);
    }
    
    public String andarAnfibio(){
        return "andando";
    }

    public String nadarAnfibio(){
        return "nadando";
    }

    @Override
    public String toString() {
        return "Anfibio [PACIENCIA_MAXIMA=" + PACIENCIA_MAXIMA + "]";
    }

    
}
