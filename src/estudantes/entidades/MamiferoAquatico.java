package entidades;

public class MamiferoAquatico extends Mamifero {
    public int PACIENCIA_MAXIMA = 40;

    public MamiferoAquatico(int id, String nome, String especie, int andarDesejado, int peso, int temperaturaIdeal,
            boolean peludo) {
        super(id, nome, especie, andarDesejado, peso, temperaturaIdeal, peludo);
    }

    public String nadarMamiferoAquatico() {
        return "nadando";
    }
    @Override
    public int hashCode() {//exemplo, não sei se está certo
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
        
        MamiferoAquatico outroMamiferoAquatico = (MamiferoAquatico) outro;
        if (this.PACIENCIA_MAXIMA == outroMamiferoAquatico.PACIENCIA_MAXIMA) {
            return true;
            
        }else{
            return false;
        }

    }

    @Override
    public String toString() {
        return "Mamífero Aquatico ID: " + getId() + ", Nome: " + getNome() + ", Especie: " + getEspecie()
                + ", Andar Desejado: " + getAndarDesejado() + ", Peso: "
                + getPeso() + ", Temperatura Ideal: " + getTemperaturaIdeal() + "e Peludo: " + getPeludo();
    }

}
