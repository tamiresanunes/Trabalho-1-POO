package entidades;

public class ReptilAquatico extends Reptil{
    public int PACIENCIA_MAXIMA = 15;

    public ReptilAquatico(int id, String nome, String especie, int andarDesejado,
    int peso, int temperaturaIdeal){
        super(id, nome, especie, andarDesejado, peso, temperaturaIdeal);
    }
    public String nadarReptilAquatico(){
        return "nadando";
    }
    @Override
    public String toString() {
        return "ReptilAquatico [PACIENCIA_MAXIMA=" + PACIENCIA_MAXIMA + "]";
    }
    
    
}
