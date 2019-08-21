package utilities;

import org.junit.Test;

import java.util.NoSuchElementException;

import static org.junit.Assert.*;

public class AnimalShelterTest {
  
  @Test
  public void testEnqueue_NewCat() {
    Cat testCat = new Cat("Mittens", "Coon", 10);
    AnimalShelter shelter = new AnimalShelter();
    shelter.enqueue(testCat);
  
    assertEquals(
     "testEnqueue_OneNewDogNoMedicalConcerns should return: ",
     "Dogs for adoption:\n" +
      "none\n" +
      "\n" +
      "Cats for adoption:\n" +
      "front -> Name: Mittens\n" +
      "Breed: Coon\n" +
      "Age: 10\n" +
      "Medical Concerns: none\n" +
      " -> back",
     shelter.toString()
    );
  }
  
  @Test
  public void testEnqueue_OneNewDogNoMedicalConcerns() {
    Dog testDog = new Dog("Fido", "Black Lab", 3);
    AnimalShelter shelter = new AnimalShelter();
    shelter.enqueue(testDog);
    
    assertEquals(
     "testEnqueue_OneNewDogNoMedicalConcerns should return: ",
     "Dogs for adoption:\n" +
    "front -> Name: Fido\n" +
    "Breed: Black Lab\n" +
    "Age: 3\n" +
    "Medical Concerns: none\n" +
    " -> back\n" +
    "Cats for adoption:\n" +
    "none\n",
     shelter.toString()
    );
  }
  
  @Test
  public void testEnqueue_OneNewDogOneMedicalConcerns() {
    Dog testDog = new Dog("Fido", "Black Lab", 3);
    testDog.setMedicalConcerns("rash");
    AnimalShelter shelter = new AnimalShelter();
    shelter.enqueue(testDog);
  
    assertEquals(
     "testEnqueue_OneNewDogNoMedicalConcerns should return: ",
     "Dogs for adoption:\n" +
      "front -> Name: Fido\n" +
      "Breed: Black Lab\n" +
      "Age: 3\n" +
      "Medical Concerns: rash\n" +
      " -> back\n" +
      "Cats for adoption:\n" +
      "none\n",
     shelter.toString()
    );
  }
  
  @Test
  public void testEnqueue_OneNewDogTwoMedicalConcerns() {
    Dog testDog = new Dog("Fido", "Black Lab", 3);
    AnimalShelter shelter = new AnimalShelter();
    testDog.setMedicalConcerns("rash");
    testDog.setMedicalConcerns("tumors");
    shelter.enqueue(testDog);
  
    assertEquals(
     "testEnqueue_OneNewDogNoMedicalConcerns should return: ",
     "Dogs for adoption:\n" +
      "front -> Name: Fido\n" +
      "Breed: Black Lab\n" +
      "Age: 3\n" +
      "Medical Concerns: rash, tumors\n" +
      " -> back\n" +
      "Cats for adoption:\n" +
      "none\n",
     shelter.toString()
    );
  }
  
  @Test
  public void testEnqueue_TwoNewDogsNoMedicalConcerns() {
    Dog testDog = new Dog("Fido", "Black Lab", 3);
    Dog testDog2 = new Dog("Bill", "Black Lab", 3);
    AnimalShelter shelter = new AnimalShelter();
    shelter.enqueue(testDog);
    shelter.enqueue(testDog2);
  
    assertEquals(
     "testEnqueue_OneNewDogNoMedicalConcerns should return: ",
     "Dogs for adoption:\n" +
      "front -> Name: Fido\n" +
      "Breed: Black Lab\n" +
      "Age: 3\n" +
      "Medical Concerns: none\n" +
      " -> Name: Bill\n" +
      "Breed: Black Lab\n" +
      "Age: 3\n" +
      "Medical Concerns: none\n" +
      " -> back\n" +
      "Cats for adoption:\n" +
      "none\n",
     shelter.toString()
    );
  
  }
  
