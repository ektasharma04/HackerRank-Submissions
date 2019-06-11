import java.util.Scanner;
import java.util.regex.*;

public class PatternSyntaxChecker
{
    
	public static void main(String[] args) throws PatternSyntaxException
    {
        
		Scanner in = new Scanner(System.in);
		int testCases = Integer.parseInt(in.nextLine());
		while(testCases>0){
            try{
			String pattern = in.nextLine();
          	//Write your code
              testCases--;
                  Pattern.compile(pattern);
                  System.out.println("Valid");
                  
                 
                 
                 
              }
               catch(PatternSyntaxException pse)
                  {
                      System.out.println("Invalid");
                       
                  }
                  catch(Exception e){}
        }
		
        
	}
}



