package _05_inheritance._02_bookShop;


public class GoldenEditionBook extends Book{


    public GoldenEditionBook(String title, String author, double price) {
        super(title, author, price);
    }

    @Override
    public double getPrice() {
        return super.getPrice() + super.getPrice() * 0.30;
    }
}
