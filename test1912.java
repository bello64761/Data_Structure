import java.util.Scanner;

public class test1912 {

  public static void main(String[] args) {  
    // TODO Auto-generated method stub  
    Scanner sc = new Scanner(System.in);  
    System.out.print("n을 입력하세요.(n<=12) : ");  
    int input = sc.nextInt();  
    System.out.println(factorial(input)); 
 }
 
  public static int factorial(int n) {  
    if (n <= 1) {    
        return n;  
     }  
    else {  
        return n * factorial(n-1);  
        } 
    } 
 }
