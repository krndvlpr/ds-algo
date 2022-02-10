package ch01_string.lec01;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

public class Main {
  public int solution(String str, char c) {
    int answer = 0;
    str = str.toUpperCase();
    c = Character.toUpperCase(c);
    /* for (int i = 0; i < str.length(); i++) {
      if (str.charAt(i) == c) {
        answer++;
      }
    } */
    for (char x : str.toCharArray()) {
      if (x == c) {
        answer++;
      }
    }
    return answer;
  }

  public static void main(String[] args)
    throws IOException
  {
    Main T = new Main();
    InputStream is = new FileInputStream("ch01_string/lec01/input.txt");
    System.setIn(is);
    Scanner kb = new Scanner(System.in);
    String str = kb.next();
    char c = kb.next().charAt(0);
    System.out.print(T.solution(str, c));
    kb.close();
  }
}