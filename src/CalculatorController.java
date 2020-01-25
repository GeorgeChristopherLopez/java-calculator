import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculatorController {
    private CalculatorView theUI;
    private CalculatorModel theData;

    public CalculatorController(CalculatorView theUI, CalculatorModel theData){
        this.theUI = theUI;
        this.theData = theData;

      // this.theUI.addCalcListener(new CalcListener());
    }

  /*
  class CalcListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            int input1, input2 = 0;
            try{
                input1 = theUI.getInput1();
                input2 = theUI.getInput2();

                theData.add(input1, input2);
                theUI.setAns(theData.getAnsValue());
            }
            catch (NumberFormatException ex){
                theUI.displayErrorMessage("must enter 2 integers");
            }


        }


    }
*/
}
