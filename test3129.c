import java.util.Scanner;

public class test3129 {
  public static void main(Stirng[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("괄호를 입력해주세요 : ");
    String str = sc.nextLine();
    
    int i;
    int top = -1;
    boolean done = true;
    
    for(i = 0; i < str.length(); i++) {
      if(str.charAt(i) == '(')
        top++;
      else
        if(top != -1)
          top--;
        else {
          done = false;
          break;
        }
      }
        if(done && top == -1)
          System.out.println("good");
         else
          System.out.println("bad");
     }
 }
    
    
