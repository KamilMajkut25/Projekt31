import java.util.Scanner;

public class Main 
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj liczbę gwiazdek: ");
        int liczbaGwiazdek = scanner.nextInt();

        for (int i = 1; i <= liczbaGwiazdek; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        scanner.close();
    }
}
