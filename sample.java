/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		       Scanner in = new Scanner(System.in); 
		       int num = Integer.parseInt(in.nextLine());
		       if(num > 0) {
		       		System.out.print("positive");
		       } else if(num < 0) {
		       	System.out.print("negative");
		       } else {
		       	System.out.print("zero");
		       }

	}
}
