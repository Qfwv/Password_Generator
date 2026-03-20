

public class Generator {
      
    static final String letLow = "qwertyuiopasdfghjklzxcvbnm";
    static final String letUp = "QWERTYUIOPASDFGHJKLZXCVBNM";
    static final String num = "1234567890";
    static final String special = "!@#$%^&*()";
    

    public static String generate(int length, int upAmount, int numAmount, int specialAmount) {

        
        char[] lowChars = letLow.toCharArray();
            for (int i = lowChars.length - 1; i > 0; i--) {
                int j = (int)(Math.random() * (i + 1));
                char tmp = lowChars[i]; lowChars[i] = lowChars[j]; lowChars[j] = tmp;
            }

        char[] upChars = letUp.toCharArray();
            for (int i = upChars.length - 1; i > 0; i--) {
                int j = (int)(Math.random() * (i + 1));
                char tmp = upChars[i]; upChars[i] = upChars[j]; upChars[j] = tmp;
            }

        char[] numChars = num.toCharArray();
            for (int i = numChars.length - 1; i > 0; i--) {
                int j = (int)(Math.random() * (i + 1));
                char tmp = numChars[i]; numChars[i] = numChars[j]; numChars[j] = tmp;
            }

        char[] specialChars = special.toCharArray();
            for (int i = specialChars.length - 1; i > 0; i--) {
                int j = (int)(Math.random() * (i + 1));
                char tmp = specialChars[i]; specialChars[i] = specialChars[j]; specialChars[j] = tmp;
            }
        
        
        StringBuilder sb = new StringBuilder();
        
        
        for (int i = 0; i < length; i++) {
            sb.append(letLow.charAt((int)(Math.random() * letLow.length())));
        }
        

        sb.append(letUp.substring(letUp.length() - upAmount));

        sb.append(num.substring(num.length() - numAmount));

        sb.append(special.substring(special.length() - specialAmount));

        String temp = sb.toString();
        
        temp = temp.substring(upAmount + numAmount + specialAmount);
    

        char[] newPass = temp.toCharArray();

       
        String finalPass = "";

        for (int i = newPass.length - 1; i > 0; i--) {
            
            int j = (int)(Math.random() * (i + 1));
            char tmp = newPass[i];
            newPass[i] = newPass[j];
            newPass[j] = tmp;
        }

       finalPass = new String(newPass); 
        
    
       if (upAmount + numAmount + specialAmount > length) {
        System.out.println("-------------------------------------------------------------------------------------------------");
        System.out.println("WARNING: Total amount of custom additions (e.g., amount of numbers) exceeds total pasword length!");
    }   
       
   
        return finalPass;
    }  







}