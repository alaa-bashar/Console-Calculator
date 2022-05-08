/*
    Project Name: My Claculator.
    How it works?
        1. Display modes.
        2. Display the prober menu according to the selected mode
        3. Case Standard mode:
            3.1. Diplay the Standard operations (+, -, *, /, %)
            3.2. Display the result according to selected operation.
        4. Case Scientific mode:
            4.1. Diplay the Scientific Menu (Trigonometric, Exponent, Rounding):
                4.1.1. Display the Trigonometric Methods (sin, cos, tan, acos, asin, atan).
                4.1.2. Display the result according to the selected Trigonometric method.
                4.1.3. Display the Exponent (exp, log, log10, pow, sqrt).
                4.1.4. Display the result according to the selected Exponent method.
                4.1.5. Display the Rounding Methods (ceil, floor, rint, int round, abs).
                4.1.6. Display the result according to the selected Rounding method.
        5. Case any wrong choice, make the user tries again.
        6. Case result is displayed ask user wether to continue or exit.
        7. Case continue, Go to step 1.
        8. Case exit, end the program.
*/

package mycalculator;

import java.util.Scanner;

public class MyCalculator {

    /* 
    *   Intialzing a static object from the Scanner class, 
    *   so we can take input form the user directly in the consol...
    *   static so we can use it in main method (which is static by default).
    */
    static Scanner in = new Scanner(System.in);
    
