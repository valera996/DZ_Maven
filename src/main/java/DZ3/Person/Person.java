package DZ3.Person;

public class Person {
    private String firstName;
    private String lastName;
    private final String ssn;


    public Person(String firstName, String lastName, String ssn){
        this.firstName = firstName;
        this.lastName = lastName;
        this.ssn = ssn;
    }

    public String getFirstName(){
        return this.firstName;
    }
    public String getLastName(){
        return this.lastName;
    }
    public String getSsn(){
        return this.ssn;
    }

    public void setFirstName(String firstNAme){
        this.firstName = firstNAme;
    }
    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    public void printPersonInfo(){
        System.out.println("Имя: " + this.getFirstName() + ", фамилия: " + this.getLastName() + ", SSN: " + this.getSsn());
    }
}
