package softwarefactory.javalessons;

/**
 * Created by James Hunter on 7/6/2016.
 */


import android.content.Intent;

import java.util.ArrayList;
import java.util.Arrays;

import static softwarefactory.javalessons.MainActivity.*;

public  class Start {

    public static void main(){
        // Insert code inside this method. This method is called when the button is pressed
            int[] number ={1,2,6,9,6,3};
            Integer [] selectionNumber ={64,25,12,22,11};
            printArray(selectionNumber);
            println();
            Integer[] result = mergeSort(selectionNumber);
            //selectionNumber(selectionNumber);
            printArray(result);

            //swap();
    }

    public  void bublleSort(int[] num){}

    public static void printArray(Integer[] num){
        for (int i = 0; i < num.length; i++){
            print(num[i] + " ");
        }
    }
    public static void swap(int[] num, int idex1, int idex2) {
        int temp = num[idex1];
        num[idex1] = num[idex2];
        num[idex2] = temp;


    }

    /*
     Start here to grab all methods used for the merge sort algorithm
     */
    private static Integer[] getleft(Integer[] num){
        Integer[]left=new Integer[num.length/2];
        for (int i = 0; i < left.length; i++) {
            left[i]=num[i];
        }
        return left;
    }
    private static boolean isOdd(Integer num){
        if (num %2==1)
            return true;
            else return false;

    }
    private static Integer[] getright(Integer[] num){
        Integer[]right;
        if (isOdd(num.length)){
            right=new Integer[num.length/2+1];
        } else {
            right = new Integer[num.length / 2];
        }
        for (int i = 0; i < right.length; i++) {
            right[i]=num[i + (num.length/2)];
        }
        return right;
    }

    public static Integer[] mergeSort(Integer[] num){
    if ( num.length == 1 )
        return num;
        Integer[] left = mergeSort(getleft(num));
        Integer[] right = mergeSort(getright(num));
        return merge(left,right);
    }

    private static Integer[] merge(Integer[] first, Integer[] second){
        ArrayList<Integer>list=new ArrayList<>();
        ArrayList<Integer>l1=new ArrayList<Integer>(Arrays.asList((first)));
        ArrayList<Integer>l2=new ArrayList<Integer>(Arrays.asList((second)));
        while (!l1.isEmpty() && !l2.isEmpty()){
            if (l1.get(0)>l2.get(0)){
                list.add(l2.remove(0));
            }else {
                list.add(l1.remove(0));
            }
        }
        while (!l1.isEmpty()) {
            list.add(l1.remove(0));
        }
        while (!l2.isEmpty()) {
            list.add(l2.remove(0));
        }
        return list.toArray(new Integer[list.size()]);
    }
    /*
        The end of the merge sort methods
     */


    public  void selectionNumber(int[] num){
        int min;
        for (int i = 0; i < 5; i++){
            min = i;
            //We think the smallest value is in index 0//
            for(int j=i+1;j<5;j++){
                if (num[j] < num[min]) {
               min = j;



                }
            }
            if (min != i)
                swap(num, i, min);
        }




    }
}
