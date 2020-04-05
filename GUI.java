
import java.awt.*;
import java.awt.event.*;
import java.util.concurrent.TimeUnit;

import javax.swing.*;

public class GUI {

    Chatbot chbt = new Chatbot();
    private JLabel title = new JLabel("Chaty");
    private JTextArea ca = new JTextArea();
    private JTextField chatbox = new JTextField();
    private JScrollPane scrollPane = new JScrollPane(ca);

    public GUI() {

        JFrame frame = new JFrame();

        /**
         * JPanel jp = new JPanel(); JLabel jl = new JLabel(); JTextField jt = new
         * JTextField(30); jp.add(jt);
         * 
         * jt.addActionListener(new ActionListener(){ public void
         * actionPerformed(ActionEvent e){ String userInput = jt.getText();
         * jl.setText(userInput); } });
         * 
         * jp.add(jl);
         **/

        // jp.setBorder(BorderFactory.createEmptyBorder(30,30,10,30));
        // jp.setLayout(new GridLayout(0,1));

        // frame.add(jp, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Casual ChatBot");
        frame.setSize(600, 600);
        // frame.pack();
        frame.setVisible(true);
        frame.setResizable(false);
        frame.setLayout(null);
        frame.add(chatbox);
        frame.add(scrollPane);
        frame.add(title);

        // setting position of the chat field

        scrollPane.setSize(570, 450);
        scrollPane.setLocation(15, 70);

        // setting area of the input text field

        chatbox.setSize(540, 30);
        chatbox.setLocation(30, 535);
       
        // setting the area of the title

        title.setSize(200, 50);
        title.setLocation(250, 10);
        title.setFont(title.getFont().deriveFont(40f));
        title.setForeground(Color.white);

        //setting the frame colour
        frame.getContentPane().setBackground( Color.getHSBColor(170, 42, 76) );

        chatbox.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String userInput = chatbox.getText();
                ca.append("You : " + userInput + "\n");
                chatbox.setText("");

                // the bot reply
              
                 ca.append("ChatBot : " + chbt.ear(userInput) + "\n");

            }
        });


        






      
       
    }

    public static void main(String[] args) {
        
    new GUI();


    }


}