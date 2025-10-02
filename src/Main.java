import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("!Bienvenido a la aventura de la araña venenosa!");
        System.out.println("¿Cómo se llamará tu araña?");
        Scanner scanner = new Scanner(System.in);
        String nombrearanha = scanner.nextLine();
        int distanciaRecorrida = 0;
        boolean escapóConVida= false;

        System.out.println("\n" + nombrearanha + " Entra en la clase de 1DAM,con ganas de lidiar con humanos ");
        System.out.println("\n¿Donde querrá ir " + nombrearanha + "?");

        System.out.println("\nDecisión 1: ¿Qué dirección toma " + nombrearanha + "?");
        System.out.println("1. Subirse a la espalda del profesor");
        System.out.println("2. Tirarse por la ventana heroicamente");

        System.out.print("Elige (1 o 2): ");
        int decision1 = scanner.nextInt();

        if (decision1 == 1) {
            distanciaRecorrida += 2;
            System.out.println(nombrearanha + " Trepa por la espalda del profesor sigilosamente,ha subido 2 metros.");
        } else {
            distanciaRecorrida += 8;
            System.out.println(nombrearanha + " Se tira y con la mala suerte se cae cerca de la carretera ");
        }
        System.out.println("\nDecisión 2: " + nombrearanha + " es avistada por un profesor malhumorado ");
        System.out.println("1. Intentar sobrevivir");
        System.out.println("2. Afrontar al profesor enfadado");
        System.out.print("Elige (1 o 2): ");
        int decision2 = scanner.nextInt();

        boolean herida = false;
        if (decision2 == 1) {
            distanciaRecorrida += 1;
            System.out.println(nombrearanha + " Escapa del profesor pero tendrá que decidir si cruzar la carretera o no ");
        } else {
            distanciaRecorrida += 0;
            herida = true;
            System.out.println(nombrearanha + " Se lanza al ataque, pero recibe un golpe de zapato.");
        }
        System.out.println("\nDecisión 3: ");
        System.out.println("1. No cruzar la carretera y esconderse debajo de cualquier coche. ");
        System.out.println("2. Evitar la pelea y seguir su rumbo (cruzar carretera).");
        System.out.print("Elige (1 o 2): ");
        int decision3 = scanner.nextInt();

        if (decision3 == 1) {
            distanciaRecorrida += 1;
            if (!herida) {
                escapóConVida = true;
                System.out.println(nombrearanha + " Se queda escondida y con la buena suerte de cazar una mosca para su cena. ");
            } else {
                System.out.println(nombrearanha + " Le pasa por delante un señor fumando en un tractor, con la mala suerte de que se le cae el cigarro a ella en la cabeza.");
            }
        } else {
            distanciaRecorrida += 2;
            if (!herida) {
                System.out.println(nombrearanha + " Ha sobrevivido el dia, con mucha suerte de por medio. ");
                escapóConVida = true;
            } else {
                System.out.println(nombrearanha + " Quemada y exhausta es arrollada por un camión al intentar escapar del fuego del cigarro. ");
            }
        }
        System.out.println("\n📜 FIN DE LA AVENTURA 📜");
        if (escapóConVida) {
            System.out.println("¡" + nombrearanha + " ha sobrevivido a su aventura en la clase de 1DAM!");
        } else {
            System.out.println("La historia de " + nombrearanha + " ha terminado antes de lo previsto ...");
        }

        System.out.println("\n Estadísticas finales:");
        System.out.println("Nombre de la araña: " + nombrearanha);
        System.out.println("Distancia total recorrida: " + distanciaRecorrida + " metros");
        System.out.println("¿Resultó herida? " + (herida ? "Sí" : "No"));
        System.out.println("¿Escapó con vida? " + (escapóConVida ? "Sí" : "No"));

        scanner.close();
    }
}
