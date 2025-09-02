import java.util.Random;

public class MaxFunction {
    public static int findMax(int[] zahlenArray) {
        int maxNumber = zahlenArray[0];
        for (int i = 1; i < zahlenArray.length; i++) {
            if (maxNumber < zahlenArray[i]) {
                maxNumber = zahlenArray[i];
            }
        }
        return maxNumber;
    }
    public static void main(String[] args) {
        Random random = new Random();
        int laenge = random.nextInt(6) + 5;
        int[] zahlenArray = new int[laenge];

        for (int i = 0; i < laenge; i++) {
            zahlenArray[i] = random.nextInt(41) + 10;
            System.out.print(zahlenArray[i] + " ");
        }
        System.out.println(" ");

        int maxNumber = findMax(zahlenArray);
        System.out.println("Die größte Zahl ist: " + maxNumber);
    }
}
