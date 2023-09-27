package entidades;

public class AveVoadora extends Ave{
    public int PACIENCIA_MAXIMA = 20;

    public AveVoadora(int id, String nome, String especie, int andarDesejado, 
    int peso, int temperaturaIdeal, String corDasPenas){
        super(id, nome, especie, andarDesejado, peso, temperaturaIdeal, corDasPenas);
    }

    @Override
    public int hashCode() {//exemplo, não sei se está certo
        final int prime = 31;
        int result = super.hashCode();
        result = prime * result + PACIENCIA_MAXIMA;
        return result;
    }

    @Override
    public String toString() {
        return "Ave Voadora ID: " + getId() + ", Nome: " + getNome() + ", Especie: " + getEspecie() + ", Andar Desejado: "
                + getAndarDesejado() + ", Peso: " + getPeso() + "e Temperatura Ideal: " + getTemperaturaIdeal()
                + "e, Cor das Penas: " + getCorDasPenas();
    }

    
    
}
