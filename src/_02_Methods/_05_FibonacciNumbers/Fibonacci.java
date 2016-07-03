package _02_Methods._05_FibonacciNumbers;


import java.util.ArrayList;

public class Fibonacci {

    private Integer startPosition;
    private Integer endPosition;

    public Fibonacci(Integer startNumber, Integer endNumber) {
        this.startPosition = startNumber;
        this.endPosition = endNumber;
    }

    public ArrayList<Long> getNumbersInRange(int startPosition, int endPosition){
        ArrayList<Long> fibonacciList = new ArrayList<>();
        long fib0 = 0;
        long fib1 = 1;
        long fib2 = 1;
        fibonacciList.add(fib0);
        fibonacciList.add(fib1);

        for (int i = 2; i < endPosition; i++) {
            fibonacciList.add((long)fib2);
            fib0 = fib1;
            fib1 = fib2;
            fib2 = fib0 + fib1;
        }
        ArrayList<Long> startEndList = new ArrayList<>();
        for (int i = startPosition; i < endPosition; i++) {
            startEndList.add(fibonacciList.get(i));
        }
        return startEndList;
    }

}
