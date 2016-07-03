package _05_inheritance._03_mankind;

/**
 * Created by User on 03.07.2016.
 */
public class Student extends Human {
    private String facultyNumber;

    public Student(String firstName, String lastName, String facultyNumber) {
        super(firstName, lastName);
        this.setFacultyNumber(facultyNumber);
    }

//    public String getFacultyNumber() {
//        return facultyNumber;
//    }

    private void setFacultyNumber(String facultyNumber) {
        if (isValid(facultyNumber) == false) {
            throw new IllegalArgumentException("Invalid faculty number!");
        }
        if (facultyNumber.length() < 5 || facultyNumber.length() > 10) {
            throw new IllegalArgumentException("Invalid faculty number!");
        }
        this.facultyNumber = facultyNumber;
    }

    private boolean isValid(String facultyNumber) {
        boolean isValidNumber = true;
        for (int i = 0; i < facultyNumber.length(); i++) {
            if (!Character.isLetterOrDigit(facultyNumber.charAt(i))) {
                isValidNumber = false;
            }
        }
        return isValidNumber;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("First Name: ").append(getFirstName())
                .append(System.lineSeparator())
                .append("Last Name: ").append(getLastName())
                .append(System.lineSeparator())
                .append("Faculty number: ").append(this.facultyNumber)
                .append(System.lineSeparator());
        return sb.toString();
    }
}

