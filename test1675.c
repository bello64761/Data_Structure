# Data_Structure

import java.util.Scanner;

public class test1675 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("문자를 입력해주세요 : ");
    String str = sc.nextLine();
    
    char temp;
    int count = 0;
    
    for(int i=0; i<str.length(); i++) {
      temp = (char)(str.charAt(i) - 3);
      
      if(temp == 29) {
        temp = ' ';
        }
        else if(temp < 65) {
          count = (65-(int)temp);
          temp = (char)(91 - count);
        }
        else if(temp < 97) {
          count = (97-(int)temp);
          temp = (char)(123 - count);
        }
        System.out.print(temp);
        }
    }
}
