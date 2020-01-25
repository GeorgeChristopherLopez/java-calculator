import javax.swing.*;


/***********************************************
// model : data and methods
// view : user interface
//controller : coordinating btwn View and Model
***********************************************/


// model
public class CalculatorModel {
     private int AnsValue;
     public void add(int num1, int num2){
                  AnsValue = num1 + num2;
     }

     public int getAnsValue(){
            return AnsValue;
     }
}
