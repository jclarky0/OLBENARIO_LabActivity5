package LeapYear;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LeapYearGUI extends JFrame {
    JFrame frame = new JFrame("Leap Year Checker");
    private JPanel panelM;
    private JTextField textF;
    private JButton checkBtn;
public void YearChecker() {
    try{
    checkBtn.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            int year = Integer.parseInt(textF.getText());
            if (year % 4 == 0 || year % 100 == 0 || year % 400 == 0){
                JOptionPane.showMessageDialog(panelM, "Leap Year");
            } else {
                JOptionPane.showMessageDialog(panelM, "Not Leap Year");
            }
        }
    });
} catch(NumberFormatException e){
        JOptionPane.showInternalMessageDialog(panelM, "Invalid Input");
        }
   }
    public static void main(String[] args){
        LeapYearGUI LPG = new LeapYearGUI();
        LPG.setContentPane(LPG.panelM);
        LPG.setDefaultCloseOperation(EXIT_ON_CLOSE);
        LPG.setSize( 200,  200);
        LPG.setVisible(true);
        LPG.YearChecker();
    }
}