import java.io.*;
import java.lang.reflect.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.util.Scanner;

class Add {
    public void add(int... vars) {
        int sum = 0;
        String separator = "";
        for ( int i : vars ) {
            sum += i;
            System.out.print(separator + i);
            separator = "+";
        }
        System.out.println("=" + sum);
    }
}

public class Addition {

    public static void main(String[] args) {
        try{
            Scanner input = new Scanner(System.in);
            System.out.println("Enter 6 integers: ");
            int n1=input.nextInt();
            int n2=input.nextInt();
            int n3=input.nextInt();
            int n4=input.nextInt();
            int n5=input.nextInt();
            int n6=input.nextInt();
            Add ob=new Add();
            ob.add(n1,n2);
            ob.add(n1,n2,n3);
            ob.add(n1,n2,n3,n4,n5);
            ob.add(n1,n2,n3,n4,n5,n6);
            Method[] methods=Add.class.getDeclaredMethods();
            Set<String> set=new HashSet<>();
            boolean overload=false;
            for(int i=0;i<methods.length;i++)
            {
                if(set.contains(methods[i].getName()))
                {
                    overload=true;
                    break;
                }
                set.add(methods[i].getName());

            }
            if(overload)
            {
                throw new Exception("Overloading not allowed");
            }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }




}


