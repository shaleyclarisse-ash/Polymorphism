public class App {
  public static void main (String [] args) {
    
    Animal animal1 = new Animal();
    Animal dog1 = new Dog();
    Animal cat1 = new Cat();
    
    animal1.name = "Animal";
    dog1.name = "Browny";
    cat1.name = "Yui";
    
    animal1.animalSound();
    dog1.animalSound();
    cat1.animalSound();

  }
}
