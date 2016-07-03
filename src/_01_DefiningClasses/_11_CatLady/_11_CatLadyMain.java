package _01_DefiningClasses._11_CatLady;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

/**
 * Created by User on 24.06.2016.
 */
public class _11_CatLadyMain {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        HashMap<String, Cat> cats = new HashMap<>();
        while (true){
            String input = reader.readLine();
            if(input.equals("End")){
                break;
            }
            String[] params = input.split("\\s+");
            String breed = params[0];
            String name = params[1];
            double special = Double.parseDouble(params[2]);
            Cat cat = null;
            switch (breed){
                case "Siamese":
                    cat = new Siamese(name,special);
                    break;
                case "Cymric":
                    cat = new Cymric(name,special);
                    break;
                case "StreetExtraordinaire":
                    cat = new StreetExtraordinaire(name,special);
                    break;
            }
            cats.put(name,cat);
        }

        String searchedCat = reader.readLine();
        System.out.println(cats.get(searchedCat));
    }
}
