import java.util.Random;
import java.util.Scanner;

public class randomPasswordGenerator {
    public static void main(String[] args){
        System.out.println("Welcome to the password generator >>");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the length of the password : ");
        int lengthOfPassword = input.nextInt();

        String UpperCaseLetters = "QWERTYUIOPLKJHGFDSAZXCVBNM";
        String LowercaseLetters = "qwertyuioplkjhgfdsazxcvbnm";
        String Numbers = "1234567890";
        String symbols = "~!@#$%^&*()_+<>:?/";

        String StringPool = " ";

        System.out.println("upperCaseLetters yes / no");
        if(input.next().equalsIgnoreCase("yes")){
            StringPool += UpperCaseLetters;
        }
        System.out.println("LowerCaseLetters yes / no");
        if(input.next().equalsIgnoreCase("yes")){
            StringPool += LowercaseLetters;
        }
        System.out.println("Numbers yes/no");
        if(input.next().equalsIgnoreCase("yes")){
            StringPool += Numbers;
        }
        System.out.println("Symbols yes / no");
        if(input.next().equalsIgnoreCase("yes")){
            StringPool += symbols;
        }
        StringBuilder password = new StringBuilder();
        Random random = new Random();

        for(int i = 0 ; i < lengthOfPassword ; i++){
            int index = random.nextInt(StringPool.length());
            password.append(StringPool.charAt(index));
        }
        System.out.println(password);
    }

}
