package task.java.seven;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SolutionTest1 {
    @Test
    public void basicTests() {
        assertEquals("ybzc", Solution1.solve("xyab", "xzca"));
        assertEquals("ybbzc", Solution1.solve("xyabb", "xzca"));
        assertEquals("abcdxyz", Solution1.solve("abcd", "xyz"));
        assertEquals("zca", Solution1.solve("xxx", "xzca"));
    }
}

/*
In this Kata, you will be given two strings a and b and your task will be to return the characters that are not common in the two strings.

For example:

solve("xyab","xzca") = "ybzc"
--The first string has 'yb' which is not in the second string.
--The second string has 'zc' which is not in the first string.
Notice also that you return the characters from the first string concatenated with those from the second string.

More examples in the tests cases.

Good luck!


 */
