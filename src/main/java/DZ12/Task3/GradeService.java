package DZ12.Task3;

import java.util.LinkedList;
import java.util.List;

public class GradeService<T extends Number> {

    private List<StudentGrade<T>> gradeList = new LinkedList<>();


    //Метод для добавления оценки (addGrade),
    // который также валидирует оценку на предмет того, что она не отрицательна.
    public synchronized void addGrade(StudentGrade<T> student){
        if(student.getGrade().doubleValue() < 0){
            throw new InvalidGradeException("Ошибка, оценка не может быть отрицательной");
        }else gradeList.add(student);
    }

    //Метод для расчёта среднего значения оценок по конкретному предмету.
    public double averageGradeOfSubject(String subject){
        return gradeList.stream()
                .filter(n -> n.getSubject().equals(subject))
                .mapToDouble(n -> n.getGrade().doubleValue())
                .average()
                .orElseThrow();
    }

    public synchronized List<StudentGrade<T>> getAll(){
        return List.copyOf(gradeList);
    }
}
