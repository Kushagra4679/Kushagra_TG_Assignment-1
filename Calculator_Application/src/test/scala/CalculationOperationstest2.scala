import org.scalatest.funsuite.AnyFunSuite

// Matchers have been used to assert an exception which can be arisen
// in case of division by ZERO, therefore used "intercept" method
// to catch the exception and "should be" as matcher to assert the Exception
import org.scalatest.matchers.should.Matchers

class CalculationOperationstest2 extends AnyFunSuite with Matchers {

  val calc_object = new CalculationOperations();

  test("Addition test") {
    assert(calc_object.addition(98, 100) == 198);
  }
  test("Addition test-2") {
    assert(calc_object.addition(-63, -98) == -161);
  }
  test("Difference test") {
    assert(calc_object.difference(90189, 3910) == 86279);
  }
  test("Difference test-2") {
    assert(calc_object.difference(-50, -50) == 0);
  }
  test("Product test") {
    assert(calc_object.product(758483, 43458) == 32962154214L);
  }
  test("Product test-2") {
    assert(calc_object.product(75, -2) == -150);
  }

  test("Division test") {
    assert(calc_object.division(37, 23) == 1.608695652173913);
  }

  test("Division_Exception test") {

    // ***** Learnt about intercept and Matchers *****

    val calc_object = new CalculationOperations();
    val exception_occured = intercept[IllegalArgumentException] {
      calc_object.division(17, 0);
    }
    exception_occured.getMessage should be("Division by zero is not allowed!!");
  }

  test("findingRemainderTest"){
    assert(calc_object.find_remainder(46, 32) == 14);
  }
  test("findingRemainderTest-2"){
    assert(calc_object.find_remainder(4, 8) == 4);
  }
  test("findingRemainderTes-3t"){
    assert(calc_object.find_remainder(8, 4) == 0);
  }
  test("findingRemainderTes-4"){
    assert(calc_object.find_remainder(4, 3) == 1);
  }

}
