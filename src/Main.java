import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("¡Bienvenido a la aventura de la araña venenosa!");
        System.out.println("¿Cómo se llamará tu araña?");
        Scanner scanner = new Scanner(System.in);
        String nombrearanha = scanner.nextLine();
        int distanciaRecorrida = 0;
        boolean escapóConVida = false;
        boolean herida = false;

        System.out.println("\n" + nombrearanha + " entra en la clase de 1DAM, con ganas de lidiar con humanos.");
        System.out.println("\n¿Dónde querrá ir " + nombrearanha + "?");


        System.out.println("\nDecisión 1: ¿Qué dirección toma " + nombrearanha + "?");
        System.out.println("1. Subirse a la espalda del profesor");
        System.out.println("2. Tirarse por la ventana heroicamente");

        int decision1 = 0;
        while (decision1 != 1 && decision1 != 2) {
            System.out.print("Elige (1 o 2): ");
            decision1 = scanner.nextInt();
            if (decision1 != 1 && decision1 != 2) {
                System.out.println("Opción inválida. Debes elegir 1 o 2.");
            }
        }

        if (decision1 == 1) {
            distanciaRecorrida += 2;
            System.out.println(nombrearanha + " trepa por la espalda del profesor sigilosamente, ha subido 2 metros.");
        } else {
            distanciaRecorrida += 8;
            System.out.println(nombrearanha + " se tira y con la mala suerte se cae cerca de la carretera.");
        }


        System.out.println("\nDecisión 2: " + nombrearanha + " es avistada por un profesor malhumorado");
        System.out.println("1. Intentar sobrevivir");
        System.out.println("2. Afrontar al profesor enfadado");

        int decision2 = 0;
        while (decision2 != 1 && decision2 != 2) {
            System.out.print("Elige (1 o 2): ");
            decision2 = scanner.nextInt();
            if (decision2 != 1 && decision2 != 2) {
                System.out.println("Opción inválida. Debes elegir 1 o 2.");
            }
        }

        if (decision2 == 1) {
            distanciaRecorrida += 1;
            System.out.println(nombrearanha + " escapa del profesor pero tendrá que decidir si cruzar la carretera o no.");
        } else {
            herida = true;
            System.out.println(nombrearanha + " se lanza al ataque, pero recibe un golpe de zapato.");
        }


        System.out.println("\nDecisión 3:");
        System.out.println("1. No cruzar la carretera y esconderse debajo de cualquier coche");
        System.out.println("2. Evitar la pelea y seguir su rumbo (cruzar carretera)");

        int decision3 = 0;
        while (decision3 != 1 && decision3 != 2) {
            System.out.print("Elige (1 o 2): ");
            decision3 = scanner.nextInt();
            if (decision3 != 1 && decision3 != 2) {
                System.out.println("Opción inválida. Debes elegir 1 o 2.");
            }
        }

        if (decision3 == 1) {
            distanciaRecorrida += 1;
            if (!herida) {
                escapóConVida = true;
                System.out.println(nombrearanha + " se queda escondida y con la buena suerte de cazar una mosca para su cena.");
            } else {
                System.out.println(nombrearanha + " le pasa por delante un señor fumando en un tractor, con la mala suerte de que se le cae el cigarro a ella en la cabeza.");
            }
        } else {
            distanciaRecorrida += 2;
            if (!herida) {
                escapóConVida = true;
                System.out.println(nombrearanha + " ha sobrevivido el día, con mucha suerte de por medio.");
            } else {
                System.out.println(nombrearanha + " quemada y exhausta es arrollada por un camión al intentar escapar del fuego del cigarro.");
            }
        }

        System.out.println("\n📜 FIN DE LA AVENTURA 📜");
        if (escapóConVida) {
            System.out.println("¡" + nombrearanha + " ha sobrevivido a su aventura en la clase de 1DAM!");
        } else {
            System.out.println("La historia de " + nombrearanha + " ha terminado antes de lo previsto...");
        }

        System.out.println("\nEstadísticas finales:");
        System.out.println("Nombre de la araña: " + nombrearanha);
        System.out.println("Distancia total recorrida: " + distanciaRecorrida + " metros");
        System.out.println("¿Resultó herida? " + (herida ? "Sí" : "No"));
        System.out.println("¿Escapó con vida? " + (escapóConVida ? "Sí" : "No"));

        scanner.close();
    }
}
