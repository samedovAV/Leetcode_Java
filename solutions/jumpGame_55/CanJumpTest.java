package jumpGame_55;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class CanJumpTest {

    @Test
    public void testCanJump() {
        Solution solution = new Solution();
        assertTrue(solution.canJump(new int[]{2,3,1,1,4}));
    }
}
