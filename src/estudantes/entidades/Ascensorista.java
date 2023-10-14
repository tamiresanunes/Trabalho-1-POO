package entidades;

import java.util.List;

import professor.entidades.Andar;
import professor.entidades.Elevador;

/**
 * Classe que traz a lógica do algoritmo de uso do elevador.
 * <br><br>
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
    private Animal[] animais;
    private Animal animal;
    /**
     * Construtor padrão de Ascensorista.
     * Esse construtor sem parâmetros que será usado pela Arca. Embora a
     * assinatura do construtor não deva ser mudada, o código interno pode
     * ser alterado conforme a necessidade.
     */
    public Ascensorista(){
        
    }
     public Ascensorista(Elevador elevador, Andar andar){
        this.elevador = elevador;
        this.andar = andar;
    }
    
    /**
     * Executa a lógica de controle do elevador e dos animais.
     * Esse método é o único método de controle invocado durante a simulação 
     * de vida da arca.
     * <br><br>
     * Aqui podem ser feitas todas as verificações sobre os animais do elevador
     * e da fila de animais que estão esperando no andar. A partir desses
     * estados, você pode movimentar animais para dentro e para fora do
     * elevador usando os métodos "desembarcar" e "embarcar" por exemplo.
     * O estado do elevador também é importante para acionar os comandos do 
     * elevador como "drenar", "encher", "subir" e "descer".
     * @param elevador o elevador controlado pelo ascensorista
     * @param andar o andar no qual o elevador está parado
     */
    public void agir(Elevador elevador, Andar andar){
        // Verifica se há animais esperando no andar atual.
        Animal[] animaisNaFila = andar.checarFilaParaElevador();
        if (animaisNaFila.length > 0) {
            // Embarca os animais que estão esperando no andar
            for (Animal animal : animaisNaFila) {
                elevador.embarcar(animal);
            }
        }
        /*//Animal[] animaisNoAndar = andar.checarFilaParaElevador();
        // Verifica se o elevador está cheio.
        if (elevador.checarAnimaisNoElevador() != null) {
            // Desembarca todos os animais do elevador.
            elevador.desembarcar(animal, andar);
        }
        // Verifica se o elevador está vazio.
        if (elevador.checarAnimaisNoElevador() != null) {
            // Sobe ou desce o elevador para o próximo andar.
            if (andar.getAndar() < elevador.getAndar()) {
                elevador.subir();
            } else {
                elevador.descer();
            }
            // Atualiza o andar atual.
            andar = andar(elevador.getAndar());
        }*/
    }
    private Andar andar(int andar2) {
        return null;
    }
    }
    /*public void agir(Elevador elevador, Andar andar) {
    // Verifica se o elevador está cheio
    if (elevador.estaCheio()) {
        // Desembarca todos os animais do elevador
        elevador.desembarcarTodos();
    }
    // Verifica se há animais esperando no andar
    if (andar.haAnimaisEsperando()) {
        // Embarca os animais que estão esperando no andar
        elevador.embarcar(andar.getAnimaisEsperando());
    }
    // Verifica se o elevador está vazio
    if (elevador.estaVazio()) {
        // Sobe o elevador
        elevador.subir();
    } else {
        // Desce o elevador
        elevador.descer();
    }
} */

