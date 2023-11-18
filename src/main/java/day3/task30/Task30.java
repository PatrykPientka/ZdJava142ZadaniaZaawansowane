package day3.task30;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class Task30 {
    public static void main(String[] args) throws IOException {
        //moje rozwiazanie z wykorzystaniem osobnej klasy
        ReadFromFileClass readFromFileClass = new ReadFromFileClass();
        readFromFileClass.readFromFile("zadanie.txt");

        // inne rozwiazanie
        Path dirPath = Path.of("src/main/java/day3/task30");
        Path inputFile = dirPath.resolve("zadanie.txt");
        if (!inputFile.toFile().exists()) {
            System.out.println("Plik nie istnieje");
            return;
        }
        List<String> content = getFileContent(inputFile);
        System.out.println("input" + content);
        List<String> reversedContent = reverseFileContent(content);
        System.out.println(reversedContent);
        Path output = reverseFileName(inputFile);
        System.out.println(output);
        saveFile(output, reversedContent);

    }

    private static List<String> getFileContent(Path inputFile) throws IOException {
        return Files.readAllLines(inputFile);

    }

    private static List<String> reverseFileContent(List<String> content) {
        return content.stream()
                .map(element -> new StringBuilder(element).reverse().toString())
                .toList();
    }

    private static Path reverseFileName(Path inputFile) {
        String fileName = inputFile.toFile().getName();

        String fileExtenstion = "";
        int index = fileName.lastIndexOf(".");
        if (index > 0) {
            fileExtenstion = fileName.substring(index + 1);
            fileName = fileName.substring(0, index);

        }
        String outputFileName = new StringBuilder(fileName)
                .reverse()
                .append(fileExtenstion)
                .toString();
        return inputFile.getParent().resolve(outputFileName);
    }
    private static void saveFile(Path outputFile, List<String>content) throws IOException{
        Files.write(outputFile,content, StandardCharsets.UTF_8);
    }
}
