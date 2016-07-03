package _04_encapsulation._05_pizzaCalories.models;

/**
 * Created by User on 01.07.2016.
 */
public class Dough {
    private String floorType;
    private String backingTechnique;
    private int weight;

    public Dough(String floorType, String backingTechnique, int weight) {
        this.setFloorType(floorType);
        this.setBackingTechnique(backingTechnique);
        this.setWeight(weight);
    }

    public void setFloorType(String floorType) {
        if(!floorType.equalsIgnoreCase("white") && !floorType.equalsIgnoreCase("wholegrain")){
            throw new IllegalArgumentException("Invalid type of dough.");
        }
        this.floorType = floorType;
    }

    public void setBackingTechnique(String backingTechnique) {
        if(!backingTechnique.equalsIgnoreCase("crispy") &&
                !backingTechnique.equalsIgnoreCase("chewy") &&
        !backingTechnique.equalsIgnoreCase("homemade")){
            throw new IllegalArgumentException("Invalid type of dough.");
        }
        this.backingTechnique = backingTechnique;
    }

    public void setWeight(int weight) {
        if(weight < 1 || weight > 200){
            throw new IllegalArgumentException("Dough weight should be in the range [1..200].");
        }
        this.weight = weight;
    }

    public double getCalories(){
        return 2 * this.weight * this.getModifiers(this.floorType) * this.getModifiers(this.backingTechnique);
    }
    private double getModifiers(String type){
        switch (type.toLowerCase()){
            case "white":
                return 1.5;
            case "wholegrain":
                return 1.0;
            case "crispy":
                return 0.9;
            case "chewy":
                return 1.1;
            case "homemade":
                return 1.0;
            default:
                return 1.0;
        }
    }
}
