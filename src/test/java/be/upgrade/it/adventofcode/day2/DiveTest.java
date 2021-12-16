package be.upgrade.it.adventofcode.day2;


import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class DiveTest {
    @Test
    void give_testInput_when_process_then_resultIs_150() {
        assertThat(Dive.process("day2/input1.test.txt")).isEqualTo(150L);
    }

    @Test
    void give_actualInput_when_process_then_resultIs_2150351() {
        assertThat(Dive.process("day2/input1.txt")).isEqualTo(2150351L);
    }

    @Test
    void give_testInput_when_processWithAim_then_resultIs_900() {
        assertThat(Dive.processWithAim("day2/input1.test.txt")).isEqualTo(900L);
    }

    @Test
    void give_actualInput_when_processWithAim_then_resultIs_2150351() {
        assertThat(Dive.processWithAim("day2/input1.txt")).isEqualTo(1842742223L);
    }


}