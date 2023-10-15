package entidades;

public class Aplicativo {
/** 
 * @param args
 */
//classe feita para testar o funcionamento dos métodos de HashCode e Equals, pode ser apagada posteriormente
    public static void main(String[] args) {
        Animal animal = new Animal(12, "caralho", "mamifero", 5, 15, 40);
        Animal animal2 = new Animal(14, "bixo", "reptil", 4, 25, 10);
        Ave ave1 = new Ave(5, "andorinha", "passaro", 2, 5, 10, "azul");
        Ave ave2 = new Ave(6, "pardal", "passaro", 4, 2, 10, "azul");

        int hashCodeanimal = animal.hashCode();
        int hashCodeanimal2 = animal2.hashCode();

        int hashCodeave1 = ave1.hashCode();
        int hashCodeave2 = ave2.hashCode();

        System.out.println("HashCode do animal:" + hashCodeanimal);
        System.out.println("HashCode do animal2:" + hashCodeanimal2);

        System.out.println("HashCode do ave1:" + hashCodeave1);
        System.out.println("HashCode do ave2:" + hashCodeave2);

        if (animal.equals(animal2)) {
            System.out.println("Eles são iguais");
        } else {
            System.out.println("Eles não são iguais");
        }

        if (ave1.equals(ave2)) {
            System.out.println("Eles são iguais");
        } else {
            System.out.println("Eles não são iguais");
        }

    }
}
