package ch01_string.lec03;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

public class Main {
  public String solution(String str) {
    String answer = "";
    int max = Integer.MIN_VALUE, pos;
    while ((pos = str.indexOf(' ')) != -1) {
      String tmp = str.substring(0, pos);
      int len = tmp.length();
      if (len > max) {
        max = len;
        answer = tmp;
      }
      str = str.substring(pos + 1);
    }
    if (str.length() > max)
      answer = str;
    return answer;
  }

  public static void main(String[] args)
    throws IOException
  {
    Main T = new Main();
    InputStream is = new FileInputStream("ch01_string/lec03/input.txt");
    System.setIn(is);
    Scanner kb = new Scanner(System.in);
    String str = kb.nextLine();
    System.out.print(T.solution(str));
    kb.close();
  }
}
