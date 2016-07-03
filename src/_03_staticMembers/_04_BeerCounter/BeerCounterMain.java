package _03_staticMembers._04_BeerCounter;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by User on 27.06.2016.
 */
public class BeerCounterMain {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int beerStock = 0;
        int drunkBeer = 0;
        while (true){
            String[] input = reader.readLine().split("\\s+");
            if(input[0].equals("End")){
                break;
            }
            int beerInStock = Integer.parseInt(input[0]);
            int beerDrank = Integer.parseInt(input[1]);
            BeerCounter.buyBeer(beerInStock);
            BeerCounter.drinkBeer(beerDrank);
            beerStock = BeerCounter.getBeerInStock();
            drunkBeer = BeerCounter.getBeerDrankCount();

        }
        System.out.println(beerStock + " " + drunkBeer);
    }
}
