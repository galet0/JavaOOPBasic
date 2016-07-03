package _03_staticMembers._05_animalClinic;

public class Animal {
    private String name;
    private String breed;
//    public ArrayList<String> healedPatients;
//    public ArrayList<String> rehabilitatedPatients;

    public Animal(String name, String breed) {
        this.name = name;
        this.breed = breed;
//        this.healedPatients = new ArrayList<>();
//        this.rehabilitatedPatients = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public String getBreed() {
        return breed;
    }

//    public ArrayList<String> getHealedPatients() {
//        return healedPatients;
//    }
//
//    public ArrayList<String> getRehabilitatedPatients() {
//        return rehabilitatedPatients;
//    }
//
//    public ArrayList<String> addHealed(String patient) {
//        patient = this.getName() + " " + this.getBreed();
//        this.healedPatients.add(patient);
//        return healedPatients;
//    }
//
//    public ArrayList<String> addRehabilitated(String patient) {
//        patient = this.getName() + " " + this.getBreed();
//        this.rehabilitatedPatients.add(patient);
//        return rehabilitatedPatients;
//    }
//
//    public void printHealed(ArrayList<String> healedPatients) {
//        for (String healedPatient : healedPatients) {
//            System.out.println(healedPatient);
//        }
//    }
//
//    public void printRehabilitated(ArrayList<String> rehabilitatedPatients) {
//        for (String rehabilitatedPatient : rehabilitatedPatients) {
//            System.out.println(rehabilitatedPatient);
//        }
//    }

}
