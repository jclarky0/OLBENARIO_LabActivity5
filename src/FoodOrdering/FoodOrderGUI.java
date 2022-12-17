package FoodOrdering;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FoodOrderGUI extends JFrame{
    JFrame frame = new JFrame("Food Ordering System");
    private JPanel panelM;
    private JCheckBox cPizza;
    private JRadioButton noneRB;
    private JButton orderB;
    private JCheckBox cBurger;
    private JCheckBox cSoftdrinks;
    private JCheckBox cFries;
    private JCheckBox cTea;
    private JCheckBox cSundae;
    private JRadioButton rb5;
    private JRadioButton rb10;
    private JRadioButton rb15;

    public void FoodOrderGUI(){
        orderB.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                double totalPrice = 0;


                if(cPizza.isSelected()){
                    totalPrice += 100;
                }
                if(cBurger.isSelected()){
                    totalPrice += 80;
                }
                if(cFries.isSelected()){
                    totalPrice += 65;
                }
                if(cTea.isSelected()){
                    totalPrice += 50;
                }
                if(cSundae.isSelected()){
                    totalPrice += 40;
                }
                if(cSoftdrinks.isSelected()){
                    totalPrice += 55;
                }
                if(rb5.isSelected()){
                    totalPrice *= 0.05;
                }
                if(rb10.isSelected()){
                    totalPrice *= 0.1;
                }
                if(rb15.isSelected()){
                    totalPrice *= 0.15;
                }
                JOptionPane.showMessageDialog(panelM, "The total price is PHP " + totalPrice);
            }
        });
    }
    public static void main(String[] args){
        FoodOrderGUI food = new FoodOrderGUI();
        food.setContentPane(food.panelM);
        food.setDefaultCloseOperation(EXIT_ON_CLOSE);
        food.setVisible(true);
        food.setSize(800, 400);
        food.FoodOrderGUI();
    }

}
