
package edp;


import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;


public class EDP {
    static void myGUI() {
        JFrame frame = new JFrame("Welcome");

        frame.setSize(500, 150);
        
        //the name panel with textfield and label
        JLabel label=new JLabel("Name");
        JTextField textName=new JTextField(15);
        

     frame.add(label);
     frame.add(textName);

        //the age panel with textfield and label
        JLabel age = new JLabel("Age:");
        JTextField textAge = new JTextField(5);
        //String ageString = textAge.getText(); 
        //int AgeInt = Integer.parseInt(ageString); 
     frame.add(age);
     frame.add(textAge);
     
        //button
        JButton button = new JButton("Click here");
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String age=textAge.getText();
                int ageInt= Integer.parseInt(age);
                 String name=textName.getText();               
         if(ageInt<=18)
                JOptionPane.showMessageDialog(null,"Hello "+name+" "+ "You can't access, 18+ only");
         else
                JOptionPane.showMessageDialog(null,"Hello "+name+" "+ "Welcome");
         
                //String name=textName.getText();
                //JOptionPane.showMessageDialog(null,"Hello "+name+" "+ ageInt);

            }
        });
        button.setBounds(50, 100, 95, 30);
     frame.add(button);
     
     frame.setLocationRelativeTo(null);
     frame.setLayout(new FlowLayout()); 
     frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     frame.setVisible(true);

}

    public static void main(String[] args) {
        myGUI();
        
    }
    
}
