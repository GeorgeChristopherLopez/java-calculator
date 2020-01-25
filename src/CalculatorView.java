import javax.swing.*;
import java.awt.*;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.String;

import static javax.swing.JTextArea.*;

public class CalculatorView extends JFrame{
    // menu items
    private JMenuBar menuBar;
    private JMenu file;
    private JMenu edit;
    private JMenu help;
    private JMenuItem close;
    private JMenuItem copy;
    private JMenuItem view;
    private JMenuItem about;
    // calc items
    private JTextArea input = new JTextArea();

    // numbers + other buttons
    private JButton seven; private JButton eight; private JButton nine;
    private JButton four; private JButton five; private JButton six;
    private JButton one; private JButton two;  private JButton three;
    private JButton dot; private JButton zero;   private JButton equals;
    private JButton del; private JButton posneg;

    // operators
    private JButton divide; private JButton multiply;
    private JButton subtract;  private JButton add;
    private double num1; private double num2;
    private String operation;
    CalculatorView(){
         try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            JFrame.setDefaultLookAndFeelDecorated(true);
        } catch (Exception e){
            System.out.println("failed to load System Look");
        }
        // menu bar setup
        setMenuBar();
        // panel setup
        setCalcUI();

    }

    private void setMenuBar(){
        menuBar = new JMenuBar();
        file = new JMenu((" File "));
        edit = new JMenu((" Edit "));
        help = new JMenu((" Help "));
        close = new JMenuItem("Close");
        copy = new JMenuItem("Copy");
        view = new JMenuItem("View Help");
        about = new JMenuItem("About Calculator");
        setJMenuBar(menuBar);
        menuBar.add(file);
        menuBar.add(edit);
        menuBar.add(help);
        edit.add(copy);
        file.add(close);
        help.add(view);
        help.add(about);

        close.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });


        /*********************************
         * doesn't actually copy anything
         *********************************/
        copy.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String selected = input.getText();
                StringSelection str = new StringSelection(selected);
                Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
                clipboard.setContents(str, str);

            }
        });
        view.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
              JOptionPane.showMessageDialog(null,"Invalid. No help topics available",
                      "Calculator",JOptionPane.OK_OPTION);
            }
        });
        about.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null,"Invalid. No about topics available",
                        "Calculator",JOptionPane.OK_OPTION);
            }
        });

    }
    private  void setInputValue(){


        input = new JTextArea("0");

        input.setBounds(10,10,290, 50);
        input.setEditable(false);
       //FIND A BETTER REPLACEMENT
       //  input.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);

        input.setFont(new Font("Arial", Font.PLAIN, 32));
       add(input);
    }
    private void setButtons(){
        // row one
        seven = new JButton("7");
        seven.setBounds(10,70, 65, 55);
        add(seven);


        eight = new JButton("8");
        eight.setBounds(85,70, 65, 55);
        add(eight);
        nine = new JButton("9");
        nine.setBounds(160,70, 65, 55);
        add(nine);
        divide = new JButton("÷");
        divide.setBounds(235,70, 65, 55);
        add(divide);
        // row two
        four = new JButton("4");
        four.setBounds(10,140, 65, 55);
        add(four);
        five = new JButton("5");
        five.setBounds(85,140, 65, 55);
        add(five);
        six = new JButton("6");
        six.setBounds(160,140, 65, 55);
        add(six);
        multiply = new JButton("X");
        multiply.setBounds(235,140, 65, 55);
        add(multiply);
        // row three
        one = new JButton("1");
        one.setBounds(10,210, 65, 55);
        add(one);
        two = new JButton("2");
        two.setBounds(85,210, 65, 55);
        add(two);
        three = new JButton("3");
        three.setBounds(160,210, 65, 55);
        add(three);
        subtract = new JButton("-");
        subtract.setBounds(235,210, 65, 55);
        add(subtract);
        // row four
        zero = new JButton("0");
        zero.setBounds(10,280, 65, 55);
        add(zero);
        dot = new JButton(".");
        dot.setBounds(85,280, 65, 55);
        add(dot);
        posneg = new JButton("+/-");
        posneg.setBounds(160,280, 65, 55);
        add(posneg);
        add = new JButton("+");
        add.setBounds(235,280, 65, 55);
        add(add);
        equals = new JButton("=");
        equals.setBounds(10,350, 140, 55);
        add(equals);

        del = new JButton("DEL");
        del.setBounds(160,350, 140, 55);
        add(del);
        seven.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(input.getText().length() > 14){
                    return;
                }
                if(input.getText().equalsIgnoreCase("0")){
                 input.setText("7");
                 return;
                }
                input.setText(input.getText()+"7");
            }
        });
        eight.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(input.getText().length() > 14){
                    return;
                }
                if(input.getText().equalsIgnoreCase("0")){
                    input.setText("8");
                    return;
                }
                input.setText(input.getText()+"8");
            }
        });
        nine.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(input.getText().length() > 14){
                    return;
                }
                if(input.getText().equalsIgnoreCase("0")){
                    input.setText("9");
                    return;
                }
                input.setText(input.getText()+"9");
            }
        });

        four.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(input.getText().length() > 14){
                    return;
                }
                if(input.getText().equalsIgnoreCase("0")){
                    input.setText("4");
                    return;
                }
                input.setText(input.getText()+"4");
            }
        });
        five.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(input.getText().length() > 14){
                    return;
                }
                if(input.getText().equalsIgnoreCase("0")){
                    input.setText("5");
                    return;
                }
                input.setText(input.getText()+"5");
            }
        });
        six.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(input.getText().length() > 14){
                    return;
                }
                if(input.getText().equalsIgnoreCase("0")){
                    input.setText("6");
                    return;
                }
                input.setText(input.getText()+"6");
            }
        });
        one.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(input.getText().length() > 14){
                    return;
                }
                if(input.getText().equalsIgnoreCase("0")){
                    input.setText("1");
                    return;
                }
                input.setText(input.getText()+"1");
            }
        });
        two.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(input.getText().length() > 14){
                    return;
                }
                if(input.getText().equalsIgnoreCase("0")){
                    input.setText("2");
                    return;
                }
                input.setText(input.getText()+"2");
            }
        });
        three.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(input.getText().length() > 14){
                    return;
                }
                if(input.getText().equalsIgnoreCase("0")){
                    input.setText("3");
                    return;
                }
                input.setText(input.getText()+"3");
            }
        });
        zero.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(input.getText().length() > 14){
                    return;
                }
                if(input.getText().equalsIgnoreCase("0")){
                    input.setText("0");
                    return;
                }
                if((input.getText()) != "0"){
                    input.setText(input.getText()+"0");
                }

                if(input.getText() == "0"){
                    input.setText("0");
                }
            }
        });
        dot.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(input.getText().length() > 14){
                    return;
                }

                if(!input.getText().contains(".")){
                    input.append(".");
                }

            }
        });
        del.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(input.getText().length() == 1){
                    input.setText("0");
                    return;
                }

                if(input.getText().length() > 0){
                    input.setText(input.getText().substring(0, input.getText().length()-1));
                }

            }
        });
        posneg.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(input.getText().equalsIgnoreCase("0")){
                    return;

                }
                input.setText(Double.toString(Double.parseDouble(input.getText())*(-1.00)));

                if(input.getText().endsWith(".0")){
                    input.setText(input.getText().replace(".0",""));
                }
            }


        });

        divide.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               num1 = (Double.parseDouble(input.getText()));
               operation = "divide";
               input.setText("0");
            }
       });
        multiply.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                num1 = (Double.parseDouble(input.getText()));
                operation = "multiply";
                input.setText("0");
            }
        });

        subtract.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                num1 = (Double.parseDouble(input.getText()));
                operation="subtract";
                input.setText("0");
            }
        });
        add.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                num1 = (Double.parseDouble(input.getText()));
                operation = "add";
                input.setText("0");
            }
        });


        equals.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               if(operation=="divide"){
                   num2 = (Double.parseDouble(input.getText()));
                   input.setText(Double.toString(num1/num2));

               } else if (operation=="multiply"){
                   num2 = (Double.parseDouble(input.getText()));
                   input.setText(Double.toString(num1*num2));
               } else if (operation=="subtract"){
                   num2 = (Double.parseDouble(input.getText()));
                   input.setText(Double.toString(num1-num2));
               }else if (operation=="add"){
                   num2 = (Double.parseDouble(input.getText()));
                   input.setText(Double.toString(num1+num2));
               }
                if(input.getText().endsWith(".0")){
                    input.setText(input.getText().replace(".0",""));
                }
            }
        });

    }
    private void setCalcUI(){
        JPanel calcPanel = new JPanel();

        setInputValue();
        setButtons();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(325, 500);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
       this.setLayout(null);

        this.setVisible(true);


    }


    void displayErrorMessage(String errorMsg){
        JOptionPane.showMessageDialog(this, errorMsg);
    }
}
