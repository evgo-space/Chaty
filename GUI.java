 
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class GUI {

    Chatbot chbt = new Chatbot();

    private JTextArea ca = new JTextArea();
    private JTextField chatbox = new JTextField(); 



    public GUI(){ 

        JFrame frame = new JFrame(); 
        /**JPanel jp = new JPanel(); 
        JLabel jl = new JLabel();
        JTextField jt = new JTextField(30);
        jp.add(jt);

        jt.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                String userInput = jt.getText();
                jl.setText(userInput);
            }
        });

        jp.add(jl);**/

        //jp.setBorder(BorderFactory.createEmptyBorder(30,30,10,30));
       // jp.setLayout(new GridLayout(0,1));

        //frame.add(jp, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Casual ChatBot");
        frame.setSize(600,600);
        //frame.pack();
        frame.setVisible(true);
        frame.setResizable(false);
        frame.setLayout(null);
        frame.add(chatbox);
        frame.add(ca);

        //setting area

        ca.setSize(500,400);
        ca.setLocation(2, 2);

        // setting text area

        chatbox.setSize(540,30);
        chatbox.setLocation(2,500);


        
        chatbox.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                String userInput =chatbox.getText();
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