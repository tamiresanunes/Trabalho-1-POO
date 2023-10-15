package entidades;

/**
 * Classe Ave que é um tipo de animal
 */
public class Ave extends Animal {
    /**
     * Limite da paciência da Ave esperando na fila
     * em segundos
     */
    public int PACIENCIA_MAXIMA = 30;

    private String corDasPenas;

    /**
     * Construtor completo da classe anfíbio
     * Todos os atributos são passados como parâmetros
     * 
     * @param id
     * @param nome
     * @param especie
     * @param andarDesejado
     * @param peso
     * @param temperaturaIdeal
     * @param corDasPenas
     */
    public Ave(int id, String nome, String especie, int andarDesejado,
            int peso, int temperaturaIdeal, String corDasPenas) {
        super(id, nome, especie, andarDesejado, peso, temperaturaIdeal);
        this.corDasPenas = corDasPenas;
    }

    /**
     * Retorna o valor da paciência máxima da ave
     * 
     * @return paciência máxima
     */
    public int getPACIENCIA_MAXIMA() {
        return PACIENCIA_MAXIMA;
    }

    /**
     * Retorna a cor das penas da ave
     * 
     * @return cor das penas
     */
    public String getCorDasPenas() {
        return corDasPenas;
    }

    /**
     * Método que retorna que a ave esta andando
     * 
     * @return andando
     */
    public String andarAve() {
        return "andando";
    }

    /**
     * Método hashcode, que começa com a atribuição do número primo 31 para calcular
     * o hashcode, depois temos o trecho que chama o método hashcode da superclasse,
     * O resultado desse método é usado como base para calcular o código hash do
     * objeto atual. Isso é útil para garantir que o código hash leve em
     * consideração as propriedades da superclasse. No geral esse método combina o
     * hash da superclasse
     * com o valor de PACIENCIA_MAXIMA e da corDasPenas, multiplicando por um número
     * primo para
     * calcular um código hash único para o objeto atual.
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = super.hashCode();
        result = prime * result + ((corDasPenas == null) ? 0 : corDasPenas.hashCode());
        result = prime * result + PACIENCIA_MAXIMA;
        return result;
    }

    /**
     * Método que verifica se dois objetos são iguais, primeiro ele verifica se o
     * objeto é diferente de nullo
     * Depois ele verifica se o objeto passado como argumento é o mesmo objeto no
     * qual o método esta sendo chamado
     * Depois ele verifica se o objeto passado é uma instância da classe Ave ou
     * de uma subclasse dela
     * Se não for retorna false indicando que os objetos são de tipos diferentes, ou
     * seja, não são iguais
     * Chama o método equals da superclasse e
     * verifica se os objetos são iguais de acordo com a implementação na
     * superclasse.
     * Depois ele converte o objeto passado como argumento para o tipo ave
     * Depois compara os atributos do objeto atual com os atributos de outroAve,
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
        if (!(outro instanceof Ave)) {
            return false;

        }
        if (!super.equals(outro)) {
            return false;
        }
        Ave outroAve = (Ave) outro;
        if (this.corDasPenas == outroAve.corDasPenas && this.PACIENCIA_MAXIMA == outroAve.PACIENCIA_MAXIMA) {
            return true;

        } else {
            return false;
        }

    }
    /**
     * Método toString que irá imprimir as informações da ave
     */

    @Override
    public String toString() {
        return "Ave ID: " + getId() + ", Nome: " + getNome() + ", Especie: " + getEspecie() + ", Andar Desejado: "
                + getAndarDesejado() + ", Peso: " + getPeso() + "e Temperatura Ideal: " + getTemperaturaIdeal()
                + "e, Cor das Penas: " + getCorDasPenas();
    }

}
