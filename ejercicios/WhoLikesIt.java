import java.util.ArrayList;

/*
 * crear funcion que muestre cuantas personas dan like.
 * dependiendo de cuantas personas den like y quienes,
 * se debe imprimir un texto. Ejemplo:
 * 
 * []                                -->  "no one likes this"
["Peter"]                         -->  "Peter likes this"
["Jacob", "Alex"]                 -->  "Jacob and Alex like this"
["Max", "John", "Mark"]           -->  "Max, John and Mark like this"
["Alex", "Jacob", "Mark", "Max"]  -->  "Alex, Jacob and 2 others like this"
 */
public class WhoLikesIt {

    public static void showMessage(ArrayList<String> people) {
        int tamano = people.size();
        if (tamano == 0) {
            System.out.println("no one likes this");
        } else if (tamano == 1) {
            System.out.println(people.get(0)+" likes this");
        } else if (tamano == 2) {
            System.out.println(people.get(0)+" And "+people.get(1)+" like this");
        } else if (tamano == 3) {
            System.out.println(people.get(0)+", "+people.get(1)+" and "+people.get(2)+" like this");
        } else if (tamano == 4) {
            System.out.println(people.get(0)+", "+people.get(1)+" and 2 others like this");
        } else if (tamano > 4) {
            int others = tamano - 2;
            System.out.println(people.get(0)+", "+people.get(1)+" and "+others+" others like this");
        }
    }

    public static void main(String[] args) {
        ArrayList<String> people = new ArrayList<String>();
        // agregamos personas al arraylist.

        people.add("Peter");
        people.add("Jacob");
        people.add("Jonh");
        people.add("Erick");
        people.add("El Bicho");

        showMessage(people);

    }

}
