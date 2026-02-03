package DZ5.BotanicalGarden;

public class BotanicalGarden {

    private Plant plant;

    public void setNewPlant(Plant plant){
        this.plant = plant;
    }

    public void takeCareOfPlant(){
        plant.showRequirements();
    }
}
