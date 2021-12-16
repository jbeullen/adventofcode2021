package be.upgrade.it.adventofcode.day1;


import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;


class SonarTest {
    @Test
    void given_testFileAndWindowSize1_when_depthMeasure_then_output_is_7() {
        assertThat(Sonar.depthMeasure("day1/input1.test.txt", 1)).isEqualTo(7);
    }


    @Test
    void given_realFileAndWindowSize1_when_depthMeasure_then_output_is_1451() {
        assertThat(Sonar.depthMeasure("day1/input1.txt", 1)).isEqualTo(1451);
    }

    @Test
    void given_testFileAndWindowSize3_when_depthMeasure_then_output_is_7() {
        assertThat(Sonar.depthMeasure("day1/input1.test.txt", 3)).isEqualTo(5);
    }

    @Test
    void given_realFileAndWindowSize3_when_depthMeasure_then_output_is_1451() {
        assertThat(Sonar.depthMeasure("day1/input1.txt", 3)).isEqualTo(1395);
    }
}