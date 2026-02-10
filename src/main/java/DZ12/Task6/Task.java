package DZ12.Task6;

import java.time.LocalDate;
import java.util.Objects;

public class Task<T extends Number> {
    private T id;
    private String status;
    private String priority;
    private LocalDate date;

    public Task(T id, String status, String priority, LocalDate date){
        this.id = id;
        this.status = status;
        this.priority = priority;
        this.date = date;
    }

    public T getId(){
        return this.id;
    }
    public String getStatus(){
        return this.status;
    }
    public String getPriority(){
        return this.priority;
    }
    public LocalDate getDate(){
        return this.date;
    }

    @Override
    public boolean equals(Object o){
        if(o == null || o.getClass() != getClass()) return false;
        else {
            Task<T> task = (Task<T>) o;
            return Objects.equals(this.id, task.id);
        }
    }
    @Override
    public int hashCode(){
        return Objects.hashCode(id);
    }

}
