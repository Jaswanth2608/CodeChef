// Problem: CHFRICH
// Platform: codechef
// Language: Java​
// Verdict: Accepted
// URL: https://www.codechef.com/practice/course/1to2stars/LP1TO201/problems/CHFRICH
// Solved on: 2026-11-06T07:40:07.091Z

import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t>0){
            int a=sc.nextInt();
            int b=sc.nextInt();
            int x=sc.nextInt();
            int ans=(b-a)/x;
            System.out.println(ans);
            t--;
        }
	}
}
