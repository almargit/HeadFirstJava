package Chapter12;
import javax.swing.*;
import java.awt.event.*;
//a new import statement for the package that ActionListener and ActionEvent are in

public class SimpleGui1B implements ActionListener {
    //ActionListener implements the interface. This says, "an instance of SimpleGui1B IS-A ActionListener"
    //The button will give events only to ActionListener implementers

    JButton button;

    public static void main (String[] args) {
        SimpleGui1B gui = new SimpleGui1B();
        gui.go();
    }

    public void go() {
        JFrame frame = new JFrame();
        button = new JButton("click me");

        button.addActionListener(this);
        //register your interest with the button. This says to the button, "Add me to your list of listeners".
        //The argument you pass MUST be an object from a class that implements ActionListener!!!


        frame.getContentPane().add(button);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300,300);
        frame.setVisible(true);
    }

    public void actionPerformed (ActionEvent event) {
        //Implement the ActionListener interface's actionPerformed().. This is the actual event handling method!
        button.setText("I've been clicked!");
        //The button calls this method to let you know an event happend.
        //It sends you an ActionEvent object as the argument, but we do not need it.
        //Knowing the event happened is enough info for us.
    }
}
