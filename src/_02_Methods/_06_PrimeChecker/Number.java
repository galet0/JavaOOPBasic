package _02_Methods._06_PrimeChecker;

/**
 * Created by User on 26.06.2016.
 */
public class Number {
    Integer number;
    Boolean isPrime;

    public Number(Integer number, Boolean isPrime) {
        this.number = number;
        this.isPrime = isPrime;
    }

    public Number(Integer number) {
        this(number,false);
    }

//    Number isPrimeNumber(Integer number){
//        boolean isPrime = true;
//        int nextPrimeNumber = 0;
//        for (int i = 2; i <= number/2; i++) {
//            if(number % i == 0){
//                isPrime = false;
//            }
//        }
//
//
//    }
}
