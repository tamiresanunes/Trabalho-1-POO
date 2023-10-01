package entidades;

public class Peixe extends Animal {
    public int PACIENCIA_MAXIMA = 60;
    private String corDasEscamas;
//construtor com os atributos próprios da classe e com os herdados da superclasse, sendo chamados através do super
    public Peixe(String corDasEscamas, int id, String nome, String especie, int andarDesejado,
            int peso, int temperaturaIdeal) {
        super(id, nome, especie, andarDesejado, peso, temperaturaIdeal);
        this.corDasEscamas = corDasEscamas;
    }

    public String getCorDasEscamas() {
        return corDasEscamas;
    }
//método para o peixe nadar
    public String nadarPeixe() {
        return "nadando";
    }
    // Método hashcode, que começa com a atribuição do número primo 31 para calcular
    // o hashcode, depois temos o trecho que chama o método hashcode da superclasse,
    // O resultado desse método é usado como base para calcular o código hash do
    // objeto atual. Isso é útil para garantir que o código hash leve em
    // consideração as propriedades da superclasse. No geral esse método combina o
    // hash da superclasse
    // com o valor de PACIENCIA_MAXIMA e corDasEscamas, multiplicando por um número primo para
    // calcular um código hash único para o objeto atual.
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = super.hashCode();
        result = prime * result + ((corDasEscamas == null) ? 0 : corDasEscamas.hashCode());
        result = prime * result + PACIENCIA_MAXIMA;
        return result;
    }
    // Método que verifica se dois objetos são iguais, primeiro ele verifica se o
    // objeto é diferente de nullo
    // Depois ele verifica se o objeto passado como argumento é o mesmo objeto no
    // qual o método esta sendo chamado
    // Depois ele verifica se o objeto passado é uma instância da classe Peixe ou
    // de uma subclasse dela
    // Se não for retorna false indicando que os objetos são de tipos diferentes, ou
    // seja, não são iguais
    // Chama o método equals da superclasse e
    // verifica se os objetos são iguais de acordo com a implementação na superclasse.
    // Depois ele converte o objeto passado como argumento para o tipo Peixe
    // Depois compara os atributos do objeto atual com os atributos de outroPeixe,
    // para ver se eles são iguais
    @Override
    public boolean equals(Object outro){
        if (outro == null) {
            return false; 
        }
        if(this == outro){
            return true;
        }
        if (! (outro instanceof Peixe)) {
            return false;
            
        }
        if (! super.equals(outro)) {
            return false;
        }
        
        Peixe outroPeixe = (Peixe) outro;
        if (this.corDasEscamas == outroPeixe.corDasEscamas && this.PACIENCIA_MAXIMA == outroPeixe.PACIENCIA_MAXIMA) {
            return true;
            
        }else{
            return false;
        }

    }

    @Override
    public String toString() {
        return "Peixe ID: " + getId() + ", Nome: " + getNome() + ", Especie: " + getEspecie() + ", Andar Desejado: "
                + getAndarDesejado() + ", Peso: " + getPeso() + "e Temperatura Ideal: " + getTemperaturaIdeal()
                + "e, Cor Das Escamas: " + getCorDasEscamas();
    }

}
