/*
This example has no user interface. The array of numbers 
is hard coded in the program. This detemines the maximum of a list
number list. 

When you want to change the number list, than you have to edit this
file and you have to recompile it.
 */
class FindMaximumExercise {
    public static void main(String[] args) {
        var c= 40;
        var numbers= new int[]{4,5, 0, 1 , 78,9,9,110,14};
        int max=0 ;
        int maxidx= 0;
        if (numbers[0]>numbers[1]) {
            max= numbers[0];
        } else {
            max= numbers[1];
        }
        for (var i=2;i<numbers.length;i++){
            if (max<numbers[i]) {
                max= numbers[i];
            }
        }
        System.out.println("The maximum of the numbers ");
        for (int i=0;i<numbers.length;i++)
            System.out.print(numbers[i]+" ");
        System.out.println("\nis: "+max);
    }
}
