# FA-2

You are given a N * M grid in which each cell consists of either 0 or 1. A cell (i,j) is blocked if its value is 1. Standing at a cell (i,j), you can perform the following steps:

1. You can move right to the very next cell which is not blocked.
2. You can move down to the very next cell which is not blocked.
3. You can jump to the very next cell which is not blocked.

You are initially located at cell (1,1). Determine the number of ways in which you can reach (N,M) starting from your initial location.

Example: Let 3 * 3 grid be

010

100

00

If you are standing at cell (1,1), then:

By performing step 1, you can jump to cell (1,3) and,
By performing step 2, you can jump to cell (3,1)

The answer will be 2.

Input format

The first line contains N and M denoting the number of rows and the number of columns.
Each of the next N lines consists of a string of length M. 
░
