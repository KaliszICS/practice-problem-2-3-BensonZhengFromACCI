import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

public class PracticeProblemTest {

   @Test
   void circleArea1() {
      assertEquals(0, PracticeProblem.circleArea(0));
   }
 
   @Test
   void circleArea2() {
      assertEquals(Math.PI, PracticeProblem.circleArea(-1));
   }

   @Test
   void circleArea3() {
      assertEquals(2*2*Math.PI, PracticeProblem.circleArea(2));
   }
   
   @Test
   void circleArea4() {
      assertEquals(3*3*Math.PI, PracticeProblem.circleArea(3));
   }

   @Test
   void circleArea5() {
      assertEquals(1000*1000*Math.PI, PracticeProblem.circleArea(1000));
   }
   
   @Test 
   void minutesToHours1() {
      assertEquals("0 hours and 0 minutes", PracticeProblem.minutesToHours(0));
   }

   @Test 
   void minutesToHours2() {
      assertEquals("0 hours and 1 minutes", PracticeProblem.minutesToHours(1));
   }
   @Test 
   void minutesToHours3() {
      assertEquals("0 hours and 20 minutes", PracticeProblem.minutesToHours(20));
   }
   @Test 
   void minutesToHours4() {
      assertEquals("-1 hours and -40 minutes", PracticeProblem.minutesToHours(-100));
   }

   @Test
   void minutesToHours5() {
      assertEquals("21 hours and 40 minutes", PracticeProblem.minutesToHours(1300));
   }

   @Test 
   void simpleInterest1() {
      assertEquals(0.02, PracticeProblem.simpleInterest(1.0,1.0,2));
   }

   @Test 
   void simpleInterest2() {
      assertEquals(1, PracticeProblem.simpleInterest(1.0,1.0,100));
   }

   @Test 
   void simpleInterest3() {
      assertEquals(0.03, PracticeProblem.simpleInterest(1.0,1.0,3));
   }

   @Test 
   void simpleInterest4() {
      assertEquals(-5, PracticeProblem.simpleInterest(1.0,1.0,-500));
   }

   @Test 
   void simpleInterest5() {
      assertEquals(5000, PracticeProblem.simpleInterest(1.0,1.0,500000));
   }

   @Test
   void hypotenuse1() {
      assertEquals(5.0, PracticeProblem.hypotenuse(3, 4));
   }

   @Test
   void hypotenuse2() {
      assertEquals(10.0, PracticeProblem.hypotenuse(6, 8));
   }

   @Test
   void hypotenuse3() {
      assertEquals(7.0, PracticeProblem.hypotenuse(0, 7));
   }

   @Test
   void hypotenuse4() {
      assertEquals(0.0, PracticeProblem.hypotenuse(0, 0));
   }

   @Test
   void hypotenuse5() {
      assertEquals(Math.sqrt(2000000), PracticeProblem.hypotenuse(1000, 1000));
   }
}
