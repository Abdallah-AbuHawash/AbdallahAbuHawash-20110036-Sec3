
package edp;

//Libraries 
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
        JFrame frame = new JFrame("Welcome"); //declaring a frame

        frame.setSize(500, 150); //setting the frames size
        
        //the name panel with textfield and label
        JLabel name=new JLabel("Name");
        JTextField textName=new JTextField(15); //the textfield size and name
        

     frame.add(name); //adding the variable name to the frame
     frame.add(textName); //adding the textfield of name to the frame 

        //the age panel with textfield and label
        JLabel age = new JLabel("Age:");
        JTextField textAge = new JTextField(5);
     frame.add(age);
     frame.add(textAge);
     
        //button
        JButton button = new JButton("Click here");
        button.addActionListener(new ActionListener() { //listener 
            @Override
            public void actionPerformed(ActionEvent e) {
                String age=textAge.getText(); //transforming the textfield of age to a string
                int ageInt= Integer.parseInt(age); //transforming the string of age to an integer
                 String name=textName.getText();     
                 
         if(ageInt<18) //using if statement to decide which message to show if you're 18 and more then you can access it and if you're not then you can't
                JOptionPane.showMessageDialog(null,"Hello "+name+" "+ "You can't access, 18+ only");
         else
                JOptionPane.showMessageDialog(null,"Hello "+name+" "+ "Welcome");

            }
        });
        button.setBounds(50, 100, 95, 30); //the button's size
     frame.add(button); 
     
     frame.setLocationRelativeTo(null);
     frame.setLayout(new FlowLayout()); 
     frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // EXIT_ON_ClOSE so when I close the program it stops running automatically 
     frame.setVisible(true); //making the frame visible

}
    //main 
    public static void main(String[] args) {
        myGUI(); //calling the function
        
    }
    
}

