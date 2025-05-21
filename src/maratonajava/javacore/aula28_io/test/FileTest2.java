package maratonajava.javacore.aula28_io.test;

import java.io.File;
import java.io.IOException;

public class FileTest2 {
    public static void main(String[] args) throws IOException {
        //Criar diretório
        File fileDirectory = new File("folder");
        boolean isDirectoryCreated = fileDirectory.mkdir();
        System.out.println("Folder created ? " + isDirectoryCreated);

        // Criar arquivo dentro do diretório
        File fileDirectoryFile = new File(fileDirectory, "file.txt");
        boolean isFileCreated = fileDirectoryFile.createNewFile();
        System.out.println("file.txt created ? " + isFileCreated);

        // Renomear arquivo
        File fileRenamed = new File(fileDirectory,"renamed_file.txt");
        boolean isFileRenamed = fileDirectoryFile.renameTo(fileRenamed);
        System.out.println("file.txt renamed ? " + isFileRenamed);

        // Renomear diretório
        File directoryRenamed = new File("folder2");
        boolean isDirectoryRenamed = fileDirectory.renameTo(directoryRenamed);
        System.out.println("Folder renamed ? " + isDirectoryRenamed);
    }
}
