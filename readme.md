##Count Regtangles 

This is a simple program that counts the number of rectangles that can be created by some points in cartesian coordinate, (X, Y).

###Input
The program will take in a list of points in the form of (X, Y) from a .txt file ,where X and Y are integers. The list will be separated by a new line.
###Output
The output will be the number of rectangles that can be created by the points in the list. The output will be printed to the console.

###Example
Some exemples of input and output are shown below.

```
Input: (1, 1), (1, 3), (3, 1), (3, 3), (2, 2)
Output: 1

Input: (1, 1), (1, 3), (3, 1), (3, 3), (2, 2), (4, 1), (4, 3)
Output: 3

```

###Explanation

The first input has 4 points that can create a rectangle. The second input has 6 points that can create 3 rectangles. The points are not necessarily in order, and the points can be repeated.

###Solution
To solve the problem, we can compare every pair of points in the input set and check if 
they can form the opposite corners of a rectangle. 
If two points are not on the same row or column, they can be two opposite corners of a rectangle. 
We can generate the other two corners by swapping the x and y coordinates of the two points. 
Then we check if these two points exist in the input set.
If they do, we have found a rectangle. 
We can count the number of rectangles by keeping a counter and incrementing it each time we find a new one. 
Finally, we can return the count divided by 2 since we have counted each rectangle twice (once for each pair of opposite corners).



