package be.upgrade.it.adventofcode.day2;

import be.upgrade.it.adventofcode.common.ResourceUtil;

import java.util.List;
import java.util.stream.Collectors;

public class Dive {
    public static long process(String resource) {
        final List<Change> changes = ResourceUtil.getAsList(resource).stream()
                .map(Change::new).collect(Collectors.toList());

        final Long totalDepthChange = changes.stream()
                .filter(Change::isDepthChange)
                .map(Change::changeValue)
                .reduce(0L, Long::sum);

        final Long totalHorizontalChange = changes.stream()
                .filter(change -> !change.isDepthChange())
                .map(Change::changeValue)
                .reduce(0L, Long::sum);

        return totalDepthChange * totalHorizontalChange;
    }

    public static long processWithAim(String resource){
        final List<Change> changes = ResourceUtil.getAsList(resource).stream()
                .map(Change::new).collect(Collectors.toList());

        long aim = 0L;
        long horizontalPosition = 0L;
        long depth = 0L;

        for (Change change : changes) {
            final long changeValue = change.changeValue();
            if(change.isDepthChange()){
                aim += changeValue;
            } else {
                horizontalPosition += changeValue;
                depth += aim * changeValue;
            }
        }


        return depth * horizontalPosition;
    }
}
