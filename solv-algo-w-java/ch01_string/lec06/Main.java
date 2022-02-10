package ch01_string.lec06;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

public class Main {
  public String solution(String str) {
    String answer = "";
    for (int i = 0; i < str.length(); i++) {
      // System.out.println(str.charAt(i)+" "+i+" "+str.indexOf(str.charAt(i)));
      if (i == str.indexOf(str.charAt(i))) {
        answer += str.charAt(i);
      }
    }
    return answer;
  }

  public static void main(String[] args) 
    throws IOException
  {
    Main T = new Main();
    InputStream is = new FileInputStream("ch01_string/lec06/input.txt");
    System.setIn(is);
    Scanner kb = new Scanner(System.in);
    String str = kb.next();
    System.out.print(T.solution(str));
    kb.close();
  }
}
