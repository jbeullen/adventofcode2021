package be.upgrade.it.adventofcode.day2;

import org.apache.commons.lang3.StringUtils;

public class Change {
    final String input;

    public Change(String input) {
        this.input = input;
    }

    public boolean isDepthChange() {
        return StringUtils.startsWithAny(input, "up", "down");
    }

    public long changeValue() {
        final String valueAsString = StringUtils.substringAfter(input, " ");
        final long value = Long.parseLong(valueAsString);
        if(StringUtils.startsWithAny(input, "up")) {
            return -value;
        }
        return value;
    }
}
