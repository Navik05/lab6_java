public class circle extends figure implements Cloneable {
    private double r;
    private double d;

    public circle(double r) {
        this.r = r;
        d = 0;
    }

    public double getD() {
        return d;
    }

    public void workCircle() {
        d = r * 2;
        area = 3.14 * Math.pow(r, 2);
        perimeter = (int) (3.14 * 2 * r);
    }

    public double Area() {
        return area;
    }

    public circle clone() throws CloneNotSupportedException {

        return (circle) super.clone();
    }
}
