import javax.swing.*;

import java.util.Scanner;

public class PasswordGenUI extends JFrame {

    private static int userInLen = 0;
    private static int userInUp = 0;
    private static int userInNum = 0;
    private static int userInSpc = 0;

    
    Scanner scanner = new Scanner(System.in);
    
    public PasswordGenUI() {
    


    setTitle("Password Generator");
    setSize(400, 300);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setLocationRelativeTo(null);
    
  
    // JLabel label = new JLabel("Password Length:");
    // JTextField lengthField = new JTextField(10);
    // JButton generateBtn = new JButton("Generate");
    // JLabel resultLabel = new JLabel("password shows here"); 
    
     
    
    
    JPanel panel = new JPanel();
    panel.setLayout(null);


    JLabel labelPassLen = new JLabel("Password Length:");
    labelPassLen.setBounds(0, 10, 150, 30);
    JTextField inputPassLen = new JTextField();
    inputPassLen.setBounds(125, 10, 150, 30);
    

    JLabel labelUpNum = new JLabel("Number of upercase:");
    labelUpNum.setBounds(0, 50, 150, 30);
    JTextField inputUpNum = new JTextField();
    inputUpNum.setBounds(125, 50, 150, 30);
    

    JLabel labelNumNum = new JLabel("Number of numbers:");
    labelNumNum.setBounds(0, 90, 150, 30);
    JTextField inputNumNum = new JTextField();
    inputNumNum.setBounds(125, 90, 150, 30);

    
    JLabel labelSpcNum = new JLabel("Number of numbers:");
    labelSpcNum.setBounds(0, 130, 150, 30);
    JTextField inputSpcNum = new JTextField();
    inputSpcNum.setBounds(125, 130, 150, 30);


    
    JLabel labelOutput = new JLabel("Output");
    labelOutput.setBounds(160, 170, 150, 30);
        
    JLabel labelOutputLine = new JLabel("----------------------------");
    labelOutputLine.setBounds(122, 180, 150, 30);

    JLabel labelOutputAnwser = new JLabel("");
    labelOutputAnwser.setBounds(100, 200, 150, 30);

    
    
    
    JButton confirmBut = new JButton("Generate");
    confirmBut.setBounds(280, 10, 100, 150);
    confirmBut.addActionListener(e -> {

        userInLen = Integer.parseInt(inputPassLen.getText());
        userInUp = Integer.parseInt(inputUpNum.getText());
        userInNum = Integer.parseInt(inputNumNum.getText());
        userInSpc = Integer.parseInt(inputSpcNum.getText());

         labelOutputAnwser.setText(Generator.generate(userInLen, userInUp, userInNum, userInSpc));
        

        if (userInLen > 26 || userInLen < 0) {
            System.out.println("WARNING: Password Langth is invalid!");
            System.exit(0);
        }

    
        });
    
   
    
    panel.add(labelPassLen); 
    panel.add(inputPassLen);
    
    panel.add(labelUpNum);
    panel.add(inputUpNum);

    panel.add(labelNumNum);
    panel.add(inputNumNum);


    panel.add(labelSpcNum);
    panel.add(inputSpcNum);
    
    panel.add(confirmBut);

    panel.add(labelOutput);
    panel.add(labelOutputLine);
    
    
    panel.add(labelOutputAnwser);
    add(panel);
    setVisible(true);


}

    public static int getUserIn() {
        return userInLen;
    }


}