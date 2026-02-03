package DZ5.Farm;

public class Cow extends LiveStock implements GivingProduct{

    @Override
    public void eat(){
        System.out.println("Корова нуждается в выпасе");
    }

    @Override
    public void giveProduct(){
        System.out.println("Корова дала молоко");
    }

}
