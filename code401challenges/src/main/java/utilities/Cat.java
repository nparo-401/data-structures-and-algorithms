package utilities;

import java.util.ArrayList;

public class Cat implements AdoptableAnimal {
  private String name;
  private String breed;
  private int age;
  private ArrayList<String> medicalConcerns;
  
  Cat(String name, String breed, int age) {
    this.name = name;
    this.breed = breed;
    this.age = age;
    this.medicalConcerns = new ArrayList<>();
  }
  
  @Override
  public String getName () {
    return name;
  }
  
  @Override
  public String getBreed () {
    return breed;
  }
  
  @Override
  public int getAge () {
    return age;
  }
  
  public void setMedicalConcerns(String medicalConcern) {
    this.medicalConcerns.add(medicalConcern);
  }
  
  public String getMedicalConcerns() {
    if (this.medicalConcerns.size() == 0) {
      return "none";
    }
    StringBuilder concerns = new StringBuilder();
    for (int i = 0; i < this.medicalConcerns.size(); i++) {
      concerns.append(this.medicalConcerns.get(i));
      if (i < this.medicalConcerns.size() - 1) {
        concerns.append(", ");
      }
    }
    return concerns.toString();
  }
  
  @Override
  public String toString () {
    return String.format(
     "Name: %s\n" +
      "Breed: %s\n" +
      "Age: %s\n" +
      "Medical Concerns: %s\n",
     this.name, this.breed, this.age, getMedicalConcerns());
  }
}
