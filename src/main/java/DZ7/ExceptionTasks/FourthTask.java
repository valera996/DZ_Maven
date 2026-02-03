package DZ7.ExceptionTasks;

import java.util.regex.Pattern;

public class FourthTask {

//    public static void checkEmail(String email) throws MyRuntimeException {
//        try {
//           String pattern = "^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+$";
//           if(!Pattern.matches(pattern, email)){
//               throw new MyRuntimeException();
//           }else System.out.println("email валидный");
//        }catch (MyRuntimeException e){
//            System.out.println(e.getMessage());
//        }
//    }

    //Исправленный вариант
public static void checkEmail(String email) throws MyRuntimeException {
        String pattern = "^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+$";
        if(!Pattern.matches(pattern, email)){
            throw new MyRuntimeException();
        }else System.out.println("email валидный");
}


    public static void main(String[] args) {

//        //Валидный email
//        checkEmail("sfbwsfb@mail.ru");
//
//        //Не валидный email, отрабатывает исколючение
//        checkEmail("цкцкууа");


        //Исправленный вариант
        //Валидный email
       try {
           checkEmail("sfbwsfb@mail.ru");
       }catch(MyRuntimeException e){
           System.out.println(e.getMessage());
       }
        //Не валидный email, отрабатывает исколючение
       try {
           checkEmail("цкцкууа");
       }catch (MyRuntimeException e){
           System.out.println(e.getMessage());
       }
    }
}
