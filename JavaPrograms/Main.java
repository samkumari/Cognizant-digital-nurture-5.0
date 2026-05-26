import java.lang.ArithmeticException;  
public class Main {     
    // Function to check if a person is eligible to vote or not     
    public static void validate(int age) {    
        if(age < 18) {    
            // Throw ArithmeticException if not eligible to vote    
            throw new ArithmeticException("Person is not eligible to vote");      
        } else {    
            System.out.println("Person is eligible to vote!!");    
        }    
    }    
    // Main method    
    public static void main(String args[]) {    
        // Calling the function    
        validate(13);    
        System.out.println("rest of the code...");      
    }      
}  