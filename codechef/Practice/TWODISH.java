// Problem: TWODISH
// Platform: codechef
// Language: Java​
// Verdict: Accepted
// URL: https://www.codechef.com/practice/course/1to2stars/LP1TO201/problems/TWODISH
// Solved on: 2026-11-08T14:21:03.968Z

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
            int n=sc.nextInt();
            int a=sc.nextInt();
            int b=sc.nextInt();
            int c=sc.nextInt();
            int count=0;
            while(b-- >0){
                if(a>0){
                    count++;
                    a--;
                }
                else if(c>0){
                    count++;
                    c--;
                }
            }
            if(count>=n){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
            t--;
        }
	}
}
