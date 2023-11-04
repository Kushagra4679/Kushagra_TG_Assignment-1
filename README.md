# Kushagra_TG_Assignment-1

<b>Assignment 1:</b> 
<i>
-> has a calculator applicatiion with basic functinalities including: +, -, x, / and modulo operator.

-> in the src->main->scala->Main.scala: we have the core logic for the functioning of the Calculator.

-> int src->test->scala->CalculationOperationstest2.scala is a class that extends AnyFunSuite for testing the application.

-> the testing environment uses the methods "intercept" with "Matcher -> should" to handle a unique test case of
   division of a number by ZERO.
   
-> Matchers have been used to assert an exception that can arise in case of division by ZERO, hence the "intercept" method
   has been used to catch the exception and "should be" as matcher to assert the Exception
</i>
