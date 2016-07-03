package _03_staticMembers._02_uniqueStudentsName;

import java.util.HashSet;


public class StudentGroup {
    private HashSet<String> group = new HashSet<>();
    private static Integer countUniqueStudents = 0;

    public StudentGroup(HashSet<String> group) {
        this.group = group;
        countUniqueStudents = this.group.size();
    }

    public HashSet<String> getGroup() {
        return this.group;
    }

    public static Integer getCountUniqueStudents() {
        return countUniqueStudents;
    }

    public void addStudents(String name){
        this.group.add(name);
    }
}
