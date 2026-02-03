package DZ5.Zoo;

public class Zoo {
    private Animal animal;



    public void setNewAnimal(Animal animal){
        this.animal = animal;
    }

    public void showAnimalBehavior(){
        animal.move();
        animal.makeSound();
    }



}
