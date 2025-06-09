package maratonajava.javacore.aula30_serialization.test;

import maratonajava.javacore.aula30_serialization.domain.Class;
import maratonajava.javacore.aula30_serialization.domain.Student;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class serializationTest {
    public static void main(String[] args) {
        Student student = new Student(1L, "Willina Suane", "123412121");
        Class schoolClass = new Class("Maratona Java");
        student.setSchoolClass(schoolClass);
        serializer(student);
        unserializer();

    }

    private static void serializer(Student student) {
        Path path = Paths.get("student.ser");
        try(ObjectOutputStream oos = new ObjectOutputStream(Files.newOutputStream(path))) {
            oos.writeObject(student);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void unserializer() {
        Path path = Paths.get("student.ser");
        try(ObjectInputStream ois = new ObjectInputStream(Files.newInputStream(path))) {
            Student student = (Student) ois.readObject();
            System.out.println(student.toString());
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
