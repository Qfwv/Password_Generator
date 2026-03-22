import javax.swing.*;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;


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
    labelPassLen.setBounds(5, 10, 150, 30);
    JTextField inputPassLen = new JTextField();
    inputPassLen.setBounds(130, 10, 145, 30);
    

    JLabel labelUpNum = new JLabel("Number of upercase:");
    labelUpNum.setBounds(5, 50, 150, 30);
    JTextField inputUpNum = new JTextField();
    inputUpNum.setBounds(130, 50, 145, 30);
    

    JLabel labelNumNum = new JLabel("Number of numbers:");
    labelNumNum.setBounds(5, 90, 150, 30);
    JTextField inputNumNum = new JTextField();
    inputNumNum.setBounds(130, 90, 145, 30);

    
    JLabel labelSpcNum = new JLabel("Number of special:");
    labelSpcNum.setBounds(5, 130, 150, 30);
    JTextField inputSpcNum = new JTextField();
    inputSpcNum.setBounds(130, 130, 145, 30);


    
    JLabel labelOutput = new JLabel("Output:");
    labelOutput.setBounds(35, 205, 150, 30);
        
    String outputlines = "____________________________________________________________";
    JLabel labelOutputLine = new JLabel(outputlines);
    labelOutputLine.setBounds(0, 155, 400, 30);

    JLabel labelOutputAnwser = new JLabel("");
    labelOutputAnwser.setBounds(100, 205, 150, 30);

    
    
    
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
    
        JButton copyToClip = new JButton("Copy");
        copyToClip.setBounds(280, 195, 100, 50);
        copyToClip.addActionListener(e -> {

            String password = labelOutputAnwser.getText();
            StringSelection selection = new StringSelection(password);
            Toolkit.getDefaultToolkit()
            .getSystemClipboard()
            .setContents(selection, null);


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
    
    panel.add(copyToClip);
    
    
    add(panel);
    setVisible(true);


}

    public static int getUserIn() {
        return userInLen;
    }


}