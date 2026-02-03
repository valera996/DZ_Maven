package DZ7.GenericTasks;

public class ThirdTask <T,U>{

    private T t;
    private U u;

    public void setT(T t){
        this.t = t;
    }
    public void setU(U u){
        this.u = u;
    }


    public T getT(){
        return this.t;
    }
    public U getU(){
        return this.u;
    }


    public static void main(String[] args) {

        ThirdTask<String,Integer> class1 = new ThirdTask<>();
        class1.setT("стринга");
        class1.setU(1212);

        System.out.println("Значение переменных перого экзампяра класса (String и Integer): " + class1.getT() + " " + class1.getU());


        ThirdTask<Boolean,Boolean> class2 = new ThirdTask<>();
        class2.setT(true);
        class2.setU(false);
        System.out.println("Значение переменных перого экзампяра класса (Boolean и Boolean): " + class2.getT() + " " + class2.getU());

    }
}
