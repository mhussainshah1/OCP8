package com.newcircle.stream;

import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;

/**
 *
 */
public class FileSystemStream {

    public static void main(String[] args) throws IOException {

        String workingDir = System.getProperty("user.dir");
        Path workingDirPath = FileSystems.getDefault().getPath(workingDir);

        System.err.println("Directory Listing Stream\n");
        Files.list(workingDirPath)
                .forEach(System.out::println);

        System.err.println("Depth First Directory Walking Stream\n");
        //it depth search starting from directory
        Files.walk(workingDirPath)
                .forEach(System.out::println);

    }
}
