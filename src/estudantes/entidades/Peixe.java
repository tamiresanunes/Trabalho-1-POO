package entidades;

public class Peixe extends Animal{
    public int PACIENCIA_MAXIMA = 60;
    private String corDasEscamas;

    public Peixe(String corDasEscamas, int id, String nome, String especie, int andarDesejado,
    int peso, int temperaturaIdeal ){
        super(id, nome, especie, andarDesejado, peso, temperaturaIdeal);
        this.corDasEscamas = corDasEscamas;
    }

    public String getCorDasEscamas() {
        return corDasEscamas;
    }
    public String nadarPeixe(){
        return "nadando";
    }

    @Override
    public String toString() {
        return "Peixe [PACIENCIA_MAXIMA=" + PACIENCIA_MAXIMA + ", corDasEscamas=" + corDasEscamas + "]";
    }
    
}
