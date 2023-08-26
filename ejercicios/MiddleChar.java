import java.util.Scanner;

public class MiddleChar {

    // Clase ConvertirArreglo fuera de la clase principal
    public static class Caracter {
        private String palabra;
        public int i;

        public Caracter(String palabra) {
            this.palabra = palabra;

        }

        public void knowIfIsPair() {
            if (palabra.length() % 2 != 0) {
                System.out.println("Es impar");

            } else {
                System.out.println("Es par");

            }
        }

        public void imprimeCharacter() {
            if (palabra.length() % 2 != 0) {
                System.out.println(palabra.charAt((palabra.length() - 1) / 2));

            } else {
                System.out.println(palabra.charAt((palabra.length()/ 2)-1));
                System.out.print(palabra.charAt(palabra.length()/ 2));

            }
        }
        

    }

    
        public static void main(String[] args) {
            Scanner entrada = new Scanner(System.in);
            System.out.println("Ingrese palabra");
            String palabra = entrada.nextLine();
            Caracter test = new Caracter(palabra);
            test.knowIfIsPair();
            test.imprimeCharacter();

        }

}
