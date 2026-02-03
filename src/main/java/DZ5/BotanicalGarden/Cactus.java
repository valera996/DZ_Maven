package DZ5.BotanicalGarden;

public class Cactus extends Plant{

    private String light = "Кактус требует много света";
    private String watering = "Кактус требует редкий полив";



    @Override
    public void showRequirements(){
        System.out.println(light+ "\n" + watering);
    }

}
