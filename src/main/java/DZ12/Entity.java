package DZ12;

public abstract class Entity {
    private String name;
    private int age;
    private boolean isActive;

    public Entity(String name, int age, boolean isActive){
        this.name = name;
        this.age = age;
        this.isActive = isActive;
    }

    public String getName(){
        return this.name;
    }
    public int getAge(){
        return this.age;
    }
    public boolean getIsActive(){
        return this.isActive;
    }

}
