package DZ7.ExceptionTasks;

public class MyRuntimeException extends RuntimeException{
    public MyRuntimeException(){
        super("ОШИБКА: не валидный email");
    }
}
