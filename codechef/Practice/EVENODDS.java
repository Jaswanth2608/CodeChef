// Problem: EVENODDS
// Platform: codechef
// Language: Java​
// Verdict: Accepted
// URL: https://www.codechef.com/START263D/problems/EVENODDS
// Solved on: 2026-11-04T15:49:44.439Z


import java.util.*;

class Codechef {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();

            int count = 0;
            int first = -1, last = -1;

            for (int i = 0; i < n; i++) {
                int x = sc.nextInt();

                if (x % 2 != 0) {
                    count++;

                    if (first == -1)
                        first = i;

                    last = i;
                }
            }

            if (count % 2 == 0)
                System.out.println(n);
            else
                System.out.println(Math.max(n - first - 1, last));
        }
    }
}

