package DZ5.BotanicalGarden;

public class Orchid extends Plant{
    private String light = "Орхидея требует тень";
    private String watering = "Орхидея требует высокую влажность";



    @Override
    public void showRequirements(){
        System.out.println(light + "\n" + watering);
    }

}
