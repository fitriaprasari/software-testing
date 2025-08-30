import org.example.*;
import org.junit.Test;
import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class GfGTest {

    // 1. Pattern occurs at multiple positions
    @Test
    public void testMultipleMatches() {
        ArrayList<Integer> result = GfG.search("aaba", "aabaacaadaabaaba");
        assertEquals(Arrays.asList(0, 9, 12), result);
    }

    // 2. Pattern occurs only once at the beginning
    @Test
    public void testPatternAtBeginning() {
        ArrayList<Integer> result = GfG.search("abc", "abcdefg");
        assertEquals(Arrays.asList(0), result);
    }

    // 3. Pattern not found
    @Test
    public void testPatternNotFound() {
        ArrayList<Integer> result = GfG.search("xyz", "abcdefg");
        assertTrue(result.isEmpty());
    }

    // 4. Pattern equals the entire text
    @Test
    public void testPatternEqualsText() {
        ArrayList<Integer> result = GfG.search("hello", "hello");
        assertEquals(Arrays.asList(0), result);
    }

    // 5. Overlapping patterns
    @Test
    public void testOverlappingMatches() {
        ArrayList<Integer> result = GfG.search("aa", "aaaaa");
        // matches at indices: 0, 1, 2, 3
        assertEquals(Arrays.asList(0, 1, 2, 3), result);
    }
}
