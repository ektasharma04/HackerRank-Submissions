import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class RepeatedString {

    // Complete the repeatedString function below.
    static long repeatedString(String s, long n) 
    {
        long sLength=s.length();//get length of string
        if(sLength==1 && s.equalsIgnoreCase("a"))
        {
            return n;
        }
        else if(sLength==1)
        {return 0;}
        //find the number of repetitions possible for the string
        long repNum=n/sLength;
        //find the number of a's in string
        long aCount=0;
        for(char a:s.toCharArray())
        {
                if(a=='a')
                {
                    aCount++;
                }
        }
        long checkEvenSet=n%sLength;
        if(checkEvenSet==0)
        {
            
            return aCount*repNum;
        }
        else
        {
            String sSub=s.substring(0,Math.toIntExact(checkEvenSet));
            return (aCount*repNum)+countA(sSub.toCharArray());
        }

    }
    public static long countA(char arr[])
    {
        long aCount=0;
        for(char a:arr)
        {
                if(a=='a')
                {
                    aCount++;
                }
        }
        return aCount;
    }
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scanner.nextLine();

        long n = scanner.nextLong();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        long result = repeatedString(s, n);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
