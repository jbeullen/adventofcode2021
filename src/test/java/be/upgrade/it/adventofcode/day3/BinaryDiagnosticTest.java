package be.upgrade.it.adventofcode.day3;


import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class BinaryDiagnosticTest {

    @Test
    void given_testInput_when_calculatePowerConsumption_then_198() {
        assertThat(BinaryDiagnostic.calculatePowerConsumption("day3/input1.test.txt")).isEqualTo(198L);

    }

    @Test
    void given_actualInput_when_calculatePowerConsumption_then_198() {
        assertThat(BinaryDiagnostic.calculatePowerConsumption("day3/input1.txt")).isEqualTo(198L);

    }
}