package graph;

public class Vertex<T> {
  private T value;
  
  public Vertex() {}
  
  public Vertex(T value) {
    this.value = value;
  }
  
  public T getValue () {
    return value;
  }
  
  public void setValue (T value) {
    this.value = value;
  }

  public String toString() {
    return this.value.toString();
  }
}
