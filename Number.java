import java.util.*;
import java.lang.*;
import java.io.*;
public class Number {
public static void main(String args[]) {
  Scanner in=new Scanner(System.in);
  int num = in.nextInt();
  if(num < 0) {
  System.out.print("Negative");
  } else if(num > 0) {
  System.out.print("Positive");
  } else {
  System.out.print("Zero");
  }
  }
}
