package entidades;

public class Ave extends Animal {
    public int PACIENCIA_MAXIMA = 30;

    private String corDasPenas;

    public Ave(int id, String nome, String especie, int andarDesejado,
            int peso, int temperaturaIdeal, String corDasPenas) {
        super(id, nome, especie, andarDesejado, peso, temperaturaIdeal);
        this.corDasPenas = corDasPenas;
    }

    public int getPACIENCIA_MAXIMA() {
        return PACIENCIA_MAXIMA;
    }

    public String getCorDasPenas() {
        return corDasPenas;
    }

    public String andarAve() {
        return "andando";
    }

    @Override
    public int hashCode() {//exemplo, não sei se está certo
        final int prime = 31;
        int result = super.hashCode();
        result = prime * result + ((corDasPenas == null) ? 0 : corDasPenas.hashCode());
        result = prime * result + PACIENCIA_MAXIMA;
        return result;
    }

    @Override
    public String toString() {
        return "Ave ID: " + getId() + ", Nome: " + getNome() + ", Especie: " + getEspecie() + ", Andar Desejado: "
                + getAndarDesejado() + ", Peso: " + getPeso() + "e Temperatura Ideal: " + getTemperaturaIdeal()
                + "e, Cor das Penas: " + getCorDasPenas();
    }

}
