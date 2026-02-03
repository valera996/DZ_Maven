package DZ3.University;

public class Main {
    public static void main(String[] args) {
        University unik1 = new University("Игорь",1);
        University unik2 = new University("Юра",2);
        University unik3 = new University("Вова",3);

        University.changeUniversityName("ККЛУГА");

        unik1.printStudentInfo();
        unik2.printStudentInfo();
        unik3.printStudentInfo();
    }
}
