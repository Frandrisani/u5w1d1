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
        String[] array = {"Elemento 1", "Elemento 2", "Elemento 3", "Elemento 4", "Elemento 5"};
        String g = "Elemento 6";
        String[] nuovoArray = inserisciInArray(array, g);
        for (int i = 0; i < nuovoArray.length; i++) {
            System.out.println("Elemento " + (i + 1) + ": " + nuovoArray[i]);
        }
    }



    public static int molt(int num1, int num2) {
        return num1 * num2;
    }

    public static String conc(String x, int y) {
        return x + y;
    }

    public static String[] inserisciInArray(String[] x, String y) {
        String[] arrayDiStringhe = new String[6];
        for (int i = 0; i < 3; i++) {
            arrayDiStringhe[i] = x[i];
        }

        arrayDiStringhe[3] = y;

        for (int i = 4; i < arrayDiStringhe.length; i++) {
            arrayDiStringhe[i] = x[i-1];
        }

        return arrayDiStringhe;
    }



}
