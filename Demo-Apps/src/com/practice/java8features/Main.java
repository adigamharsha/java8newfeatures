
package comharsha.javaadmirer;

import java.lang.*;
import java.io.*;
import java.util.*;

public class Main
{
    
    private static void permutations(String finalString , String input){
        if(input.length() == 0  && input.isEmpty()){
            System.out.println(input);
        }else{
            for(int i =0 ; i<input.length() ; i++){
                permutations(finalString+input.charAt(i),input.substring(0,i)+input.substring(i+1,input.length()));
                System.out.println(finalString);
            }
            
        }
        
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);

        String sampleInput;
        int result = -404;
        sampleInput = sc.nextLine();
        System.out.println(sampleInput);
        permutations("" , sampleInput);
    
    }
}