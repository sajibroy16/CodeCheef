/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner timtim = new Scanner(System.in);
		int T = timtim.nextInt();
		int r = timtim.nextInt();
		while(T-->0)
		{
		    int R = timtim.nextInt();
		    if(R<r)
		    {
		        System.out.println("Bad boi");
		    }
		    else
		    {
		        System.out.println("Good boi");
		    }
		}
	}
}
