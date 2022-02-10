package ch01_string.lec05;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

public class Main {
  public String solution(String str) {
    String answer;
    char[] s = str.toCharArray();
    int lt = 0, rt = str.length() - 1;
    while (lt < rt) {
      if (!Character.isAlphabetic(s[lt])) {
        lt++;
      } else if (!Character.isAlphabetic(s[rt])) {
        rt--;
      } else {
        char tmp = s[lt];
        s[lt] = s[rt];
        s[rt] = tmp;
        lt++;
        rt--;
      }
    }
    answer = String.valueOf(s);
    return answer;
  }

  public static void main(String[] args) 
    throws IOException
  {
    Main T = new Main();
    InputStream is = new FileInputStream("ch01_string/lec05/input.txt");
    System.setIn(is);
    Scanner kb = new Scanner(System.in);
    String str = kb.next();
    System.out.print(T.solution(str));
    kb.close();
  }
}
