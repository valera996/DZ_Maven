package DZ7.GenericTasks;

public class Box <T> {
    private T t;

    public void setT(T t){
        this.t = t;
    }
    public T getT(){
        return t;
    }


    public static void main(String[] args) {

        Box <String> str = new Box<>();
        str.setT("стринга");
        System.out.println("Значение поля объекта типа String : " + str.getT());


        Box <Integer> integer = new Box<>();
        integer.setT(1212);
        System.out.println("Значение поля объекта типа Integer : " + integer.getT());
    }
}
