package Chapter12;
import javax.swing.*;

import javax.swing.*;

public class SimpleGui1 {
    public static void main (String[] args) {
        JFrame frame = new JFrame();
        //making a frame

        JButton button = new JButton("click me");
        //making a button
        //we can pass the button constructor the text we want on the button

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //this makes the program quit as soon as we close the window
        //if we leave this out it will just sit there on the screen forever

        frame.getContentPane().add(button);
        //adding the button to the frame's content pane

        frame.setSize(300,300);
        //giving the frame a size in pixels

        frame.setVisible(true);
        //making it visible, otherwise we will not see anything when we run this code
    }
}
