// Problem: MCQ-1
// Platform: codechef
// Language: SQL​
// Verdict: Accepted
// URL: https://www.codechef.com/skill-test/LSQLAS02/problems/SQLP026
// Solved on: 2026-11-05T12:34:27.836Z

-- your code goes here
SELECT LEVEL,SUM(EXPERIENCE_POINTS) FROM PLAYERS GROUP BY LEVEL;