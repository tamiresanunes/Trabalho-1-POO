package entidades;

public class ReptilAquatico extends Reptil {
    public int PACIENCIA_MAXIMA = 15;

    public ReptilAquatico(int id, String nome, String especie, int andarDesejado,
            int peso, int temperaturaIdeal) {
        super(id, nome, especie, andarDesejado, peso, temperaturaIdeal);
    }

    public String nadarReptilAquatico() {
        return "nadando";
    }

    @Override
    public int hashCode() {// exemplo, não sei se está certo
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
        ReptilAquatico outroReptilAquatico = (ReptilAquatico) outro;
        if (this.PACIENCIA_MAXIMA == outroReptilAquatico.PACIENCIA_MAXIMA) {
            return true;
            
        }else{
            return false;
        }

    }

    @Override
    public String toString() {
        return "Reptil Aquatico ID: " + getId() + ", Nome: " + getNome() + ", Especie: " + getEspecie()
                + ", Andar Desejado: "
                + getAndarDesejado() + ", Peso: " + getPeso() + "e Temperatura Ideal: " + getTemperaturaIdeal();
    }

}
