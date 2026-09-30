// Problem: SANDWICH7
// Platform: codechef
// Language: Java​
// Verdict: Accepted
// URL: https://www.codechef.com/START258D/problems/SANDWICH7
// Solved on: 2026-09-30T15:02:22.022Z

import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int count=0;
        for(int i=2;i<=a;i+2){
            if(b>=1 || c>=1){
                count+=1;
                
            }
        }
	}
}
