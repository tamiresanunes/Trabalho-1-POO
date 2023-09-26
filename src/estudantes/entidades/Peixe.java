package entidades;

public class Peixe extends Animal {
    public int PACIENCIA_MAXIMA = 60;
    private String corDasEscamas;

    public Peixe(String corDasEscamas, int id, String nome, String especie, int andarDesejado,
            int peso, int temperaturaIdeal) {
        super(id, nome, especie, andarDesejado, peso, temperaturaIdeal);
        this.corDasEscamas = corDasEscamas;
    }

    public String getCorDasEscamas() {
        return corDasEscamas;
    }

    public String nadarPeixe() {
        return "nadando";
    }

    @Override
    public String toString() {
        return "Peixe ID: " + getId() + ", Nome: " + getNome() + ", Especie: " + getEspecie() + ", Andar Desejado: "
                + getAndarDesejado() + ", Peso: " + getPeso() + "e Temperatura Ideal: " + getTemperaturaIdeal()
                + "e, Cor Das Escamas: " + getCorDasEscamas();
    }

}
