public class Main {

    public static void main(String[] args) {
        //  ejercicio if
        int numeroIf = 1;

        if(numeroIf > 0) {
            System.out.println("La variable 'numeroIf' " + numeroIf + " es Positiva.");
        }
        else if(numeroIf < 0) {
            System.out.println("La variable 'numeroIf' " + numeroIf + " es Negativa.");
        } else {
            System.out.println("La variable 'numeroIf' es Neutro.");
        }

        // Ejercicio while
        int numeroWhile = 1;

        while(numeroWhile < 3) {
            numeroWhile++;
            System.out.println("La variable 'numeroWhile' es: " + numeroWhile + ".");
        }

        // Ejercicio do-while
        int numeroDoWhile = 3;

        do {
            numeroDoWhile++;
            System.out.println("La variable 'numeroDoWhile' es " + numeroDoWhile + ".");
        }while(numeroDoWhile < 3);

        // ejercicio for
        for(int numeroFor = 0; numeroFor <= 3; numeroFor++) {
            System.out.println("La variable 'numeroFor' es " + numeroFor + ".");
        }

        // Ejercicio switch
        String estacion = "Invierno";

        switch (estacion) {
            case "Verano":
                System.out.println("Estamos en verano!");
                break;
            case "Otoño":
                System.out.println("Estamos en otoño!");
                break;
            case "Invierno":
                System.out.println("Estamos en invierno!");
                break;
            case "Primavera":
                System.out.println("Estamos en primavera!");
                break;
            default:
                System.out.println("Estacion inválida");
        }
    }
}