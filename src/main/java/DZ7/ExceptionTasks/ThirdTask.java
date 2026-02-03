package DZ7.ExceptionTasks;

public class ThirdTask {

    public static void checkYear(int year) throws MyCheckException {
        if(year < 0 || year > 150){
            throw new MyCheckException("Возраст не подходит");
        }else System.out.println("Возраст подходит");
    }

    public static void main(String[] args) {

        try{
        checkYear(151);
        }catch (MyCheckException e){
            System.out.println(e.getMessage());
        }
    }
}
