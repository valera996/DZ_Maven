package DZ5.AmusementPark;

public class Carousel extends Attraction{
    private String requirements = "Карусель требует технического обслуживания";
    private String infoForVisitor = "Карусель: Весело и не громко, чуть скрипим";


    @Override
    public void showRequirements(){
        System.out.println(requirements);
    }

    @Override
    public void showInfo(){
        System.out.println(infoForVisitor);
    }
}
