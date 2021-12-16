package be.upgrade.it.adventofcode.day1;

import be.upgrade.it.adventofcode.common.ResourceUtil;

import java.util.Arrays;

public class Sonar {

    public static int depthMeasure(String resource, int windowSize) {
        final Integer[] depths = ResourceUtil.getAsList(resource).stream()
                .map(Integer::parseInt)
                .toArray(Integer[]::new);

        int previous = Integer.MAX_VALUE;
        int counter = 0;

        for (int i = windowSize; i <= depths.length; i++) {
            final Integer[] window = Arrays.copyOfRange(depths, i - windowSize, i);
            final Integer depth = Arrays.stream(window).reduce(0, Integer::sum);

            if(depth > previous){
                counter++;
            }
            previous = depth;
        }

        return counter;
    }
}
