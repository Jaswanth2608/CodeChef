// Problem: Number Game
// Platform: codechef
// Language: C​
// Verdict: Accepted
// URL: https://www.codechef.com/skill-test/LCAS3/problems/LCAS60
// Solved on: 2026-11-07T12:46:58.997Z

#include <stdio.h>

int main() {
	// your code goes here
    int a,b,c;
    scanf("%d %d %d",&a,&b,&c);
    if(a>b && a>c){
        printf("Largest: %d",a);
    }
    else if(b>a && b>c){
        printf("Largest: %d",b);
    }
    else{
        printf("Largest: %d",c);
    }
}

