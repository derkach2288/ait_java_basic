import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class Hw36Test {
    Hw36 hw36;

    @BeforeEach
    void setUp() {
        hw36 = new Hw36();
    }

    @Test
    void firstElementIsMinimal(){
        List<String> str = Arrays.asList("qw", "qwe", "q","qwer", "qwert");
        assertEquals("q", hw36.strMinOrMax(str));
    }

    @Test
    void firstElementIsMax(){
        List<String> str = Arrays.asList("qw", "qwe", "qwerty", "q","qwer", "qwert");
        assertEquals("qwerty", hw36.strMinOrMax(str));
    }

}