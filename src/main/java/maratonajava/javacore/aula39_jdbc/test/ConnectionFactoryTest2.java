package maratonajava.javacore.aula39_jdbc.test;

import lombok.extern.log4j.Log4j2;
import maratonajava.javacore.aula39_jdbc.domain.Producer;
import maratonajava.javacore.aula39_jdbc.service.ProducerServiceRowSet;

import java.util.List;

@Log4j2
public class ConnectionFactoryTest2 {
    public static void main(String[] args) {
        Producer producerToUpdate = Producer.builder().id(1).name("MADHouse").build();
        //ProducerServiceRowSet.updateJdbcRowSet(producerToUpdate);
        ProducerServiceRowSet.updateCachedRowSet(producerToUpdate);
        log.info("--------------------------");
        List<Producer> producers = ProducerServiceRowSet.findByNameJdbcRowSet("");
        log.info(producers);
    }
}
