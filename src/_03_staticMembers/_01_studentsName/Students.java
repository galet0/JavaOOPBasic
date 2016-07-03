package _03_staticMembers._01_studentsName;

/**
 * Created by User on 27.06.2016.
 */
public class Students {
    private String name;
    private static Integer countStudents = 0;

    public Students(String name) {
        this.name = name;
        countStudents++;
    }

    public static Integer getCountStudents() {
        return countStudents;
    }

    public String getName() {
        return name;
    }

}
