package _02_Methods._03_LastDigitName;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by User on 26.06.2016.
 */
public class LastDigitNameMain {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int number = Integer.parseInt(reader.readLine());
        Number digit = new Number(number);
        System.out.println(digit.getLastDigitName(number));
    }
}
