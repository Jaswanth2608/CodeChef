// Problem: VDATES
// Platform: codechef
// Language: Java​
// Verdict: Accepted
// URL: https://www.codechef.com/practice/course/1to2stars/LP1TO201/problems/VDATES
// Solved on: 2026-11-06T07:44:31.086Z

import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t>0){
            int d=sc.nextInt();
            int l=sc.nextInt();
            int r=sc.nextInt();
            if(d>=l && d<=r){
                System.out.println("Take second dose now");
            }
            else if(d<l){
                System.out.println("Too Early");
            }
            else if(d>r){
                System.out.println("Too Late");
            }
            t--;
        }

	}
}
