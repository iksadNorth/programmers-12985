package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class SolutionTest {
    private final Solution solution = new Solution();

    public void assertAnswer(int n, int a, int b, int answer) {
        // when
        int result = solution.solution(n, a, b);

        // then
        Assertions.assertEquals(result, answer);
    }

    @Test @DisplayName("1")
    void testcase1() {
        // given
        int n = 8;
        int a = 4;
        int b = 7;
        int answer = 3;

        // when & then
        assertAnswer(n, a, b, answer);
    }
}