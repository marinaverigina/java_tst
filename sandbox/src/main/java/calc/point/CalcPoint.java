package calc.point;

public class CalcPoint {

    public static void main(String[] args){

        Point p1 = new Point(3,3);
        Point p2 = new Point(2,1);

        System.out.println("Paccтояние между точками p2 и p1 равно " + p1.distance(p2));
    }

}
