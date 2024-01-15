public class square extends figure{
    private double a;
    private double diagonal;
    public square(double a){
        this.a = a;
        diagonal = 0;
    }
    public double getDiagonal() {
        return diagonal;
    }
    public double Area(){
        diagonal=Math.sqrt(2)*a;
        area=Math.pow(a,2);
        perimeter = (int) (a * 4);
        return 0;
    }
}
