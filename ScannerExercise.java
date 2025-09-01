import java.util.Scanner;
public class ScannerExercise {
    public static void ScannerExercise(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] d = new int[1000];
        System.out.print("Geben Sie Ihre erste Zahl ein: ");
        int zahl1 = sc.nextInt(); // Integer lesen
        System.out.print("Geben Sie Ihre zweite Zahl ein: ");
        int zahl2 = sc.nextInt();
        System.out.print("Geben Sie Ihre dritte Zahl ein: ");
        int zahl3 = sc.nextInt();
        System.out.print("Geben Sie Ihre vierte Zahl ein: ");
        int zahl4 = sc.nextInt();
        System.out.print("Geben Sie Ihre fünfte Zahl ein: ");
        int zahl5 = sc.nextInt();
        System.out.print("Geben Sie Ihre sechste Zahl ein: ");
        int zahl6 = sc.nextInt();
        sc.close();
        d[0] = zahl1;
        d[1] = zahl2;
        d[2] = zahl3;
        d[3] = zahl4;
        d[4] = zahl5;
        d[5] = zahl6;
        int max = 0;
        if (max < d[0]) {
            max = d[0];
        }
        if (max < d[1]) {
            max = d[1];
        }
        if (max < d[2]) {
            max = d[2];
        }
        if (max < d[3]) {
            max = d[3];
        }
        if (max < d[4]) {
            max = d[4];
        }
        if (max < d[5]) {
            max = d[5];
        }
        System.out.println("Die größte Zahl ist: " + max);
    }
    public static void maxOfNumbers() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Wie viele Zahlen willst du eingeben: ");
        int numberOfInts= sc.nextInt();
        int maxNumber= 0;
        for (int i=0;i<=numberOfInts-1;i++) {
            System.out.print("Zahl Nummer "+(i+1)+" bitte: ");
            int inputNumber= sc.nextInt();
            if (maxNumber< inputNumber) {
                maxNumber= inputNumber;
            }
        }
        System.out.println("Das Maximum deiner Zahlen ist "+maxNumber);
    }
    public static void main(String[]args) {
        maxOfNumbers();
    }
}
