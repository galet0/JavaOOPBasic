package _02_Methods._10_dateModifier;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DateModifierMain {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String startDate = reader.readLine();
        String endDate = reader.readLine();
        DateModifier diffDays = new DateModifier();
        diffDays.calculateDifference(startDate, endDate);
        long difference = Math.abs(diffDays.getDifference());

        System.out.println(difference);
    }
}
