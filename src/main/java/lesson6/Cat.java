package lesson6;

public class Cat extends Animal{
    private static int count=0;
    Cat(String catName){
        super(catName);
        count ++;
        System.out.println("Cat "+count+" is created");
    }
    public String toString(){
        return getAnimalName();
    }
}
