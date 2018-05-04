import java.util.Scanner;

public class test1915 {

  public static void main(String[] args) {  
    // TODO Auto-generated method stub  
    Scanner sc = new Scanner(System.in);  
    System.out.print("자연수 n을 입력하세요.(n<=20) : ");  
    int input = sc.nextInt();  
    System.out.println(factorial(input)); 
  }
 
 public static int factorial(int n) {  
  if (n <= 2) {    
        return 1;  
    }  
  else {   
        return factorial(n-1) + factorial(n-2);   
      }  
    } 
 }
