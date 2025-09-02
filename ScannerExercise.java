import java.util.Scanner;
public class ScannerExercise {
    public static void main(String[] args) {
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
}
