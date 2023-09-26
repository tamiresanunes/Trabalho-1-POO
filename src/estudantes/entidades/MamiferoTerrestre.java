package entidades;

public class MamiferoTerrestre extends Mamifero {
    public int PACIENCIA_MAXIMA = 35;

    public MamiferoTerrestre(int id, String nome, String especie, int andarDesejado, int peso, int temperaturaIdeal,
            boolean peludo) {
        super(id, nome, especie, andarDesejado, peso, temperaturaIdeal, peludo);
    }

    public String andarMamiferoTerrestre() {
        return "andando";
    }

    @Override
    public String toString() {
        return "Mamífero Terrestre ID: " + getId() + ", Nome: " + getNome() + ", Especie: " + getEspecie()
                + ", Andar Desejado: " + getAndarDesejado() + ", Peso: "
                + getPeso() + ", Temperatura Ideal: " + getTemperaturaIdeal() + "e Peludo: " + getPeludo();
    }

}
