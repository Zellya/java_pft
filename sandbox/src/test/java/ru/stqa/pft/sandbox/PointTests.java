package ru.stqa.pft.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;

@Test
public class PointTests {
  public void testDistance(){
    Point p1 = new Point(4,6);
    Point p2 = new Point(6,8);
    Assert.assertEquals(p1.distance(),2.8284271247461903);
  }
}
