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
        //System.out.println("how many numbers in this array? ");
        int length = sc.nextInt();
        for (int i = 0; i < length; i++) {
            numbers.add((int) (Math.random() * 100));
        }
        System.out.println("new array: "+ numbers);
        return numbers;
    }

}
