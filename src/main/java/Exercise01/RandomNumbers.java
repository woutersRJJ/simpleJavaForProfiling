package Exercise01;

import java.util.ArrayList;
import java.util.Scanner;

public class RandomNumbers {
    Scanner sc = new Scanner(System.in);

    public void go() {
        while (true) {
            ArrayList<Integer> arrayOfRandomNumbers = getArrayOfRandomNumbers();
        }
    }

    private ArrayList<Integer> getArrayOfRandomNumbers() {
        ArrayList<Integer> numbers = new ArrayList<>();
        System.out.println("how many numbers in this array? ");
        int length = sc.nextInt();
        for (int i = 0; i < length; i++) {
            numbers.add((int) (Math.random() * 100));
        }
        printArrayV1(numbers);
        printArrayV2(numbers);
        return numbers;
    }

    private void printArrayV1(ArrayList<Integer> numbers) {
        System.out.println("new array: "+ numbers);
    }

    private void printArrayV2(ArrayList<Integer> numbers) {
        for (int number: numbers)
            System.out.print(number+", ");
        System.out.println("");
    }

}
