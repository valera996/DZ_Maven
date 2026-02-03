package DZ5.Pet;

public class PetSystem {
    private Pet pet;

    public void setNewPet(Pet pet){
        this.pet = pet;
    }


//    public void playWithPet(){
//        if(this.pet instanceof Playable) {
//            Playable playable = (Playable) this.pet;
//            playable.play();
//        }else System.out.println("Это животное не играет");
//
//    }
//
//    public void walkWithPet(){
//        if(this.pet instanceof Walkable){
//            Walkable walkable = (Walkable) this.pet;
//            walkable.walk();
//        }else System.out.println("Это животное не гуляет");
//    }
//
        public void playWithPet(Playable playable){
        playable.play();
    }
        public void walkWithPet(Walkable walkable){
        walkable.walk();
        }


    public void feedPet(){
        pet.eat();
    }
}
