package be.upgrade.it.adventofcode.common;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ResourceUtil {
    public static List<String> getAsList(String resource){
        try (Stream<String> stream = Files.lines(Paths.get(ClassLoader.getSystemResource(resource).toURI()))) {
            return stream.collect(Collectors.toList());

        } catch (IOException | URISyntaxException e) {
            e.printStackTrace();
        }
        return List.of();
    }
}
