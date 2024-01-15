import java.util.*;

public class main {
    public static void main(String[] args) throws Exception {
        int i, j, f = 1;
        double e, s = 0, p = 0;
        double[] sides = new double[3];
        square one = null;
        circle two = null;
        triangle three = null;
        CompareFigure compareFigure = new CompareFigure();
        Set set = new TreeSet(compareFigure);
        Scanner in = new Scanner(System.in);
        j = 0;
        //Ввод и обработка
        do {
            System.out.print("\n1-квадрат\n2-круг\n3-треугольник\nВыберите фигуру:");
            figure.setType(in.nextInt());
            switch (two.type) {
                case 1:
                    System.out.print("Длина стороны квадрата:");
                    e = in.nextDouble();
                    one = new square(e);
                    one.Area();
                    set.add(one);
                    break;
                case 2:
                    System.out.print("Радиус круга:");
                    e = in.nextDouble();
                    two = new circle(e);
                    two.workCircle();
                    set.add(two);
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
                    set.add(three);
                default:
                    ;
            }
            j++;
        }while (j < 3);
        //Вывод результатов
        System.out.println(set);
    }
}

class CompareFigure implements Comparator<figure>{
    @Override
    public int compare(figure o1, figure o2){
        return o1.perimeter -o2.perimeter;
    }
}