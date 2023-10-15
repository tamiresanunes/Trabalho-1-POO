package entidades;

/**
 * Classe que define Anfíbio, extendendo animal, por ser um tipo dele
 * Ela possui um construtor completo
 * Implementa dois métodos próprios
 * E sobre-escreve os métodos equals, haschCode e toString
 */
public class Anfibio extends Animal {
    /**
     * Limite de paciência de um anfíbio esperando na fila
     * em segundos
     */
    public int PACIENCIA_MAXIMA = 45;

    /**
     * Construtor completo da classe Anfíbio
     * Todos os atributos são passados como parâmetro
     * @param id
     * @param nome
     * @param especie
     * @param andarDesejado
     * @param peso
     * @param temperaturaIdeal
     */
    public Anfibio(int id, String nome, String especie, int andarDesejado,
            int peso, int temperaturaIdeal) {
        super(id, nome, especie, andarDesejado, peso, temperaturaIdeal);
    }

    /**
     * Método que retorna que o anfíbio está andando
     * 
     * @return andando
     */
    public String andarAnfibio() {
        return "andando";
    }

    /**
     * Método que retorna que o anfíbio está nadando
     * 
     * @return nadando
     */
    public String nadarAnfibio() {
        return "nadando";
    }

    /**
     * Método hashcode, que começa com a atribuição do número primo 31 para calcular
     * o hashcode, depois temos o trecho que chama o método hashcode da superclasse,
     * O resultado desse método é usado como base para calcular o código hash do
     * objeto atual. Isso é útil para garantir que o código hash leve em
     * consideração as propriedades da superclasse. No geral esse método combina o
     * hash da superclasse
     * com o valor de PACIENCIA_MAXIMA multiplicando por um número primo para
     * calcular um código hash único para o objeto atual.
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = super.hashCode();
        result = prime * result + PACIENCIA_MAXIMA;
        return result;
    }
    /**
     * Método que verifica se dois objetos são iguais, primeiro ele verifica se o
     * objeto é diferente de nullo
     * Depois ele verifica se o objeto passado como argumento é o mesmo objeto no
     * qual o método esta sendo chamado
     * Depois ele verifica se o objeto passado é uma instância da classe Anfibio ou de uma subclasse dela
     * Se não for retorna false indicando que os objetos são de tipos diferentes, ou seja, não são iguais
     * Chama o método equals da superclasse e
     * verifica se os objetos são iguais de acordo com a implementação na superclasse.
     * Depois ele converte o objeto passado como argumento para o tipo anfibio
     * Depois compara os atributos do objeto atual com os atributos de outroAnfibio,
     * para ver se eles são iguais
     */
    @Override
    public boolean equals(Object outro) {
        if (outro == null) {
            return false;
        }
        if (this == outro) {
            return true;
        }
        if (!(outro instanceof Anfibio)) {
            return false;

        }
        if (!super.equals(outro)) {
            return false;
        }

        Anfibio outroAnfibio = (Anfibio) outro;
        if (this.PACIENCIA_MAXIMA == outroAnfibio.PACIENCIA_MAXIMA) {
            return true;

        } else {
            return false;
        }

    }
/**
 * Método toString que irá imprimir as informações do anfíbio
 */
    @Override
    public String toString() {
        return "Anfíbio ID: " + getId() + ", Nome: " + getNome() + ", Especie: " + getEspecie() + ", Andar Desejado: "
                + getAndarDesejado() + ", Peso: " + getPeso() + "e Temperatura Ideal: " + getTemperaturaIdeal();
    }

}
