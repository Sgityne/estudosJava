package maratonajava.javacore.aula22_exception.exception.domain;

import java.io.Closeable;
import java.io.IOException;

public class Reader2 implements Closeable {
    @Override
    public void close() throws IOException {
        System.out.println("Fechando leitor 2");
    }
}
