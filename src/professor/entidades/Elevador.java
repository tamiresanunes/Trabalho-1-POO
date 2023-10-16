package professor.entidades;


import entidades.Animal;
import java.util.HashSet;

/**
 * Classe que representa o elevador com suas caracterÃ­sticas.
 * <br><br>
 * <strong>NÃ£o mexa aqui!!!</strong>
 * 
 * @author Jean Cheiran
 * @version 1.1
 */
public class Elevador {
    
    /**
     * Limite de peso do elevador.
     * Quando esse valor Ã© ultrapassado, o elevador nÃ£o deve se movimentar.
     */
    public final int LIMITE_DE_PESO = 2500; //em quilos
    
    private HashSet<Animal> animais;
    private int andar; //0 Ã© o tÃ©rreo
    private int temperaturaDoArCondicionado; //em graus Celsius
    private boolean cheioDeAgua;
    
    /**
     * Construtor padrÃ£o do elevador.
     * Ele sempre comeÃ§a vazio, sem Ã¡gua dentro, com ar-condicionado em
     * 20 graus e no andar 0 (tÃ©rreo).
     */
    public Elevador(){
        animais = new HashSet<Animal>();
        andar = 0;
        temperaturaDoArCondicionado = 20;
        cheioDeAgua = false;
    }

    /**
     * Inclui um animal no elevador.
     * O animal nÃ£o Ã© removido de qualquer outra estrutura que faÃ§a parte 
     * quando entra no elevador.
     * @param animal animal que quer embarcar (um valor null serÃ¡ ignorado)
     */
    public void embarcar(Animal animal) {
        System.out.println("Embarque no andar "+this.andar+": "+animal);
        if(animal == null){
            return;
        }
        animais.add(animal);
    }

    /**
     * Remove um animal do elevador e coloca ele no andar que desceu.
     * NÃ£o hÃ¡ qualquer verificaÃ§Ã£o nesse mÃ©todo.
     * @param animal animal desembarcando
     * @param andar andar que estÃ¡ descendo
     */
    public void desembarcar(Animal animal, Andar andar) {
        System.out.println("Desembarque no andar "+this.andar+": "+animal);
        andar.desembarcar(animal);
        animais.remove(animal);
    }

    /**
     * Devolve um vetor contendo todos os animais do elevador.
     * Os animais nÃ£o estarÃ£o em uma ordem definida (por exemplo, ordem em que
     * entraram), pois se misturaram dentro do elevador para se acomodar. O uso
     * desse vetor deve ser cuidadoso, pois os elementos sÃ£o referÃªncias para
     * os animais que tambÃ©m estÃ£o no elevador, ou seja, modificar o estado
     * interno de um animal do vetor causa modificaÃ§Ã£o no mesmo animal do
     * elevador. Recomenda-se o uso do mÃ©todo clone() em um animal antes de
     * manipular seus dados para evitar efeito colateral.
     * @return vetor de animais sem ordem garantida
     */
    public Animal[] checarAnimaisNoElevador() {
        return animais.toArray(Animal[]::new);
    }

    /**
     * Retorna o andar no qual o elevador estÃ¡ parado.
     * Qualquer uso de subir() ou descer() movimenta imediatamente o elevador,
     * entÃ£o esse mÃ©todo Ã© bastante sensÃ­vel.
     * @return andar em que o elevador estÃ¡ no momento
     */
    public int getAndar(){
        return andar;
    }
    
    /**
     * Faz o elevador subir um andar imediatamente.
     * O tempo Ã© relativo na Arca de NoÃ©, entÃ£o subir com o elevador tem efeito
     * imediato. A verificaÃ§Ã£o nesse mÃ©todo lanÃ§a uma exceÃ§Ã£o se o elevador
     * tentar subir para um andar invÃ¡lido (acima do limite da arca - andar 4).
     * AlÃ©m disso, o elevador nÃ£o vai subir se o peso dos animais dentro dele
     * exceder a capacidade mÃ¡xima do elevador.
     * @throws RuntimeException se o elevador tenta passar do Ãºltimo andar
     */
    public void subir() {
        if(andar < Arca.QUANTIDADE_DE_ANDARES_NA_ARCA - 1){
            int peso = 0;
            for(Animal animalNoElevador : animais){
                peso += animalNoElevador.getPeso();
            }
            if(peso <= LIMITE_DE_PESO){
                andar++;
            }
        }else{
            throw new RuntimeException("Elevador no ultimo andar e tentando subir");
        }
    }

    /**
     * Faz o elevador descer um andar imediatamente.
     * O tempo Ã© relativo na Arca de NoÃ©, entÃ£o descer com o elevador tem efeito
     * imediato. A verificaÃ§Ã£o nesse mÃ©todo lanÃ§a uma exceÃ§Ã£o se o elevador
     * tentar descer para um andar invÃ¡lido (abaixo do tÃ©rreo - andar 0).
     * AlÃ©m disso, o elevador nÃ£o vai descer se o peso dos animais dentro dele
     * exceder a capacidade mÃ¡xima do elevador.
     * @throws RuntimeException se o elevador tenta descer abaixo do tÃ©rreo
     */
    public void descer() {
        if(andar > 0){
            int peso = 0;
            for(Animal animalNoElevador : animais){
                peso += animalNoElevador.getPeso();
            }
            if(peso <= LIMITE_DE_PESO){
                andar--;
            }
        }else{
            throw new RuntimeException("Elevador no terreo e tentando descer");
        }
    }
    
    /**
     * Retorna se o elevador estÃ¡ cheio d'Ã¡gua.
     * @return true se estiver inundado; false caso contrÃ¡rio
     */
    public boolean isCheioDeAgua() {
        return cheioDeAgua;
    }

    /**
     * Enche o elevador d'Ã¡gua imediatamente.
     * O tempo Ã© relativo na Arca de NoÃ©, entÃ£o inundar o elevador tem efeito
     * imediato. Se o elevador jÃ¡ estiver cheio, o mÃ©todo nÃ£o faz nada.
     */
    public void encher() {
        cheioDeAgua = true;
    }

    /**
     * Drena a Ã¡gua do elevador imediatamente.
     * O tempo Ã© relativo na Arca de NoÃ©, entÃ£o drenar o elevador tem efeito
     * imediato. Se o elevador jÃ¡ estiver vazio, o mÃ©todo nÃ£o faz nada.
     */
    public void drenar() {
        cheioDeAgua = false;       
    }
    
    /**
     * Retorna a temperatura atual do ar-condicionado.
     * @return temperatura do ar-condicionado em graus Celsius
     */
    public int getTemperaturaDoArCondicionado(){
        return temperaturaDoArCondicionado;
    }
    
    /**
     * Modifica imediatamente a temperatura do ar-condicionado.
     * O ar-condicionado funciona entre 0 e 40 graus Celsius. Se a tentativa
     * de mudanÃ§a estÃ¡ dentro da faixa de funcionamento, ele altera o valor
     * e retorna um indicador de sucesso. Se a tentativa estÃ¡ fora da faixa
     * de funcionamento, ela nÃ£otem efeito e retorna um indicador de fracasso.
     * @param novaTemperatura em graus Celsius entre 0 graus e 40 graus
     * @return true se conseguiu modificar a temperatura; false caso contrÃ¡rio
     */
    public boolean setTemperaturaDoArCondicionado(int novaTemperatura){
        if(novaTemperatura >= 0 && novaTemperatura <= 40){
            temperaturaDoArCondicionado = novaTemperatura;
            return true;
        }
        return false;
    }
}
