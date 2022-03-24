package Exercise01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class RandomNumbers {
    Scanner sc = new Scanner(System.in);

    public void go() {
        while (true) {
            int[] arrayOfRandomNumbers = getArrayOfRandomNumbers();
        }
    }

    private int[] getArrayOfRandomNumbers() {
        //int[] numbers = new int[Integer.MAX_VALUE-1];
        int[] numbers = new int[50000000];

        System.out.println("how many numbers in this array? ");
        int length = sc.nextInt();
        for (int i = 0; i < length; i++) {
            numbers[i] = (int) (Math.random() * 100);
        }
        //System.out.println("new array: "+ numbers);
        System.out.println(Arrays.toString(numbers));
        return numbers;
    }

}
