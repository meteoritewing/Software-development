package main.java;

public class App {
    public static void main(String args[]){


        int[] array = {70,61,72,83,38};
        int[] sortvalue = BubbleSort.bubbleSort(array);


        for(int i=0;i< array.length;i++){
            System.out.print(sortvalue[i] + ", ");
        }



    }
}
