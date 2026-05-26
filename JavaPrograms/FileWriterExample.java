import java.io.FileWriter;  
import java.util.*;
  
public class FileWriterExample {  
    public static void main(String args[]) {  
	Scanner sc=new Scanner(System.in);
	String x=sc.nextLine();
        try {  
            FileWriter fw = new FileWriter("testout.txt");  
            fw.write(x);  
            fw.close();  
            System.out.println("Success...");  
        } catch (Exception e) {  
            System.out.println(e);  
        }  
    }  
} 