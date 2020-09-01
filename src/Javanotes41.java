import javax.swing.*;

public class Javanotes41 {
    static String printCapitalized(String input){
        char[] butcheredString = input.toCharArray();
        for (int i = 0; i < butcheredString.length; i++){
            if (i == 0){
                String uppercase = "" + butcheredString[i];
                uppercase = uppercase.toUpperCase();
                butcheredString[i] = uppercase.charAt(0);
                input = "";
            } else if (butcheredString[i-1] == ' '){
                String uppercase = "" + butcheredString[i];
                uppercase = uppercase.toUpperCase();
                butcheredString[i] = uppercase.charAt(0);
            }
            input = input + butcheredString[i];
        }
        return input;
    }
    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog("Enter Text To Be Capitalized");
        String output = printCapitalized(input);
        System.out.println(output);
    }
}
