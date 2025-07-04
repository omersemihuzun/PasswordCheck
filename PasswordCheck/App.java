package PasswordCheck;

import java.util.Scanner;

public class App {

    public static boolean isPasswordComplex(String password) {

         return password.length()>=6 
            && password.matches(".*\\d.*")
            && password.matches(".*[a-z].*")
            && password.matches(".*[A-Z].*");
      
      
        /*  if (password.length() < 6) {
            return false;
        }
        boolean hasLowerChc = false;
        boolean hasUpperChc = false;
        boolean hasNumber = false;

        for (int i = 0; i < password.length() || !hasLowerChc && !hasUpperChc && !hasNumber; i++) {

            char current = password.charAt(i);
            if (Character.isDigit(current)) {
                hasNumber = true;
            } else if (Character.isUpperCase(current)) {
                hasUpperChc = true;
            } else if (Character.isLowerCase(current)) {
                hasLowerChc = true;
            }
        }
            return hasNumber && hasLowerChc && hasUpperChc;   */
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("enter a new password:");
        String userInput = scanner.nextLine();
        System.out.println("Is the password Complex? " + isPasswordComplex(userInput));

    }
}
