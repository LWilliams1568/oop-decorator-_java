package lashon.spring2021.assignment3;
import java.util.Scanner;
import java.io.*; 
  

public class Main {
    
    public static String containsValidBraces(String testString) {
         int n = testString.length(); 
    String valid= "valid";
    String notValid= "not valid";
    char f = testString.charAt(0);
    char l = testString.charAt(n-1);
    String first=String.valueOf(f);  
    String last=String.valueOf(l);
    String sub= testString.substring(1, n-1);
      System.out.println(sub);
      System.out.println(first);
      System.out.println(last);
    
    if( first=="(" && last==")"){
        return valid;
    }    
        
    else if( first=="{" && last=="}"){
        return valid;
         
    }
    
    else if ( first=="[" && last=="]"){
        return valid;
    }    
    
    else if (first != "(" && last != ")"){
        return valid;
        
    }
    
    else if (first != "{" && last != "}"){
        return valid;
    } 
    
    else if (first != "[" && last != "]"){
        return valid;
    }  
    
    else if (sub.contains("(")){
        return notValid;
    }  
    
    
    
    else{
        return notValid;
    }
    
      }

   
    
    public static void main(String[] args){
        String testString= "hello";
        containsValidBraces(testString);
        }
    }



    
      

