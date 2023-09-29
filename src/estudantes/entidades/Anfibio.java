package entidades;

public class Anfibio extends Animal {
    public int PACIENCIA_MAXIMA = 45;

    public Anfibio(int id, String nome, String especie, int andarDesejado,
            int peso, int temperaturaIdeal) {
        super(id, nome, especie, andarDesejado, peso, temperaturaIdeal);
    }

    public String andarAnfibio() {
        return "andando";
    }

    public String nadarAnfibio() {
        return "nadando";
    }

    @Override//exemplo, não sei se está certo
    public int hashCode() {
        final int prime = 31;
        int result = super.hashCode();
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
        if (! super.equals(outro)) {
            return false;
        }
        
        Anfibio outroAnfibio = (Anfibio) outro;
        if (this.PACIENCIA_MAXIMA == outroAnfibio.PACIENCIA_MAXIMA) {
            return true;
            
        }else{
            return false;
        }

    }

    @Override
    public String toString() {
        return "Anfíbio ID: " + getId() + ", Nome: " + getNome() + ", Especie: " + getEspecie() + ", Andar Desejado: "
                + getAndarDesejado() + ", Peso: " + getPeso() + "e Temperatura Ideal: " + getTemperaturaIdeal();
    }

}
