import static java.lang.Math.sqrt;

public class esercizio3 {
    public static void main(String[] args) {
        double perimetro = perimetroRettangolo(3,20);
        System.out.println("Il perimetro del rettangolo è: " + perimetro + "cm");

        String pariODispari = pariDispari(5);
        System.out.println("Il numero è: " + pariODispari );

        double areaTriangolo = perimetroTriangolo(50,30,20);
        System.out.println("L'area del triangolo è " + areaTriangolo + "cm2");
    }

    public static double perimetroRettangolo(double x, double y ){
        return (x+y)*2;
    }
    public static String pariDispari(int x){
        if(x%2==0){
            return "Pari";
        }else{
            return "Dispari";
        }
    }

    public static double perimetroTriangolo(double x, double y, double z) {
        double p = (x+y+z)/2;
        return Math.sqrt(p*(p-x)*(p-y)*(p-z));
    }
}
