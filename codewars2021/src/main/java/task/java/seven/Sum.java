package task.java.seven;

import java.util.stream.IntStream;

public class Sum {
    public int GetSum(int a, int b) {
        int start = Math.min(a, b);
        int end = Math.max(a, b);

        return IntStream.range(start, end + 1).sum();
    }
}


/*
  Given two integers a and b, which can be positive or negative, find the sum of all the integers between including them too and return it. If the two numbers are equal return a or b.

Note: a and b are not ordered!

Examples
GetSum(1, 0) == 1   // 1 + 0 = 1
GetSum(1, 2) == 3   // 1 + 2 = 3
GetSum(0, 1) == 1   // 0 + 1 = 1
GetSum(1, 1) == 1   // 1 Since both are same
GetSum(-1, 0) == -1 // -1 + 0 = -1
GetSum(-1, 2) == 2  // -1 + 0 + 1 + 2 = 2

   */
