package Chapter5Labs;

import java.util.Scanner;
import java.util.InputMismatchException;

public class NameAgeChecker {
    
    public static void main(String[] args) {
        
        Scanner scnr = new Scanner(System.in);

        String inputName;
        int age;

        inputName = scnr.next();

        while (!inputName.equals("-1")) {
            try { 
                age = scnr.nextInt();
                System.out.println(inputName + " " + (age + 1));
            }

            catch (InputMismatchException e) {
                age = scnr.nextInt();
                System.out.println(inputName + " " + (age - age));
                inputName  = scnr.next();
            }
        }
        
    }
}
