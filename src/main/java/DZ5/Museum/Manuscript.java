package DZ5.Museum;

public class Manuscript extends Exhibit{

    private String info = "Этот манускрипт старый и интересный";
    private String requirements = "Манускрипт требует контролируемой влажности";


    @Override
    public void showRequirements(){
        System.out.println(requirements);
    }

    @Override
    public void showInfo(){
        System.out.println(info);
    }

}
