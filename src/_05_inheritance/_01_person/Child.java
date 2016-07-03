package _05_inheritance._01_person;

/**
 * Created by User on 02.07.2016.
 */
public class Child extends Person {

    public Child(String name, int age) {
        super(name, age);
    }

    @Override
    protected void setAge(int age) {
        if(age > 15){
            throw new IllegalArgumentException("Child's age must be lesser than 15!");
        }
        super.setAge(age);
    }
}
