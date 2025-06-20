package maratonajava.javacore.aula39_jdbc.test;

import maratonajava.javacore.aula39_jdbc.domain.Producer;
import maratonajava.javacore.aula39_jdbc.service.ProducerService;

public class ConnectionFactoryTest {
    public static void main(String[] args) {
        Producer producer = Producer.builder().name("Studio Deen").build();
        Producer producerToUpdate = Producer.builder().id(1).name("MADHOUSE").build();
        //ProducerService.save(producer);
        //ProducerService.delete(6);
        ProducerService.update(producerToUpdate);
    }
}
