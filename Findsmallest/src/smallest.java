import java.util.Scanner;

public class smallest  {

    public static void main(String[] args) {
        //Create the Scanner object for user input
        Scanner sc = new Scanner(System.in);

        //Request the number of items to process
        System.out.print("Introduce la cantidad de números a comparar: ");
        int totalNumeros = sc.nextInt();

        //Variable to store the smallest number
        int numeroMinimo = obtenerNumeroMaximoPosible();

        //We process each number and update the minimum
        System.out.println("Introduce los " + totalNumeros + " números:");
        for (int i = 0; i < totalNumeros; i++) {
            int num = sc.nextInt();
            numeroMinimo = obtenerMenor(numeroMinimo, num);
        }

        // Print the result
        System.out.println("El número más pequeño es: " + numeroMinimo);

        //Close the scanner
        sc.close();
    }

    //Method that returns the maximum possible value for an integer
    private static int obtenerNumeroMaximoPosible() {
        return Integer.MAX_VALUE;
    }

    //Method for comparing two numbers and returning the smaller one
    private static int obtenerMenor(int num1, int num2) {
        return (num1 < num2) ? num1 : num2;
    }
}