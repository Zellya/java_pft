package ru.stqa.pft.sandbox;

public class Point {
  public int x;
  public int y;

  public Point(int x, int y) {
    this.x=x;
    this.y=y;
  }


  public double distance(){
    return Math.sqrt((this.x-this.y)*(this.x-this.y)+(this.x-this.y)*(this.x-this.y));
  }
}
