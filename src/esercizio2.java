import java.util.Scanner;


public class esercizio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci la prima stringa");
        String firstString = scanner.nextLine();
        System.out.println("Hai inserito " + firstString);
        System.out.println("Inserisci la seconda stringa");
        String secondString = scanner.nextLine();
        System.out.println("Hai inserito " + secondString);
        System.out.println("Inserisci la terza stringa");
        String thString = scanner.nextLine();
        System.out.println("Hai inserito " + thString);

        String result = firstString.concat(secondString).concat(thString);

        System.out.println("La stringa concatenata è: " + result);

        scanner.close();

    }
}


