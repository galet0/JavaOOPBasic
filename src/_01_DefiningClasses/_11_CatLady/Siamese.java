package _01_DefiningClasses._11_CatLady;

public class Siamese extends Cat{
    private double earSize;

    public Siamese(String name, double earSize) {
        super(name);
        this.earSize = earSize;
    }

    @Override
    public String toString() {
        return String.format("Siamese %s %.2f", this.name, this.earSize);
    }
}
