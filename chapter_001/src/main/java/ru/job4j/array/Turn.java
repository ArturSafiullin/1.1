package ru.job4j.array;

/**
 * Created by artursafiullin on 2017-03-18.
 */
public class Turn {
    public int[] back(int[] array) {


        for (int index = 0; index <= array.length; index++){
            if(index == 0){
                return array;
            }
        }
            for (String name : names) {
                System.out.println(name);
            }

    }
}


//int[] array = new int[]{back.length};
//String[] values = new String[10];



        /*if (array == null || array.length <= 1) {
            return array;
        }
        for ( int i = 0; i < array.length / 2; i++) {
            int temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;
        }
        return back(array);
        //System.out.println("Reversed" + array);

    }//return;
}


/*import java.util.Arrays;

/**
 * Java Program to demonstrate how to reverse an array in place.
 */
/*public class ArrayReversalDemo {

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7};
        reverse(numbers);
    }

    /**
     * reverse the given array in place * @param input
     *//*
    public static void reverse(int[] input) {
        System.out.println("original array : " + Arrays.toString(input));
        // handling null, empty and one element array
        if (input == null || input.length <= 1) {
            return;
        }
        for (int i = 0; i < input.length / 2; i++) {
            int temp = input[i];
            // swap numbers
            input[i] = input[input.length - 1 - i];
            input[input.length - 1 - i] = temp;
        }
        System.out.println("reversed array : " + Arrays.toString(input));
