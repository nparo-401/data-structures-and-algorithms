package utilities;

import java.util.ArrayList;

// This class is meant only for testing purposes for the AnimalShelter dequeue(Class animalPreference)

public class NonAdoptableAnimal {
  private String name;
  private String breed;
  private int age;
  private ArrayList<String> medicalConcerns;
  
  NonAdoptableAnimal(String name, String breed, int age) {
    this.name = name;
    this.breed = breed;
    this.age = age;
    this.medicalConcerns = new ArrayList<>();
  }
  
  public String getName () {
    return name;
  }
  
  public String getBreed () {
    return breed;
  }
  
  public int getAge () {
    return age;
  }
  
  public ArrayList<String> getMedicalConcerns () {
    return medicalConcerns;
  }
}
