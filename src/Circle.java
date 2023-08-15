public class Circle extends Shape{

    private int radius;

    public Circle(){

    }

    public Circle(Circle target){
        super(target);
        if(target != null){
            this.radius = target.radius;
        }
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public Shape clone() {
        return new Circle(this);
    }
}
