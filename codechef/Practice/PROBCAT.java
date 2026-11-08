// Problem: PROBCAT
// Platform: codechef
// Language: Java​
// Verdict: Accepted
// URL: https://www.codechef.com/practice/course/1to2stars/LP1TO201/problems/PROBCAT
// Solved on: 2026-11-08T14:21:20.726Z

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
        while(t-->0){
            int x=sc.nextInt();
            if(x>=1 && x<100){
                System.out.println("Easy");
            }
            else if(x>=100 && x<200){
                System.out.println("Medium");
            }
            else{
                System.out.println("Hard");
            }
        }
	}
}
