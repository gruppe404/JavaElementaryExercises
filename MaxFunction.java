import java.util.Random;

// Please implement the function findMax().
class MaxFunction {
    public static void main(String[] args) {
        int[] unorderedArray= getRandomArray(20);
        int maxNumber= findMax(unorderedArray);
        System.out.println("The maximum of the follworing numbers:");
        for (int i=0;i<unorderedArray.length;i++) {
            System.out.print(unorderedArray[i]);
            if (i<unorderedArray.length-1) {
                System.out.print(", ");
            } else {
                System.out.println("");
            }
        }
        System.out.println("is: "+maxNumber);
    }
    /**
     * This function shall find the maximum value in an array of
     * integers. 
     * @array: any array of integers, of any length.
     * @return: The maxiumum value in the input array.
     */
    public static int findMax(int[] array) {
        // .... implement finding the maxium of the array and return it
        return(-1);

    }

    public static int[] getRandomArray(int maxlength) {
        Random randgen= new Random(System.currentTimeMillis());
        int len= randgen.nextInt(maxlength);
        int maxheight= 50* maxlength;
        int[] randomArray= new int[len];
        for (int i=0;i<len;i++) {
            randomArray[i]= randgen.nextInt(maxheight);
        }
        return(randomArray);
    }
}
