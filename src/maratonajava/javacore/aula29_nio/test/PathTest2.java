package maratonajava.javacore.aula29_nio.test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class PathTest2 {
    public static void main(String[] args) throws IOException {
        Path folderPath = Paths.get("folder");
        if (Files.notExists(folderPath)) {
            Path folderDirectory = Files.createDirectory(folderPath);
        }
        Path subFolderPath = Paths.get("folder/subfulder/subsubfolder");
        Path subFolderDirectory = Files.createDirectory(subFolderPath);
        Path filePath = Paths.get(subFolderPath.toString(), "file.txt");

        if (Files.notExists(filePath)) {
            Path filePathCreated = Files.createFile(filePath);
        }

        Path source = filePath;
        Path target = Paths.get(filePath.getParent().toString(), "file_renamed.txt");
        Files.copy(source, target, StandardCopyOption.REPLACE_EXISTING);
    }
}
