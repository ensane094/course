package lesson6;

public abstract class Animal {
    private String animalName;
    private static int animalCount;
    Animal(String animalName){
        this.animalName=animalName;
        animalCount+=1;
        System.out.println("Created "+ animalCount +" animal");
    }
    String getAnimalName(){
        return animalName;
    }
}
