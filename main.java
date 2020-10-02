import java.io.*;
import java.util.*;

public class Main{

public static void main(String[] args) throws Exception {
    // write your code here
    Scanner scn=new Scanner(System.in);
    int n=scn.nextInt();
    int ans[]=new int[n+1];
    System.out.println(fib(n,ans));
    
 }
 public static int fib(int n,int[] ans){
     if(n==0 || n==1){
         return n;
     }
     if(ans[n] != 0){
         return ans[n];
     }
     
     int fibnm1=fib(n-1,ans);
     int fibnm2=fib(n-2,ans);
     int fibnm=fibnm1+fibnm2;
     
     ans[n]=fibnm;
     return fibnm;
 }

}
