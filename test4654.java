import java.util.Scanner;

public class test4654 {

  public static void main(String[] args) {    
  Scanner sc = new Scanner(System.in);     
  System.out.print("N을 입력해 주세요 : ");    
  int input = sc.nextInt();    
  int top[] = new int[input+1];    
  int arr[] = new int[input+1];    
  int stack[] = new int[input+1];
  
  int i;        
  
  for(i = 1; i <= input; i++)     
    top[i] = sc.nextInt();    
  
  int end = 0;       
  
  for(i = input; i >= 2; i--) {    
    if(top[i-1] >= top[i]) {     
      arr[i] = i-1;            
    
      while(end >= 1 && top[stack[end-1]] <= top[i-1]) {      
        arr[stack[end-1]] = arr[i];       
        end--;     
      }     
    } else {      
        stack[end++] = i;    
      }    
    }    
    for(i = 1; i<= input; i++)    
      System.out.print(arr[i] + " ");     
      } 
    }
