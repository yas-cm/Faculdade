import java.util.Scanner;
public class Console {

    private static Scanner leitor = new Scanner(System.in);

    public static int lerInt(){

        int valor = leitor.nextInt();
        leitor.nextLine(); // Clear buffer
        return valor;

    }
    public static String lerString(){

        return leitor.nextLine();

    }

    public static char lerChar(){

        char valor = leitor.next().charAt(0);
        leitor.nextLine();
        return valor;
    }
}
