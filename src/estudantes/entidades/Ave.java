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
    public boolean equals(Object outro){
        if (outro == null) {
            return false; 
        }
        if(this == outro){
            return true;
        }
        if (! (outro instanceof Ave)) {
            return false;
            
        }
        Ave outroAve = (Ave) outro;
        if (this.corDasPenas == outroAve.corDasPenas && this.PACIENCIA_MAXIMA == outroAve.PACIENCIA_MAXIMA) {
            return true;
            
        }else{
            return false;
        }

    }
    //outro modelo de equals
    /*public boolean equals(Object obj) {
    if (this == obj) {
        return true;
    }
    if (obj == null) {
        return false;
    }
    if (getClass() != obj.getClass()) {
        return false;
    }
    Ave other = (Ave) obj;
    if (PACIENCIA_MAXIMA != other.PACIENCIA_MAXIMA) {
        return false;
    }
    if (corDasPenas == null) {
        if (other.corDasPenas != null) {
            return false;
        }
    } else if (!corDasPenas.equals(other.corDasPenas)) {
        return false;
    }
    return true;
} */

    @Override
    public String toString() {
        return "Ave ID: " + getId() + ", Nome: " + getNome() + ", Especie: " + getEspecie() + ", Andar Desejado: "
                + getAndarDesejado() + ", Peso: " + getPeso() + "e Temperatura Ideal: " + getTemperaturaIdeal()
                + "e, Cor das Penas: " + getCorDasPenas();
    }

}
