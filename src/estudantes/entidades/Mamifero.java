package entidades;

/**
 * Classe Mamífero que é um tipo de Animal
 */
public abstract class Mamifero extends Animal {
    /**
     * Atributo próprio de maífero
     */
    private boolean peludo;

    /**
     * Construtor completo de Mamífero
     * Todos os atributos são passados como parâmetros
     * 
     * @param id
     * @param nome
     * @param especie
     * @param andarDesejado
     * @param peso
     * @param temperaturaIdeal
     * @param peludo
     */
    public Mamifero(int id, String nome, String especie, int andarDesejado, int peso, int temperaturaIdeal,
            boolean peludo) {
        super(id, nome, especie, andarDesejado, peso, temperaturaIdeal);
        this.peludo = peludo;

    }

    /**
     * Retorna se o mamífero é peludo ou não
     * 
     * @return falso ou verdadeiro
     */
    public Boolean getPeludo() {
        return false;

    }

    /**
     * Retorna se o o mamífero é peludo
     * 
     * @return peludo
     */
    public boolean isPeludo() {
        return peludo;
    }

}
