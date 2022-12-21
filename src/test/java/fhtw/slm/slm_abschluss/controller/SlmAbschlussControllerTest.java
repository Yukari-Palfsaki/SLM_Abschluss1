package fhtw.slm.slm_abschluss.controller;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SlmAbschlussControllerTest {
  @Test
  void calculate1SlmAbschlussApplicationTest(){
    var controller = new SlmAbschlussController();
    int result = controller.calculateGrade(100);
    assertEquals(1, result);
  }
  @Test
  void calculate2SlmAbschlussApplicationTest(){
    var controller = new SlmAbschlussController();
    int result = controller.calculateGrade(87);
    assertEquals(2, result);
  }
  @Test
  void calculate3SlmAbschlussApplicationTest(){
    var controller = new SlmAbschlussController();
    int result = controller.calculateGrade(72);
    assertEquals(3, result);
  }
  @Test
  void calculate4SlmAbschlussApplicationTest(){
    var controller = new SlmAbschlussController();
    int result = controller.calculateGrade(55);
    assertEquals(4, result);
  }
  @Test
  void calculate5SlmAbschlussApplicationTest(){
    var controller = new SlmAbschlussController();
    int result = controller.calculateGrade(0);
    assertEquals(5, result);
  }
}
