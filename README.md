# Kushagra_TG_Assignment-1

Assignment 1: 
-> has a calculator applicatiion with basic functinalities including: +, -, x, / and modulo operator.
-> in the src->main->scala->Main.scala : we have the core logic for functioning of the Calculator.
-> int src->test->scala->CalculationOperationstest2.scala is a class which extends AnyFunSuite for testing the application.
-> the testing environment uses the methods "intercept" with "Matcher -> should" in order to handle a special test case of
   division of a number by ZERO.
-> Matchers have been used to assert an exception which can be arisen
   in case of division by ZERO, therefore used "intercept" method
   to catch the exception and "should be" as matcher to assert the Exception
