package _02_Methods._04_NumberInReversedOrder;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by User on 26.06.2016.
 */
public class NumberInReversedOrderMain {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String number = reader.readLine();
        DecimalNumber decimalNumber = new DecimalNumber(number);
        System.out.println(decimalNumber.reverseNumber(number));
    }
}
