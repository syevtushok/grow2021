package task.java.eight;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

// TODO: Replace examples and use TDD development by writing your own tests

public class SolutionTest2 {
    @Test
    public void testSomething() {
        assertEquals("eating like I",
                ReverseWords.reverseWords("I like eating"));
        assertEquals("flying like I",
                ReverseWords.reverseWords("I like flying"));
        assertEquals("nice is world The",
                ReverseWords.reverseWords("The world is nice"));
    }
}
