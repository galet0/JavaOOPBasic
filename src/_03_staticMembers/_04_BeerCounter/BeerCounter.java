package _03_staticMembers._04_BeerCounter;


public class BeerCounter {
    private static Integer beerInStock;
    private static Integer beerDrankCount;

    static {
        beerInStock = 0;
        beerDrankCount = 0;
    }

    public static Integer getBeerInStock() {
        return beerInStock - beerDrankCount;
    }

    public static Integer getBeerDrankCount() {
        return beerDrankCount;
    }

    static Integer buyBeer(int bottlesCount){
        return beerInStock += bottlesCount;
    }

    static Integer drinkBeer(int bottlesCount){
        return beerDrankCount += bottlesCount;
    }
}
