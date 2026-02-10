package DZ12.Task2;

public class UserValidator {
    private boolean validationEnabled;

    public UserValidator(boolean validationEnabled ){
        this.validationEnabled = validationEnabled;
    }
    public void setValidationEnabled(boolean newStatus){
        this.validationEnabled = newStatus;
    }

    //Проверка имени: Имя должно быть не пустым и начинаться с заглавной буквы.
    public boolean checkUserByName(User user) {
        if(validationEnabled == false){
            return true;
        }else {
            if (user.getName() == null) {
                throw new InvalidUserException("Ошибка, имя не может быть null");
            }
            if (user.getName().isEmpty()) {
                throw new InvalidUserException("Ошибка, имя не может быть пустым");
            }
            if (user.getName().equals(user.getName().toLowerCase())) {
                throw new InvalidUserException("Ошибка, имя должно начинаться с заглавной буквы");
            } else return true;
        }
    }

    //Проверка возраста: Возраст должен быть в пределах от 18 до 100 лет.
    public boolean checkUserByAge(User user) {
        if (validationEnabled == false) {
            return true;
        } else {
            if (user.getAge() < 18) {
                throw new InvalidUserException("Ошибка возраст не должен быть меньше 18");
            }
            if(user.getAge() > 100){
                throw new InvalidUserException("Ошибка возраст не должен быть больше 100");
            }else return true;
        }
    }

    //Проверка email: Email должен соответствовать стандартному формату электронной почты.
    public boolean checkUserByEmail(User user){
        if(validationEnabled == false){
            return true;
        }else {
            if(!user.getEmail().matches("^[A-Za-z0-9+_.-]+@(.+)$")){
                throw new InvalidUserException("Email не валидный");
            }else return true;
        }
    }



}
