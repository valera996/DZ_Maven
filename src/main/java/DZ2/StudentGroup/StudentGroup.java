package DZ2.StudentGroup;

public class StudentGroup {
    private String groupName;
    private int studentCount;

    public StudentGroup(String groupName, int studentCount){
        this.groupName = groupName;
        this.studentCount = studentCount;
    }

    public String getGroupName(){
        return this.groupName;
    }
    public int getStudentCount(){
        return this.studentCount;
    }

    public void setGroupName(String groupName){
        this.groupName = groupName;
    }

    public void setStudentCount(int x){
        this.studentCount = x;
    }

    public void printInfo(){
        System.out.println("Название группы: " + getGroupName() + ", количество студентов: " + getStudentCount());
    }
}
