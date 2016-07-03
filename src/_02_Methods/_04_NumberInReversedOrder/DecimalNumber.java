package _02_Methods._04_NumberInReversedOrder;

/**
 * Created by User on 26.06.2016.
 */
public class DecimalNumber {
    String number;

    public DecimalNumber(String number) {
        this.number = number;
    }

    StringBuilder reverseNumber(String number) {
        StringBuilder reverseNum = new StringBuilder(number);
        return reverseNum = reverseNum.reverse();
    }
}
