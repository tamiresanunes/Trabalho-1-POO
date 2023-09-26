package entidades;

public class Ave extends Animal {
    public int PACIENCIA_MAXIMA = 30;

    private String corDasPenas;
    public Ave(int id, String nome, String especie, int andarDesejado, 
    int peso, int temperaturaIdeal, String corDasPenas){
        super(id, nome, especie, andarDesejado, peso, temperaturaIdeal);
        this.corDasPenas = corDasPenas;
    }

    public int getPACIENCIA_MAXIMA() {
        return PACIENCIA_MAXIMA;
    }
    public String getCorDasPenas() {
        return corDasPenas;
    }

    @Override
    public String toString() {
        return  +super.toString()+ "Ave [PACIENCIA_MAXIMA=" + PACIENCIA_MAXIMA + ", corDasPenas=" + corDasPenas + "]";
    }

}
