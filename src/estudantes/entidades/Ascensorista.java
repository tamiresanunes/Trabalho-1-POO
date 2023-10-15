package entidades;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

import professor.entidades.Andar;
import professor.entidades.Elevador;

/**
 * Classe que traz a lógica do algoritmo de uso do elevador.
 * <br>
 * <br>
 * Você pode incluir novos atributos e métodos nessa classe para criar
 * lógicas mais complexas para o gerenciamento do uso do elevador, mas esses
 * <strong>atributos e métodos devem ser todos privados</strong>. O único
 * método público deve ser "agir".
 * 
 * @author Jean Cheiran
 * @version 1.0
 */
public class Ascensorista {
    private Elevador elevador;
    private Andar andar;
    private Animal animal;

    /**
     * Construtor padrão de Ascensorista.
     * Esse construtor sem parâmetros que será usado pela Arca. Embora a
     * assinatura do construtor não deva ser mudada, o código interno pode
     * ser alterado conforme a necessidade.
     */
    public Ascensorista() {

    }

    /*
     * public Ascensorista(Elevador elevador, Andar andar) {
     * this.elevador = elevador;
     * this.andar = andar;
     * }
     */

    /**
     * Executa a lógica de controle do elevador e dos animais.
     * Esse método é o único método de controle invocado durante a simulação
     * de vida da arca.
     * <br>
     * <br>
     * Aqui podem ser feitas todas as verificações sobre os animais do elevador
     * e da fila de animais que estão esperando no andar. A partir desses
     * estados, você pode movimentar animais para dentro e para fora do
     * elevador usando os métodos "desembarcar" e "embarcar" por exemplo.
     * O estado do elevador também é importante para acionar os comandos do
     * elevador como "drenar", "encher", "subir" e "descer".
     * 
     * @param elevador o elevador controlado pelo ascensorista
     * @param andar    o andar no qual o elevador está parado
     */
    public void agir(Elevador elevador, Andar andar) {
        // Verifica se há animais esperando no andar atual.
        Animal[] animaisNoAndar = andar.checarFilaParaElevador();
        double pesoTotalNoElevador = 0;

        // Embarca os animais que estão esperando no andar
        for (Animal animal : animaisNoAndar) {
            if (pesoTotalNoElevador + animal.getPeso() <= 2500) {
                pesoTotalNoElevador += animal.getPeso();
                elevador.embarcar(animal); // Embarca o animal no elevador
                andar.chamarProximoDaFila();
            } else {
                System.out.println("O peso máximo foi atingido, elevador irá se movimentar");
                break; // Sai do loop se o peso máximo for atingido
            }
        }

        /*
         * // Verifica se há animais no elevador que desejam desembarcar no andar atual.
         * Animal[] animaisNoElevador = elevador.checarAnimaisNoElevador();
         * for (Animal animal : animaisNoElevador) {
         * if (animal.getAndarDesejado() == elevador.getAndar()) {
         * elevador.desembarcar(animal, andar);
         * }
         * }
         */
    }
}