package _02_Methods._01_MethodSaysHallo;


public class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    String sayHello(String name){
        return String.format("%s says \"Hello\"!", name);
    }
}
