package DZ5.AmusementPark;

public class RollerCoaster extends Attraction{

    private String requirements = "Американские горки требует проверки безопасности";
    private String infoForVisitor = "Американские горки: Быстро едем, громко кричите";



    @Override
    public void showRequirements(){
        System.out.println(requirements);
    }

    @Override
    public void showInfo(){
        System.out.println(infoForVisitor);
    }
}
