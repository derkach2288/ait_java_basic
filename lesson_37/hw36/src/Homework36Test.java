import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class Homework36Test {
    Homework36 homework36;

    @BeforeEach
    void setUp() {
        homework36 = new Homework36();
    }

    @Test
    void shortestOrLongestTest(){
        assertEquals("a", homework36.findShortOrLongest(Arrays.asList("a")));
    }

    @Test
    void shortestOrLongestTest_shortFirst(){
        assertEquals("a", homework36.findShortOrLongest(Arrays.asList("bb", "a", "ddd")));
    }

    @Test
    void shortestOrLongestTest_longFirst(){
        assertEquals("aaaa", homework36.findShortOrLongest(Arrays.asList("bb", "aaaa", "ddd")));
    }


}