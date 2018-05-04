import java.util.Scanner;

public class test1509 {
  
  public static void main(String[] args) {    
  Scanner sc = new Scanner(System.in);     
  System.out.print("10*10의 보트판을 입력해 주세요 : ");     
 
  int i, j, res;      
  int arr[][] = new int[12][12];    
  for(i = 1; i <= 11; i++) {      
    for(j = 1; j <= 10; j++) {      
      arr[i][j] = sc.nextInt();     
      }    
  }         
 
  for(j = 1; j <= 10; j++) {     
    if(arr[11][j] == 0) continue;     
    res = 0;     
    for(i = 10; i>= 1; i--) {      
      if(arr[i][j] != 0) {       
      res = arr[i][j];       
      break;      
      }     
    }     
    if(res == 0)      
      System.out.printf("%d safe\n", j);     
    else if(res > 0)      
      System.out.printf("%d crash\n", j);     
    else      
      System.out.printf("%d fall\n", j);     
      } 
    }
 }
