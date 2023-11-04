class CalculationOperations{

  def addition(num1: Long, num2: Long): Long = {
    return (num1 + num2);
  }
  def difference(num1: Long, num2: Long): Long = {
    return (num1 - num2);
  }
  def product(num1: Long, num2: Long): Long = {
    return (num1*num2);
  }
  def division(dividend: Double, divisor: Int): Double = {
    // dividend is taken in Double to ensure the calculation happens
    // in floating-point arithmetic
    if(divisor == 0) throw new IllegalArgumentException("Division by zero is not allowed!!");
    return (dividend/divisor);
  }
  def find_remainder(num1 : Int, num2 : Int) : Int = {
    return (num1%num2);
  }

}

object Main extends App {

  val obj = new CalculationOperations();
//  println(obj.product(9, 5));
//  println(obj.difference(-9, -5));
  val res_division = obj.division(37, 23);
  println(obj.find_remainder(4, 8));
//  print(s"Quotient obtained is $res_division");
}
