package ch01_string.lec02;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

public class Main {
  public String solution(String str) {
    String res = "";
    for (char x : str.toCharArray()) {
      if (Character.isUpperCase(x)) 
        res += Character.toLowerCase(x);
      else if (Character.isLowerCase(x))
        res += Character.toUpperCase(x);
      else
        res += x;
    }
    return res;
  }

  public static void main(String[] args) 
    throws IOException
  {
    Main T = new Main();
    InputStream is = new FileInputStream("ch01_string/lec02/input.txt");
    System.setIn(is);
    Scanner kb = new Scanner(System.in);
    String str = kb.next();
    System.out.print(T.solution(str));
    kb.close();
  }
}
