package utilities;

import stacksAndQueues.Queue;

public class AnimalShelter {
  private Queue<AdoptableAnimal> dogQueue;
  private Queue<AdoptableAnimal> catQueue;
  
  AnimalShelter() {
    this.dogQueue = new Queue<>();
    this.catQueue = new Queue<>();
  }
  
  public boolean isEmpty() {
    return this.dogQueue.isEmpty() && this.catQueue.isEmpty();
  }
  
  public void enqueue(AdoptableAnimal animal) {
    if (animal.getClass() == Dog.class) {
      this.dogQueue.enqueue(animal);
    } else {
      this.catQueue.enqueue(animal);
    }
  }
  
  public AdoptableAnimal dequeue(String animalPreference) {
    if (animalPreference.toLowerCase().trim().equals("cat")) {
      return this.catQueue.dequeue();
    } else if (animalPreference.toLowerCase().trim().equals("dog")) {
      return this.dogQueue.dequeue();
    } else {
      return null;
    }
  }
  
  private String getAnimalQueue() {
    StringBuilder response = new StringBuilder();
    response.append("Dogs for adoption:\n");
    if (this.dogQueue.isEmpty()) {
      response.append("none\n");
    } else if (!this.dogQueue.isEmpty()) {
      response.append(this.dogQueue);
    }
    
    response.append("\nCats for adoption:\n");
    if (this.catQueue.isEmpty()) {
      response.append("none\n");
    } else if (!this.catQueue.isEmpty()) {
      response.append(this.catQueue);
    }
    return response.toString();
  }
  
  @Override
  public String toString() {
    return getAnimalQueue();
  }
}
