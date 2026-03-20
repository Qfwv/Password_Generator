//imports
import java.util.Scanner;

class PasswordGen {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println(" ---------------------------");
        System.out.println("| Terminal Password Manager |");
        System.out.println(" ---------------------------");
        
        System.out.println("NOTE: System will priortize length leading to possible inaccuracy on amount of custom additions");
        System.out.println("-------------------------------------------------------------------------------------------------");

        
        System.out.println("How long should the password be?");
        System.out.print(">");
        int passLength =  scanner.nextInt();
        
        if (passLength > 26 || passLength < 0) {
            System.out.println("WARNING: Password Langth is invalid!");
            System.exit(0);
        }
        

        System.out.println("How many uppercase letter should the password have?");
        System.out.print(">");
        int passUpCase =  scanner.nextInt();

        System.out.println("How many numbers should the password have?");
        System.out.print(">");
        int passNumAmount = scanner.nextInt();

        System.out.println("How many special charcters should the password have?");
        System.out.print(">");
        int passSpecialAmount = scanner.nextInt();

        // System.out.println("Avoid ambiguous characters?");
        // System.out.print(">");
        // boolean passAvoidAmbig = scanner.nextBoolean();

        scanner.close();

       
        System.out.println(Generator.generate(passLength, passUpCase, passNumAmount, passSpecialAmount));




       

    }
}