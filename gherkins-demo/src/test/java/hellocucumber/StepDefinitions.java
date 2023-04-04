package hellocucumber;

import io.cucumber.java.Before;
import io.cucumber.java.en.*;
import org.junit.jupiter.api.Assertions;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

public class StepDefinitions {
    private int number1, number2;
    private String operation;

    private Calculator c;

    @Before
    public void resetMemoryBeforeEachScenario() {
        number1 = 0;
        number2 = 0;
        operation = "";
    }
    @Given("I initialise a calculator")
    public void givenIInitialiseACalculator() {
        c = new Calculator();
    }

    @Given("an integer operation {string}")
    public void givenAnIntegerOperation(String op) {
        switch (op) {
            case "+"	->	operation = "+";
            case "-"	->	operation = "-";
            case "*"	->	operation = "*";
            case "/"	->	operation = "/";
            default		->	fail();
        }
    }

    @When("I enter the first number {int}")
    public void whenIProvideFirstNumber(int number1) {
        this.number1 = number1;
    }
    @And("I enter the second number {int}")
    public void whenIProvideSecondNumber(int number2) {
        this.number2 = number2;
    }

    @When("the second number cannot be {int}")
    public void the_second_number_cannot_be(int zero) {
        if(number2 == zero) {
            Assertions.fail();
        }
    }

    @Then("the operation results {int}")
    public void thenTheOperationEvaluatesTo(int expected) {
        int result = 0;
        switch (operation) {
            case "+"	->	result = c.addition(number1, number2);
            case "-"	->	result = c.subtraction(number1, number2);
            case "*"	->	result = c.multiplication(number1, number2);
            case "/"	->	result = c.division(number1, number2);
            default		->	fail();
        }
        assertEquals(expected, result);
    }




}
