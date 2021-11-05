package ru.stqa.pft.sandbox;

public class DZ1_1 {
  public static void main (String[] args){
    Point1 p1 = new Point1(3,3);
    Point1 p2 = new Point1(5,7);
    System.out.println("Расстояние между точками a и b = " + p1.distance(p2));
  }
}