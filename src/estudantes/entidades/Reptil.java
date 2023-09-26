package entidades;

public class Reptil extends Animal {
    public int PACIENCIA_MAXIMA = 10;

    public Reptil(int id, String nome, String especie, int andarDesejado,
            int peso, int temperaturaIdeal) {
        super(id, nome, especie, andarDesejado, peso, temperaturaIdeal);

    }

    public String andarReptil() {
        return "andando";
    }

    @Override
    public String toString() {
        return "Reptil ID: " + getId() + ", Nome: " + getNome() + ", Especie: " + getEspecie() + ", Andar Desejado: "
                + getAndarDesejado() + ", Peso: " + getPeso() + "e Temperatura Ideal: " + getTemperaturaIdeal();
    }

}
