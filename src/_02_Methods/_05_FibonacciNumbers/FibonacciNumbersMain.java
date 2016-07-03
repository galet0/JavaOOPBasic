package _02_Methods._05_FibonacciNumbers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by User on 26.06.2016.
 */
public class FibonacciNumbersMain {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int startPosition = Integer.parseInt(reader.readLine());
        int endPosition = Integer.parseInt(reader.readLine());

        Fibonacci fibNums = new Fibonacci(startPosition,endPosition);
        ArrayList<Long> fibonacciSequence = fibNums.getNumbersInRange(startPosition, endPosition);
        String sequence = Arrays.toString(fibonacciSequence.toArray()).replace("[","").replace("]","");
        System.out.println(sequence);
    }
}
