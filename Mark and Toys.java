import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class MarkAndToys 
{

    /*
     * Complete the 'maximumToys' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY prices
     *  2. INTEGER k
     */

    public static int maximumToys(List<Integer> prices, int k) 
    {
    // Write your code here

        Collections.sort(prices);
        int count=0;
        int totalcost=0;
        for(int i=0;i<prices.size();i++)
        {
            if(totalcost+prices.get(i)<=k)
            {
                count++;
                totalcost+=prices.get(i);
            }
            else
            {
                break;
            }
        }
        return count;
    }
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        List<Integer> prices=new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            prices.add(sc.nextInt());
        }
        int result=maximumToys(prices, k);
        System.out.println(result);
        sc.close();
    }

}


