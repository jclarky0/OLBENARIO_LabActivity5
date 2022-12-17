package SimpleCalc;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SimpleCalcGUI extends JFrame {
    JFrame frame = new JFrame("Simple Calculator");
    private JPanel panelM;
    private JTextField textF;
    private JComboBox comboBx;
    private JButton computeResultButton;
    private JTextField textF2;
    private JTextField lblResult;

    public void Calculator() {
        computeResultButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {


                    int num1 = Integer.parseInt(textF.getText());
                    int num2 = Integer.parseInt(textF2.getText());
                    int result = 0;
                    String operation = (String)comboBx.getSelectedItem();

                    if (operation.equals("+")) {
                        result = num1 + num2;

                    } else if (operation.equals("-")) {
                         result = num1 - num2;

                    } else if (operation.equals("*")) {
                        result = num1 * num2;

                    } else if (operation.equals("/")) {
                        result = num1 / num2;

                    }
                    lblResult.setText(String.valueOf(result));
                }

            });
        }
        public static void main(String[] args){
        SimpleCalcGUI sc = new SimpleCalcGUI();
        sc.setContentPane(sc.panelM);
        sc.setDefaultCloseOperation(EXIT_ON_CLOSE);
        sc.setVisible(true);
        sc.setSize(500, 200);
        sc.Calculator();
        }
    }

