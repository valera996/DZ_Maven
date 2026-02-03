package DZ3.Person;

public class Main {
    public static void main(String[] args){

        Person per1 = new Person("Слава","Комисаренко","32135135123");
        Person per2 = new Person("Гоша","Пономарёв","54623456324");

        per1.setFirstName("Виталя");

        per1.printPersonInfo();


    }
}
