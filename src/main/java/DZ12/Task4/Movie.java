package DZ12.Task4;

import java.util.Objects;

public class Movie {
    private String name;

    public Movie(String name){
        this.name = name;
    }



    @Override
    public boolean equals(Object o){
        if(o == null || o.getClass() != getClass())return false;
        else{
            Movie mov = (Movie) o;
            return Objects.equals(this.name,mov.name);
        }
    }

    @Override
    public int hashCode(){
        return Objects.hashCode(this.name);
    }
}

