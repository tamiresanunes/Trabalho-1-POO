package professor.entidades;


import entidades.Animal;
import java.util.HashSet;
import java.util.LinkedList;

/**
 * Classe que representa um andar da arca onde animais embarcam e desembarcam.
 * <br><br>
 * <strong>NÃ£o mexa aqui!!!</strong>
 * 
 * @author Jean Cheiran
 * @version 1.1
 */
public class Andar {
    private int andar; //comeÃ§a no 0
    private LinkedList<Animal> filaParaElevador;
    private HashSet<Animal> animaisQueDesceram;
    
    /**
     * Construtor do andar.
     * Ele sempre comeÃ§a sem animais na fila e sem animais desembarcados.
     * @param andar nÃºmero do andar (0 Ã© tÃ©rreo)
     */
    public Andar(int andar){
        this.andar = andar;
        filaParaElevador = new LinkedList<Animal>();
        animaisQueDesceram = new HashSet<Animal>();
    }
    
    /**
     * Retorna o nÃºmero do andar
     * @return andar (0 Ã© tÃ©rreo)
     */
    public int getAndar(){
        return andar;
    }
    
    /**
     * Inclui o animal no fim da fila de espera para pegar o elevador.
     * Esse mÃ©todo Ã© usado pelo simulador de vida da arca e nÃ£o deveria ser
     * invocado por outras classes. Como se trata de uma fila, o animal Ã© sempre
     * colocado no final e nÃ£o Ã© removido de nenhum outro lugar onde esteja.
     * @param animal o animal para ser colocado no final da fila (um valor null 
     * serÃ¡ ignorado)
     */
    public void colocarNaFila(Animal animal){
        if(animal != null){
            filaParaElevador.offer(animal);
        }
    }
    
    /**
     * Remove e retorna o animal de uma posiÃ§Ã£o especificada da fila.
     * A fila comeÃ§a no primeiro animal (cabeÃ§a) que estÃ¡ na posiÃ§Ã£o 0. Os
     * demais elementos do fim da fila sÃ£o reorganizados para ocuparem o espaÃ§o
     * do animal que saiu sem deixar buracos. A verificaÃ§Ã£o desse mÃ©todo lanÃ§a 
     * uma exceÃ§Ã£o quando se tenta tirar um animal de uma posiÃ§Ã£o que nÃ£o existe.
     * @param posicao posiÃ§Ã£o do animal na fila (o primeiro animal estÃ¡ em 0)
     * @return o animal que ocupava a posiÃ§Ã£o na fila
     * @throws IndexOutOfBoundsException se a posiÃ§Ã£o for menor que zero ou 
     * igual ou maior ao tamanho da fila
     */
    public Animal tirarDaFila(int posicao){
        return filaParaElevador.remove(posicao);
    }
    
    /**
     * Remove a primeira ocorrÃªncia do animal especificado da fila.
     * Os animais sÃ£o comparados na fila pelo mÃ©todo equals(Object o). Apenas o
     * primeiro elemeto encontrado (a ordem de busca Ã© do inÃ­cio para o fim
     * da fila) serÃ¡ removido se houver duplicatas na fila. Se a fila nÃ£o 
     * contÃ©m o animal, ela permanece inalterada.
     * @param animal animal para ser removido
     * @return true se o animal foi encontrado na fila; false caso contrÃ¡rio
     */
    public boolean tirarDaFila(Animal animal){
        return filaParaElevador.remove(animal);
    }
    
    /**
     * Remove e retorna o primeiro animal da fila (cabeÃ§a da fila).
     * Esse mÃ©todo chama o prÃ³ximo animal da fila, removendo ele quando for
     * retornado.
     * @return o animal que Ã© primeiro (cabeÃ§a) da fila
     */
    public Animal chamarProximoDaFila(){
        return filaParaElevador.poll();
    }
    
    /**
     * Devolve um vetor contendo todos os animais da fila para pegar o elevador.
     * Os animais serÃ£o retornados no vetor na mesma ordem da fila. O uso
     * desse vetor deve ser cuidadoso, pois os elementos sÃ£o referÃªncias para
     * os animais que tambÃ©m estÃ£o na fila, ou seja, modificar o estado
     * interno de um animal do vetor causa modificaÃ§Ã£o no mesmo animal na fila.
     * Recomenda-se o uso do mÃ©todo clone() em um animal antes de manipular 
     * seus dados para evitar efeito colateral.
     * @return vetor de animais na mesma ordem da fila (o animal da primeira
     * posiÃ§Ã£o da fila estarÃ¡ no Ã­ndice 0 do vetor e assim por diante)
     */
    public Animal[] checarFilaParaElevador(){
        return filaParaElevador.toArray(Animal[]::new);
    }
    
    /**
     * Retorna o tamanho atual da fila para pegar o elevador.
     * @return quantidade de animais na fila
     */
    public int consultarTamanhoDaFila(){
        return filaParaElevador.size();
    }
    
    /**
     * Coloca um animal no grupo de animais que desembarcaram no andar.
     * Esse mÃ©todo deve ser chamado pelo elevador para que um animal possa
     * sair do elevador e ser colocados junto de outros animais que desceram
     * do elevador nesse mesmo andar. 
     * @param animal animal que desembarcou (um valor null serÃ¡ ignorado)
     */
    public void desembarcar(Animal animal){
        if(animal != null){
            animaisQueDesceram.add(animal);
        }
    }
    
    /**
     * Devolve um vetor contendo todos os animais que desembarcaram nesse andar.
     * Os animais nÃ£o estarÃ£o em uma ordem definida (por exemplo, ordem em que
     * desembarcaram), pois se misturaram com os demais quando desceram. O uso
     * desse vetor deve ser cuidadoso, pois os elementos sÃ£o referÃªncias para
     * os animais que tambÃ©m estÃ£o no grupo de animais que desembarcaram, ou 
     * seja, modificar o estado interno de um animal do vetor causa modificaÃ§Ã£o 
     * no mesmo animal do grupo no andar. Recomenda-se o uso do mÃ©todo clone() 
     * em um animal antes de manipular seus dados para evitar efeito colateral.
     * @return vetor de animais sem ordem prÃ©-definida
     */
    public Animal[] checarDesembarcados(){
        return animaisQueDesceram.toArray(Animal[]::new);
    }
}
