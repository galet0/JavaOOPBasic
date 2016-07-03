package _03_staticMembers._07_basicMath;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by User on 28.06.2016.
 */
public class BasicMathMain {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        while (true){
            String[] input = reader.readLine().split("\\s+");
            if(input[0].equals("End")){
                break;
            }
            String operation = input[0];
            double firstNumber = Double.parseDouble(input[1]);
            double secondNumber = Double.parseDouble(input[2]);
            switch (operation){
                case "Sum":
                    System.out.printf("%.2f\n",MathUtil.sumNumbers(firstNumber, secondNumber));
                    break;
                case "Subtract":
                    System.out.printf("%.2f\n",MathUtil.subtractNumbers(firstNumber, secondNumber));
                    break;
                case "Multiply":
                    System.out.printf("%.2f\n",MathUtil.multiplyNumbers(firstNumber, secondNumber));
                    break;
                case "Divide":
                    System.out.printf("%.2f\n",MathUtil.divideNumbers(firstNumber, secondNumber));
                    break;
                case "Percentage":
                    System.out.printf("%.2f\n",MathUtil.percentage(firstNumber, secondNumber));
                    break;
            }

        }
    }
}
