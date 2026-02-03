package DZ5.Museum;

public class Sculpture extends Exhibit{

    private String info = "Это скульптура Зевса";
    private String requirements = "Скульптура нуждается в реставрации";



    @Override
    public void showRequirements(){
        System.out.println(requirements);
    }

    @Override
    public void showInfo(){
        System.out.println(info);
    }
}
