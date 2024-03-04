public class esercizio1 {
    public static void main(String[] args) {
        System.out.println("Esercizio 1a");
        int risultato = molt(2, 5);
        System.out.println("La moltiplicazione è: " + risultato);

        System.out.println("Esercizio 1b");
        String inputString = "Ciao";
        int inputInt = 2;
        String risultatoConcatenazione = conc(inputString, inputInt);
        System.out.println("La stringa concatenata è: " + risultatoConcatenazione);

        System.out.println("Esercizio 1c");
    }



    public static int molt(int num1, int num2) {
        return num1 * num2;
    }

    public static String conc(String x, int y) {
        return x + y;
    }

    public static String inserisciInArray(String[] x, String y) {
        return x + y;
    }



}
