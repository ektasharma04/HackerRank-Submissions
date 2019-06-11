import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class PlusMinus {

    // Complete the plusMinus function below.
    static void plusMinus(int[] arr) {
        int pos=0;
        int neg=0;
        int neutral=0;
        int tot=arr.length;
        for(int num:arr)
        {

            if(num==0)
            {
                neutral++;
            }
            else if(num>0)
            {
                pos++;
            }
            else
            {
                neg++;
            }
        }
        DecimalFormat df = new DecimalFormat("#.######");
        System.out.println(df.format(Double.valueOf(pos)/tot));
        System.out.println(df.format(Double.valueOf(neg)/tot));
        System.out.println(df.format(Double.valueOf(neutral)/tot));


    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        plusMinus(arr);

        scanner.close();
    }
}
