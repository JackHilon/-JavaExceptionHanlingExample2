package exceptionexample2;

import java.util.logging.Level;
import java.util.logging.Logger;

public class ExceptionExample2 {

    public static void main(String[] args) {

        // checked vs. unchecked exceptions
        
        // unchecked exception inherited from RunTimeException Class always.
        try {
            String message = "message";
            char[] chars = message.toCharArray();
            char lastChar = chars[chars.length - 1]; // ((chars.length without -1) wrong index value (ArrayIndexOutOfBoundsException)
            // (ArrayIndexOutOfBoundsException) is an unchecked exception
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
            return; // this return prevents excuting System.out.println("This line after catch block");
        }
        System.out.println("This line after catch block");

        
        // checked exception (InterruptedException)
        try {
            Thread.sleep(5000); // sleeping 5 seconds
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        System.out.println("after sleeping 5 seconds");

        
        // checked exception (InterruptedException) via method
        try {
            DoSomethingafter10Seconds();
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }

    }

    public static void DoSomethingafter10Seconds() throws InterruptedException {
        Thread.sleep(10000);
        System.out.println("after 10 seconds................");
    }

}
