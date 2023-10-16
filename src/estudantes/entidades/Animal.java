package entidades;

import professor.entidades.Andar;

/**
 * Classe que define um animal da arca.
 * <br>
 * <br>
 * Essa classe pode ser estendida. Adicionalmente, ela deve:
 * <br>
 * <br>
 * 1) ter um construtor completo,<br>
 * 2) implementar métodos de acesso (getters), sendo que métodos de modificação
 * (setters) NÃO devem ser implementados,<br>
 * 3) sobre-escrever os métodos toString, equals e hashCode,<br>
 * 4) deve implementar o método <i>aumentaEspera</i> conforme indicado na
 * documentação.
 * <br>
 * <br>
 * <strong>Não devem ser criados métodos adicionais nessa classe.</strong>
 * 
 * @author Jean Cheiran
 * @author Tamires Antunes Nunes
 * @author Gabriela da Silva Ramires
 * @version 1.1
 */
public class Animal {

    /**
     * Limite da paciência de um animal esperando na fila antes de ir embora.
     * em segundos (ciclos de espera)
     */
    public final int PACIENCIA_MAXIMA = 25;

    /**
     * Atributos da classe
     * Peso é em quilos
     * AndarDesejado se inicia no 0, que é o térreo
     * TemperaturaIdeal é em graus Celsius
     */
    private int id;
    private String nome;
    private String especie;
    private int peso;
    private int andarDesejado;
    private int tempoDeEspera;
    private int temperaturaIdeal;
    private Andar andar;

    /**
     * Construtor do animal.
     * Todos os atributos são passados por parâmetro, exceto o tempo de espera
     * que sempre começa em 0.
     * 
     * @param id
     * @param nome
     * @param especie
     * @param andarDesejado
     * @param peso
     * @param temperaturaIdeal
     */
    public Animal(int id, String nome, String especie, int andarDesejado,
            int peso, int temperaturaIdeal) {
        this.id = id;
        this.nome = nome;
        this.especie = especie;
        this.andarDesejado = andarDesejado;
        this.peso = peso;
        this.temperaturaIdeal = temperaturaIdeal;
    }

    /**
     * Retorna o número de identificaçao do animal.
     * O valor é gerado aleatoriamente e está entre 0 e 999999.
     * 
     * @return número da identificação do animal
     */
    public int getId() {
        return id;
    }

    /**
     * Retorna o peso do animal.
     * O peso é gerado aleatoriamente e está entre 1 e 1.000 quilos.
     * 
     * @return peso do animal em quilos
     */
    public int getPeso() {
        return peso;
    }

    /**
     * Retorna o nome do animal
     * 
     * @return nome do animal
     */
    public String getNome() {
        return nome;
    }

    /**
     * Retorna a especie do animal
     * 
     * @return especie do animal
     */
    public String getEspecie() {
        return especie;
    }

    /**
     * Retorna o Andar Desejado pelo animal
     * 
     * @return andarDesejado, que é um inteiro
     */
    public int getAndarDesejado() {
        return andarDesejado;
    }

    /**
     * Retorna o tempo de espera do animal
     * 
     * @return tempo de espera
     */

    public int getTempoDeEspera() {
        return tempoDeEspera;
    }

    /**
     * Retorna a temperatura ideal que o animal precisa
     * 
     * @return a temperatura ideal
     */
    public int getTemperaturaIdeal() {
        return temperaturaIdeal;
    }

    /**
     * Retorna a paciência máxima que o animal possui
     * 
     * @return a paciência máxima do animal
     */

    public int getPACIENCIA_MAXIMA() {
        return PACIENCIA_MAXIMA;
    }

