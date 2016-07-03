package _03_staticMembers._05_animalClinic;

public class AnimalClinic extends Animal{

    private static Integer patientID;
    private static Integer healedAnimalsCount;
    private static Integer rehabilitatedAnimalsCount;


    static {
        patientID = 1;
        healedAnimalsCount = 0;
        rehabilitatedAnimalsCount = 0;
    }

    public AnimalClinic(String name, String breed) {
        super(name, breed);
    }

    public static Integer getPatientID() {
        return patientID;
    }

    public static Integer getHealedAnimalsCount() {
        return healedAnimalsCount;
    }

    public static Integer getRehabilitatedAnimalsCount() {
        return rehabilitatedAnimalsCount;
    }

    public static int healedAnimals(String healed){
        if(healed.equals("heal")) {
            healedAnimalsCount++;
            patientID++;
        }
        return healedAnimalsCount;
    }



    public static int rehabilitateAnimals(String rehabilitate){
        if(rehabilitate.equals("rehabilitate")){
            rehabilitatedAnimalsCount++;
            patientID++;
        }
        return rehabilitatedAnimalsCount;
    }


}
