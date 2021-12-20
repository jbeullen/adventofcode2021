package be.upgrade.it.adventofcode.day3;

import be.upgrade.it.adventofcode.common.ResourceUtil;

import java.util.List;

public class BinaryDiagnostic {
    public static long calculatePowerConsumption(String resource) {
        final List<String> lines = ResourceUtil.getAsList(resource);

        int[] counter = new int[lines.get(0).length()];

        for (String s : lines) {
            final char[] chars = s.toCharArray();
            for (int i = 0; i < chars.length; i++) {
                char c = chars[i];
                if (c == '1') {
                    counter[i] = counter[i] + 1;
                }
            }
        }

        StringBuilder gammaBuilder = new StringBuilder();
        StringBuilder epsilonBuilder = new StringBuilder();

        for (int i : counter) {
            final boolean b = i > lines.size() / 2;
            gammaBuilder.append(b ? '1' : '0');
            epsilonBuilder.append(b ? '0' : '1');
        }

        final long gamma = Long.parseLong(gammaBuilder.toString(), 2);
        final long epsilon = Long.parseLong(epsilonBuilder.toString(), 2);

        return gamma * epsilon;
    }
}
