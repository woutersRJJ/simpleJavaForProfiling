package Exercise01;

import java.util.ArrayList;
import java.util.Scanner;

public class RandomNumbers {
    Scanner sc = new Scanner(System.in);

    public void go() {
        while (true) {
            int[] arrayOfRandomNumbers = getArrayOfRandomNumbers();
        }
    }

    private int[] getArrayOfRandomNumbers() {
        int[] numbers = new int[10000000];
        System.out.println("how many numbers in this array? ");
        int length = sc.nextInt();
        for (int i = 0; i < length; i++) {
            numbers[i] = (int) (Math.random() * 100);
        }
        printArrayV1(numbers);
        printArrayV2(numbers);
        return numbers;
    }

    private void printArrayV1(int[] numbers) {
        System.out.println("new array: "+ numbers);
    }

    private void printArrayV2(int[] numbers) {
        for (int number: numbers)
            System.out.print(number+", ");
        System.out.println("");
    }

}
