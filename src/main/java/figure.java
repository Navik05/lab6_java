public abstract class figure {
    protected double area;
    protected int perimeter;
    protected static int type;
    public figure(){
        area = 0;
        perimeter = 0;
    }
    public abstract double Area();
    public double getPerimeter() {
        return perimeter;
    }
    public static void setType(int e) {
        type = e;
    }
}
