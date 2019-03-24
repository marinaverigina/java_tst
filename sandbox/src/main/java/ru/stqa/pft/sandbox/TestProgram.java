package ru.stqa.pft.sandbox;

public class TestProgram {
    public static void main(String[] args) {
        hello("user");
        hello("Marina");

        double v = 10;
        System.out.println("Площадь квадрата со стороной " + v + " равна " + area(v));

        double a = 5;
        double b = 4;
        System.out.println("Площадь прямоугольника со сторонами " + a + " и " + b + " равна " + area(a,b));

    }

    public static void hello(String s) {
        System.out.println("Hello, " + s);
    }

    public static double area(double x) {
        return x * x;
    }

    public static double area(double a, double b){
        return a*b;
    }
}