  @Test
  public void testDequeue_OneDogInOneDogOut_NoMedical() {
    Dog testDog = new Dog("Fido", "Black Lab", 3);
    AnimalShelter shelter = new AnimalShelter();
    shelter.enqueue(testDog);
    AdoptableAnimal responseDog = shelter.dequeue("dog");
  
    assertEquals(
     "testDequeue_OneDogInOneDogOut_NoMedical should return: ",
     "Name: Fido\n" +
      "Breed: Black Lab\n" +
      "Age: 3\n" +
      "Medical Concerns: none\n",
     responseDog.toString()
    );
    assertTrue(shelter.isEmpty());
  }
  
  @Test
  public void testDequeue_OneDogInOneDogOut_YesMedical() {
    Dog testDog = new Dog("Fido", "Black Lab", 3);
    testDog.setMedicalConcerns("tumors");
    testDog.setMedicalConcerns("allergies");
    AnimalShelter shelter = new AnimalShelter();
    shelter.enqueue(testDog);
    AdoptableAnimal responseDog = shelter.dequeue("dog");
    
    assertEquals(
     "testDequeue_OneDogInOneDogOut_YesMedical should return: ",
     "Name: Fido\n" +
      "Breed: Black Lab\n" +
      "Age: 3\n" +
      "Medical Concerns: tumors, allergies\n",
     responseDog.toString()
    );
    assertTrue(shelter.isEmpty());
  }
  
  @Test (expected = NoSuchElementException.class)
  public void testDequeue_OneDogInTwoDogOut_NoMedical() {
    Dog testDog = new Dog("Fido", "Black Lab", 3);
    AnimalShelter shelter = new AnimalShelter();
    shelter.enqueue(testDog);
    AdoptableAnimal responseDog = shelter.dequeue("dog");
    AdoptableAnimal responseDog2 = shelter.dequeue("dog");
  }
  
  @Test
  public void testDequeue_OneDogAndOneCatInOneDogOut_NoMedical() {
    Dog testDog = new Dog("Fido", "Black Lab", 3);
    Cat testCat = new Cat("Mittens", "Coon", 10);
    AnimalShelter shelter = new AnimalShelter();
    shelter.enqueue(testDog);
    shelter.enqueue(testCat);
    AdoptableAnimal responseDog = shelter.dequeue("dog");
    
    assertEquals(
     "testDequeue_OneDogAndOneCatInOneDogOut_NoMedical should return: ",
     "Name: Fido\n" +
      "Breed: Black Lab\n" +
      "Age: 3\n" +
      "Medical Concerns: none\n",
     responseDog.toString()
    );
    assertFalse(shelter.isEmpty());
  }
  
  @Test
  public void testDequeue_OneDogAndOneCatInOneDogOutAndOneCatOut_NoMedical() {
    Dog testDog = new Dog("Fido", "Black Lab", 3);
    Cat testCat = new Cat("Mittens", "Coon", 10);
    AnimalShelter shelter = new AnimalShelter();
    shelter.enqueue(testDog);
    shelter.enqueue(testCat);
    AdoptableAnimal responseDog = shelter.dequeue("dog");
    AdoptableAnimal responseCat = shelter.dequeue("cat");
    
    assertEquals(
     "testDequeue_OneDogAndOneCatInOneDogOut_NoMedical should return: ",
     "Name: Fido\n" +
      "Breed: Black Lab\n" +
      "Age: 3\n" +
      "Medical Concerns: none\n",
     responseDog.toString()
    );
    assertEquals(
     "testDequeue_OneDogAndOneCatInOneDogOut_NoMedical should return: ",
     "Name: Mittens\n" +
      "Breed: Coon\n" +
      "Age: 10\n" +
      "Medical Concerns: none\n",
     responseCat.toString()
    );
    assertTrue(shelter.isEmpty());
  }
}