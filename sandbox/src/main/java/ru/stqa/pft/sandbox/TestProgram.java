package ru.stqa.pft.sandbox;

public class TestProgram {
    public static void main(String[] args) {
        hello("user");
        hello("Marina");

        Square s = new Square(5);
        System.out.println("Площадь квадрата со стороной " + s.l + " равна " + s.area());

        Rectangle r = new Rectangle(7,8);
        System.out.println("Площадь прямоугольника со сторонами " + r.a + " и " + r.b + " равна " + r.area());

    }

    public static void hello(String s) {
        System.out.println("Hello, " + s);
    }
}