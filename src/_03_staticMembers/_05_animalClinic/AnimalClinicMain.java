package _03_staticMembers._05_animalClinic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

/**
 * Created by User on 28.06.2016.
 */
public class AnimalClinicMain {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] input = null;
        Animal animal = null;
        HashMap<Integer, String> healedPatients = new HashMap<>();
        HashMap<Integer, String> rehabilitatedPatients = new HashMap<>();
        while (true){
            input = reader.readLine().split("\\s+");
            if(input[0].equals("End")){
                break;
            }
            String name = input[0];
            String breed = input[1];
            String condition = input[2];

            animal = new Animal(name, breed);
            int patientID = AnimalClinic.getPatientID();
            String patient = animal.getName() + " " + animal.getBreed();
            if(condition.equals("heal")){
                AnimalClinic.healedAnimals(condition);
                if(!healedPatients.containsKey(patientID)){
                    healedPatients.put(patientID, patient);
                }
                System.out.printf("Patient %d: [%s (%s)] has been healed!\n", patientID, name, breed);
            } else if(condition.equals("rehabilitate")){
                AnimalClinic.rehabilitateAnimals(condition);
                if(!rehabilitatedPatients.containsKey(patientID)){
                    rehabilitatedPatients.put(patientID, patient);
                }
                System.out.printf("Patient %d: [%s (%s)] has been rehabilitated!\n", patientID, name, breed);
            }
        }
        System.out.printf("Total healed animals: %d\n", AnimalClinic.getHealedAnimalsCount());
        System.out.printf("Total rehabilitated animals: %d\n", AnimalClinic.getRehabilitatedAnimalsCount());
        input = reader.readLine().split("\\s+");
        if(input[0].equals("heal")){
            healedPatients.entrySet().stream()
                    .forEach(name -> System.out.println(name.getValue()));
        } else if(input[0].equals("rehabilitate")){
            rehabilitatedPatients.entrySet().stream()
                    .forEach(name -> System.out.println(name.getValue()));
        }

    }
}
