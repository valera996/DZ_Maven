package DZ3.University;

public class University {
    static String universityName = "КГУФКСТ";
    final int studentID;
    String studentName;

    public University(String studentName, int studentID){
        this.studentName = studentName;
        this.studentID = studentID;
    }

    public static void changeUniversityName(String newName){
       universityName = newName;
    }
    public String getStudentName(){
        return this.studentName;
    }
    public int getStudentID(){
        return this.studentID;
    }

    public void printStudentInfo(){
        System.out.println("Название универа: " + universityName + " , Имя студента: " + getStudentName() + ", id:" + getStudentID());
    }


}
