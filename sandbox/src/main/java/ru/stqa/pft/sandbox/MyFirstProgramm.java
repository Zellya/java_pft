package ru.stqa.pft.sandbox;

public class MyFirstProgramm {

 public static void main(String[] args) {
  hello("world");
  hello("user");
  hello("Guzel");

  Square s = new Square(5);
  System.out.println("Площадь квадрата со стороной " + s.l + " = " + s.area());

  Rectangle r = new Rectangle(4,6);
  System.out.println("Площадь прямоугольника со сторонами " + r.a + " и " + r.b + " = " + r.area());


 /////Point 01/10
  Point p1 = new Point(4, 6);
  Point p2 = new Point(6,8);

  System.out.println("Расстояние между двумя точками = " + distance(p1, p2));

  ////////////////////////////////////////////
 }
 public static void hello(String somebody) {

  System.out.println("Hello," +somebody+ "!");
 }


 public static double distance(Point p1, Point p2){
  return Math.sqrt((p1.x-p1.y)*(p1.x-p1.y)+(p2.x-p2.y)*(p2.x-p2.y));
 }
}