    /*
        Main method - contains the start point of the program
        1. Display the Modes.
        2. Display the prober menu according to the selected mode.
        3. Ask the user wether to continue or exit.
    */
    public static void main(String[] args) {

        boolean again;
        do {
            // Choose mode
            boolean isRightMode;
            do {
                isRightMode = true;
                System.out.println("1. Standard Mode.");
                System.out.println("2. Scientific Mode.");
                System.out.print("Choose mode 1 or 2:   ");
                int mode = in.nextInt();
                switch (mode) {
                    // Case the user choosed the Standard Mode
                    case 1:
                        standardMode();
                        break;
                    // Case the user choosed the Scientific Mode
                    case 2:
                        scientificMode();
                        break;
                    // Case wrong choice
                    default:
                        System.out.println(">>> Wrong choice, try again...");
                        isRightMode = false;
                }
            } while(!isRightMode);
            System.out.print("Press any key to exit or \"y\" to continue...   ");
            char choice = in.next().charAt(0);
            switch(choice){
                case 'y':
                case 'Y':
                    again = true;
                    break;
                default:
                    again = false;
                    System.out.println("Thank you for using my calculator. The calculator is off now.");
            }
        } while (again);

    }
    
    
    /*  
        Method contains all needed code for the Standard Mode...
        1. Ask the user to enter 2 numbers.
        2. Display the standered operations (+, -, *, /, %).
        3. Display the result according to the selected operation.
    */
    public static void standardMode (){
        
        System.out.println("***** Standard Mode *****");
        
        // asking the user to enter 2 numbers
        System.out.print("Enter number 1:   ");
        double n1 = in.nextDouble();
        System.out.print("Enter number 2:   ");
        double n2 = in.nextDouble();
        
        // Choose Standard Mode operation
        boolean isRightOp;
        do {
            isRightOp = true;
            System.out.println("1. Addition.");
            System.out.println("2. Subtraction.");
            System.out.println("3. Multiplication.");
            System.out.println("4. Division.");
            System.out.println("5. Modulus.");
            System.out.print("Choose an opertaion 1, 2, 3, 4 or 5:  ");
            int operation = in.nextInt();
            switch(operation){
                // Case the user choosed the Addition
                case 1:
                    System.out.println(n1 + " + " + n2 + " = " + (n1 + n2));
                    break;
                // Case the user choosed the Subtraction
                case 2:
                    System.out.println(n1 + " - " + n2 + " = " + (n1 - n2));
                    break;
                // Case the user choosed the Multiplication
                case 3:
                    System.out.println(n1 + " * " + n2 + " = " + (n1 * n2));
                    break;
                // Case the user choosed the Division
                case 4:
                    System.out.println(n1 + " / " + n2 + " = " + (n1 / n2));
                    break;
                // Case the user choosed the Modulus
                case 5:
                    System.out.println(n1 + " % " + n2 + " = " + (n1 % n2));
                    break;
                // Case wrong choice
                default:
                    System.out.println(">>> Wrong choice, try again...");
                    isRightOp = false;
            }
        }while (!isRightOp);
    }
    
    
    /*
        Method contains all needed code for the Scientific Mode...
        1. Display the related Scientific Methods.
        2. Display the prober methods according to user selection.
    */
    public static void scientificMode() {
        
        // Choose Scientific Mode method
        boolean isRightMethod;
        do {
            isRightMethod = true;
            System.out.println("***** Scientific Mode *****");
            System.out.println("1. Trigonometric Methods.");
            System.out.println("2. Exponent Methods.");
            System.out.println("3. Rounding Methods.");
            System.out.print("Choose a Method 1, 2, or 3:  ");
            int operation = in.nextInt();
            switch(operation){
                // Case Trigonometric Methods
                case 1:
                    trigonometricMethods();
                    break;
                // Case Exponent Methods
                case 2:
                    exponentMethods();
                    break;
                // Case Rounding Methods
                case 3:
                    roundingMethods();
                    break;
                default:
                // Case Wrong choice
                    System.out.println(">>> Wrong choice, try again...");
                    isRightMethod = false;
            }
        } while (!isRightMethod);
    }
    
    
    /*
        Method contains all needed code for the Trigonometric Methods...
        1. Display the related Trigonometric Methods (sin, cos, tan, acos, asin, atan).
        2. Ask the user to enter 1 number.
        3. Display the result according to the selected method.
    */
    public static void trigonometricMethods(){
        
        // Choose one of the Trigonometric Methods
        boolean isRightMethod;
        do {
            isRightMethod = true;
            System.out.println("1. sin().");
            System.out.println("2. cos().");
            System.out.println("3. tan().");
            System.out.println("4. acos().");
            System.out.println("5. asin().");
            System.out.println("6. atan().");
            System.out.print("Choose a method 1, 2, 3, 4, 5 or 6:  ");
            int method = in.nextInt();
            double n = 0;
            if(method <= 6 || method >= 1){
                System.out.print("Enter number:  ");
                n = in.nextDouble();
            }
            switch(method){
                // Case sin
                case 1:
                    System.out.println("sin(" + n + ") = " + Math.sin(n));
                    break;
                // Case cos
                case 2:
                    System.out.println("cos(" + n + ") = " + Math.cos(n));
                    break;
                // Case tan
                case 3:
                    System.out.println("tan(" + n + ") = " + Math.tan(n));
                    break;
                // Case acos
                case 4:
                    System.out.println("acos(" + n + ") = " + Math.acos(n));
                    break;
                // Case asin
                case 5:
                    System.out.println("asin(" + n + ") = " + Math.asin(n));
                    break;
                // Case atan
                case 6:
                    System.out.println("asin(" + n + ") = " + Math.atan(n));
                    break;
                // Case wrong choice
                default:
                    System.out.println(">>> Wrong choice, try again...");
                    isRightMethod = false;
            }
        } while (!isRightMethod);
    }
    
    
    /*
        Method contains all needed code for the Exponent Methods...
        1. Display the related Exponent Methods (exp, log, log10, pow, sqrt).
        2. Ask the user to enter 2 numbers or 1 number according to the selected method.
        3. Display the result according to the selected method.
    */
    public static void exponentMethods(){
        
        // Choose one of the Exponent Methods
        boolean isRightMethod;
        do {
            isRightMethod = true;
            System.out.println("1. exp().");
            System.out.println("2. log().");
            System.out.println("3. log10().");
            System.out.println("4. pow().");
            System.out.println("5. sqrt().");
            System.out.print("Choose a method 1, 2, 3, 4 or 5:  ");
            int method = in.nextInt();
            double n1 = 0, n2 = 0;
            // Selecting how many numbers the user is entering based on the method
            if(method <= 5 || method >= 1){
                // Case he selected 4. pow operation, user enters 2 numbers
                if (method == 4)
                {
                    System.out.print("Enter number 1:  ");
                    n1 = in.nextDouble();
                    System.out.print("Enter number 2:  ");
                    n2 = in.nextDouble();                
                }
                // Case any other operation, user enters 1 number
                else{
                    System.out.print("Enter number:  ");
                    n1 = in.nextDouble();
                }
            }
            switch(method){
                // Case exp
                case 1:
                    System.out.println("exp(" + n1 + ") = " + Math.exp(n1));
                    break;
                // Case log
                case 2:
                    System.out.println("log(" + n1 + ") = " + Math.log(n1));
                    break;
                // Case log10
                case 3:
                    System.out.println("log10(" + n1 + ") = " + Math.log10(n1));
                    break;
                // Case pow
                case 4:
                    System.out.println("pow(" + n1 + ", " + n2 + ") = " + Math.pow(n1, n2));
                    break;
                // Case sqrt
                case 5:
                    System.out.println("sqrt(" + n1 + ") = " + Math.sqrt(n1));
                    break;
                // Case wrong choice
                default:
                    System.out.println(">>> Wrong choice, try again...");
                    isRightMethod = false;
            }
        } while (!isRightMethod);
    }
    
    
    /*
        Method contains all needed code for the Rounding Methods...
        1. Display the related Rounding Methods (ceil, floor, rint, int round, abs).
        2. Ask the user to enter 1 number.
        3. Display the result according to the selected method.
    */
    public static void roundingMethods(){
        
        // Choose one of the Rounding Methods
        boolean isRightMethod;
        do {
            isRightMethod = true;
            System.out.println("1. ceil().");
            System.out.println("2. floor().");
            System.out.println("3. rint().");
            System.out.println("4. int round().");
            System.out.println("5. abs().");
            System.out.print("Choose a method 1, 2, 3, 4 or 5:  ");
            int method = in.nextInt();
            double n = 0;
            // Asking the user to enter 1 number in case he/she choosed right
            if(method <= 5 || method >= 1){
                System.out.print("Enter number:  ");
                n = in.nextDouble();
            }
            switch(method){
                // Case ceil
                case 1:
                    System.out.println("ceil(" + n + ") = " + Math.ceil(n));
                    break;
                // Case floor
                case 2:
                    System.out.println("floor(" + n + ") = " + Math.floor(n));
                    break;
                // Case rint
                case 3:
                    System.out.println("rint(" + n + ") = " + Math.rint(n));
                    break;
                // Case round and return is int
                case 4:
                    System.out.println("int round(" + n + ") = " + Math.round(n));
                    break;
                // Case abs
                case 5:
                    System.out.println("abs(" + n + ") = " + Math.abs(n));
                    break;
                // Case wrong choice
                default:
                    System.out.println(">>> Wrong choice, try again...");
                    isRightMethod = false;
            }
        } while (!isRightMethod);
    }
}
