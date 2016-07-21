package softwarefactory.javalessons;

/**
 * Created by James Hunter on 7/6/2016.
 */


import static softwarefactory.javalessons.MainActivity.*;

public class Start {

    public static void main(){
        // Insert code inside this method. This method is called when the button is pressed
            int[] number ={1,2,6,9,6,3};

            printArray(number);
            swap(number);

            //swap();
    }
    public static void printArray(int[] num){
        for(int i = 0; i < num.length; i++){
            print(num[i]);

        }
        println();
    }

    public static void swap(int[] num){
        int temp=0;
        for(int i = 0; i< num.length-1;i++){

             temp = num[i];
            num[i]=num[i+1];
            num[i+1] = temp;

            printArray(num);

        }
        println("\nthe swapped array");
        printArray(num);
    }

}
