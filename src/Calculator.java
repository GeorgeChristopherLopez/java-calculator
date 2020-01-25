import javax.swing.*;

public class Calculator {

    public static void main (String [] args){

       CalculatorView theUI = new CalculatorView();
       CalculatorModel theData = new CalculatorModel();
       CalculatorController theController = new CalculatorController(theUI, theData);


    }
}
