package ch01_string.lec07;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

public class Main {
  public String solution(String str) {
    str = str.toUpperCase();
    int len = str.length();
    for (int i = 0; i < len / 2; i++) {
      if (str.charAt(i) != str.charAt(len - i - 1)) {
        return "NO";
      }
    }
    return "YES";
  }

  public static void main(String[] args) 
    throws IOException
  {
    Main T = new Main();
    InputStream is = new FileInputStream("ch01_string/lec07/input.txt");
    System.setIn(is);
    Scanner kb = new Scanner(System.in);
    String str = kb.next();
    System.out.print(T.solution(str));
    kb.close();
  }
}