    /**
     * Aumenta o tempo de espera um animal na fila quando passa um ciclo.
     * Esse é o tempo de espera na fila de um andar para embarcar no elevador.
     * Um ciclo ocorre sempre que o método de simular vida na arca é invocado.
     * Esse método não deve ser chamado fora da classe Arca.
     * <br>
     * <br>
     * A implementação desse método deve comparar a paciência do animal com
     * o tempo de espera depois de incrementado. Se ela for menor, uma exceção
     * deve ser lançada.
     * <br>
     * <br>
     * 
     * @throws RuntimeException se o animal está esperando a mais tempo que a
     *                          paciência
     * @see professor.entidades.Arca#simularVida
     */
    public void aumentaEspera(Andar andar) {
        /**
         * O método aumentaEspera() aumenta o tempoDeEspera do animal em 1.
         * Se o tempoDeEspera for maior ou igual a PACIENCIA_MAXIMA, é lançada uma
         * exceção.
         */
        tempoDeEspera++; // Aumenta o tempo de espera ...

        if (tempoDeEspera > PACIENCIA_MAXIMA) { // Verifica se o tempo ultrapassou a paciência, se sim,...
            // Acessa a lista de animais da fila da classe Andar, pelo método
            // "checarFilaParaElevador".
            Animal[] fila = andar.checarFilaParaElevador();

            for (int i = 0; i < fila.length; i++) {
                // Aumenta o tempo de espera para todos os animais na fila.
                fila[i].tempoDeEspera++;

                if (fila[i].tempoDeEspera > PACIENCIA_MAXIMA) {
                    andar.tirarDaFila(i); // remove o animal da fila usando a posição...
                    //animaisQueSairamDaFila.add(fila[i]); // e adiciona o animal à lista de animais que saíram da fila.
                }
            }
            // Por fim, solta a exceção.
            throw new RuntimeException("O animal está esperando mais tempo do que sua paciência permite");
        }
    }
    /*
     * this.tempoDeEspera++;
     * if (this.tempoDeEspera >= PACIENCIA_MAXIMA) {
     * throw new
     * RuntimeException("O animal está esperando na fila há mais tempo que a paciência que possui"
     * );
     * // implementar o animal sair da fila?
     * }
     */

    

    /**
     * Este método hascode está combinando os códigos hash dos campos do
     * objeto, ponderados pela constante prime, para calcular um código hash geral
     * para o objeto, o prime é uma contante usada para calcular o código hash,
     * sendo um número primo para evitar colisões
     * result é o valor iniciado com 1 que vai ser multiplicado e somado ao longo do
     * calculo do código hash
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + PACIENCIA_MAXIMA;
        result = prime * result + id;
        result = prime * result + (nome == null ? 0 : nome.hashCode());
        result = prime * result + (especie == null ? 0 : especie.hashCode());
        result = prime * result + peso;
        result = prime * result + andarDesejado;
        result = prime * result + tempoDeEspera;
        result = prime * result + temperaturaIdeal;
        return result;
    }

    /**
     * Método que verifica se dois objetos são iguais, primeiro ele verifica se o
     * objeto é diferente de nullo
     * Depois ele verifica se o objeto passado como argumento é o mesmo objeto no
     * qual o método esta sendo chamado
     * Depois ele verifica se o objeto passado é uma instância da classe Animal ou
     * de uma subclasse dela
     * Se não for retorna false indicando que os objetos são d etipos diferentes, ou
     * seja, não são iguais
     * Depois ele converte o objeto passado como argumento para o tipo animal
     * Depois compara os atributos do objeto atual com os atributos de outroAnimal,
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
        if (!(outro instanceof Animal)) {
            return false;

        }
        Animal outroAnimal = (Animal) outro;
        if (this.PACIENCIA_MAXIMA == outroAnimal.PACIENCIA_MAXIMA && this.id == outroAnimal.id
                && this.nome == outroAnimal.nome && this.especie == outroAnimal.especie
                && this.andarDesejado == outroAnimal.andarDesejado && this.peso == outroAnimal.peso
                && this.temperaturaIdeal == outroAnimal.temperaturaIdeal) {
            return true;

        } else {
            return false;
        }

    }

    /**
     * Método toString que irá imprimir as informações do animal
     */

    @Override
    public String toString() {
        return "Animal [PACIENCIA_MAXIMA=" + PACIENCIA_MAXIMA + ", id=" + id + ", nome=" + nome + ", especie=" + especie
                + ", peso=" + peso + ", andarDesejado=" + andarDesejado + ", tempoDeEspera=" + tempoDeEspera
                + ", temperaturaIdeal=" + temperaturaIdeal + "]";
    }

}
