package DZ2.Circle;

public class Circle {
    private int radius;

    public Circle(int x){
        this.radius = x;
    }

    public int getRadius(){
        return this.radius;
    }
    public void setRadius(int x){
        this.radius = x;
    }

    public double calculateArea() {
        return Math.PI * this.radius * this.radius;
    }

    public double calculateCircumference(){
        return 2 * this.radius * Math.PI;
    }




}
