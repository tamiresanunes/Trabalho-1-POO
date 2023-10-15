package entidades;

/**
 * Classe AveVoadora que é um tipo de Ave, que por sua vez é um tipo de animal
 */
public class AveVoadora extends Ave {
    /**
     * Limite de paciência que a AveVoadora tem esperando na fila
     * em segundos
     */
    public int PACIENCIA_MAXIMA = 20;

    /**
     * Construtor da classe AveVoadora
     * Todos os atributos são passados como parâmetro
     * 
     * @param id
     * @param nome
     * @param especie
     * @param andarDesejado
     * @param peso
     * @param temperaturaIdeal
     * @param corDasPenas
     */
    public AveVoadora(int id, String nome, String especie, int andarDesejado,
            int peso, int temperaturaIdeal, String corDasPenas) {
        super(id, nome, especie, andarDesejado, peso, temperaturaIdeal, corDasPenas);
    }

    /**
     * Método hashcode, que começa com a atribuição do número primo 31 para
     * calcular
     * o hashcode, depois temos o trecho que chama o método hashcode da
     * superclasse,
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
     * Depois ele verifica se o objeto passado é uma instância da classe AveVoadora
     * ou
     * e uma subclasse dela
     * e não for retorna false indicando que os objetos são de tipos diferentes, ou
     * seja, não são iguais
     * Chama o método equals da superclasse e
     * verifica se os objetos são iguais de acordo com a implementação na
     * superclasse.
     * Depois ele converte o objeto passado como argumento para o tipo AveVoadora
     * Depois compara os atributos do objeto atual com os atributos de AveVoadora,
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
        if (!(outro instanceof AveVoadora)) {
            return false;

        }
        if (!super.equals(outro)) {
            return false;
        }

        AveVoadora outroAveVoadora = (AveVoadora) outro;
        if (this.PACIENCIA_MAXIMA == outroAveVoadora.PACIENCIA_MAXIMA) {
            return true;

        } else {
            return false;
        }

    }
    /**
     * Método toString que irá imprimir todas as informações da AveVoadora
     */
    @Override
    public String toString() {
        return "Ave Voadora ID: " + getId() + ", Nome: " + getNome() + ", Especie: " + getEspecie() + ", Andar Desejado: "
                + getAndarDesejado() + ", Peso: " + getPeso() + " e Temperatura Ideal: " + getTemperaturaIdeal()
                + " e, Cor das Penas: " + getCorDasPenas();
    }

}
