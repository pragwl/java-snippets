package io.github.pragwl.snippets.stream.filestream;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class FileStream {
  public static void main(String[] args) throws IOException {
    String path = "./names.txt";
    Stream<String> lines = Files.lines(Paths.get(path));
    lines.filter(name -> name.contains("iyan")).forEach(System.out::println);
    lines.close();
  }
}
