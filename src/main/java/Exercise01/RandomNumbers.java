package Exercise01;

import java.util.ArrayList;
import java.util.Scanner;

public class RandomNumbers {
    ArrayList<int[]> arrayOfAllArrays = new ArrayList<int[]>();
    Scanner sc = new Scanner(System.in);

    public void go() {
        while (true) {
            int[] arrayOfRandomNumbers = getArrayOfRandomNumbers();

            arrayOfAllArrays.add(arrayOfRandomNumbers);
            //System.out.println("list of all arrays: "+ listOfAllArrays);
        }
    }

    private int[] getArrayOfRandomNumbers() {
        //ArrayList<Integer> numbers = new ArrayList<>();
        int[]numbers=new int[50000000];
        System.out.println("how many numbers in this array? ");
        int length = sc.nextInt();
        for (int i = 0; i < length; i++) {
            numbers[i] = (int) (Math.random() * 100);
        }
        //System.out.println("new array: "+ numbers);
        return numbers;
    }

}

