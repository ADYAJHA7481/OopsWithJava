//Write a program to accept n number of arguments through command line and print largest among them
public class ex4 {
    public static void main(String[] args) {
        if (args.length == 0)
        {
            System.out.println("No arguments provided.");
            return;
        }    
        try {
            double largest = Double.parseDouble(args[0]);
    
            for (int i = 1; i < args.length; i++) {
                double current = Double.parseDouble(args[i]);
                if (current > largest) {
                    largest = current;
                }
            }    
            System.out.println("The largest number is: " + largest);
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please provide valid numeric arguments.");
        }
    }
} 