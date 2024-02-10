/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class countARR
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner s=new Scanner(System.in);
		int t=s.nextInt();
		while(t-->0)
		{
		    int count=0;
		    int n=s.nextInt();
		    int d[]=new int[n];
		    for(int i=0;i<n;i++)
		    {
		        if(d[i]>=1000)
		        {
		            count+=1;
		            System.out.println(count);
		        }
		    }
		}
	}
}
