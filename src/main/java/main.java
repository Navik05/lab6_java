import java.util.Scanner;
public class main {
    public static void main(String[] args) throws Exception {
        int i, f = 1;
        double e, s = 0, p = 0;
        double[] sides = new double[3];
        square one = null;
        circle two = null;
        triangle three = null;
        Scanner in = new Scanner(System.in);
        System.out.print("\n1-квадрат\n2-круг\n3-треугольник\nВыберите фигуру:");
        figure.setType(in.nextInt());
        //Ввод и обработка
        switch (two.type) {
            case 1:
                System.out.print("Длина стороны квадрата:");
                e = in.nextDouble();
                one = new square(e);
                one.Area();
                break;
            case 2:
                System.out.print("Радиус круга:");
                e = in.nextDouble();
                two = new circle(e);
                two.workCircle();
                break;
            case 3:
                System.out.print("Длина сторон треугольника:");
                for (i = 0; i < 3; i++) {
                    sides[i] = in.nextDouble();
                }
                three = new triangle(sides);
                try {
                    three.workTriangle();
                } catch (Exception ex) {
                    System.out.println(ex.getMessage());
                    f = 0;
                }
            default:
                ;
        }
        //Клонирование
        circle tw = null;
        try{
            tw = two.clone();
        }
        catch(CloneNotSupportedException ex){

            System.out.println("Клонирование не удалось");
        }
        //Вывод результатов
        if (f == 1) {
            System.out.print("\nФигура: ");
            switch (tw.type) {
                case 1:
                    System.out.print("квадрат");
                    e = one.getDiagonal();
                    System.out.printf("\nДиагональ: %f", e);
                    s = one.area;
                    p = one.getPerimeter();
                    break;
                case 2:
                    System.out.println("круг");
                    e = tw.getD();
                    System.out.printf("Диаметр: %f", e);
                    s = tw.Area();
                    p = tw.getPerimeter();
                    break;
                case 3:
                    i = three.getView();
                    switch (i) {
                        case 1:
                            System.out.print("равносторонний");
                            break;
                        case 2:
                            System.out.print("равнобедренный");
                            break;
                        case 3:
                            System.out.print("разносторонний");
                            break;
                        default:
                            ;
                    }
                    System.out.print(" треугольник");
                    s = three.Area();
                    p = three.getPerimeter();
                    break;
            }
            System.out.printf("\nПлощадь: %f", s);
            System.out.printf("\nПериметр: %f\n", p);
        }
    }
}