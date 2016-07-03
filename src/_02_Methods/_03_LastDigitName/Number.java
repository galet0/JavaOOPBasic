package _02_Methods._03_LastDigitName;

/**
 * Created by User on 26.06.2016.
 */
public class Number {
    Integer number;

    public Number(Integer number) {
        this.number = number;
    }

    String getLastDigitName(Integer number){
        String lastDigit = "";
        int digit = number % 10;
        switch (digit){
            case 0: lastDigit = "zero";
                break;
            case 1: lastDigit = "one";
                break;
            case 2: lastDigit = "two";
                break;
            case 3: lastDigit = "three";
                break;
            case 4: lastDigit = "four";
                break;
            case 5: lastDigit = "five";
                break;
            case 6: lastDigit = "six";
                break;
            case 7: lastDigit = "seven";
                break;
            case 8: lastDigit = "eight";
                break;
            case 9: lastDigit = "nine";
                break;
            default:
                break;
        }
        return lastDigit;
    }
}
