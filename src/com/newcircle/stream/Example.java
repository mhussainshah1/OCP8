package com.newcircle.stream;

import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.function.Consumer;
import java.util.logging.Level;
import java.util.logging.Logger;

//This program prints itself out when run
public class Example {

    public static void main(String[] args) throws IOException {
        String workingDir = System.getProperty("user.dir");
        Path workingDirPath = FileSystems.getDefault()
                .getPath(workingDir);
        //C:\Users\m_hus\Documents\NetBeansProjects\OCP

        String classFileName = Example.class.getName().replace('.', '/') + ".java";
        //OCP/java8/stream/Example.java
        int maxDepth = 10;

        //find is a stream
        Files.find(workingDirPath, maxDepth, (filename, attributes) -> filename.endsWith(classFileName))
                .forEach((Path path) -> {
                    try {
                        Files.lines(path).forEach(System.out::println);//lines is stream
                    } catch (IOException ex) {
                        ex.printStackTrace();
                    }
                }
                );
    }
}
