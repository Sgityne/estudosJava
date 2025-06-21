package maratonajava.javacore.aula39_jdbc.test;

import lombok.extern.log4j.Log4j2;
import maratonajava.javacore.aula39_jdbc.domain.Producer;
import maratonajava.javacore.aula39_jdbc.service.ProducerService;

import java.util.List;

@Log4j2
public class ConnectionFactoryTest {
    public static void main(String[] args) {
        Producer producer = Producer.builder().name("Studio Deen").build();
        Producer producerToUpdate = Producer.builder().id(1).name("MadHouse").build();
        //ProducerService.save(producer);
        //ProducerService.delete(6);
        //ProducerService.update(producerToUpdate);
        //List<Producer> producers = ProducerService.fildAll();
        //List<Producer> producers = ProducerService.findByName("Mad");
        //log.info("Producers found '{}'", producers);
        //ProducerService.showProducerMetadata();
        //ProducerService.showDriverMetadata();
        //ProducerService.showTypeScrollWorking();
        //List<Producer> producers = ProducerService.findByNameAndUpdateToUpperCase("deen");
        //List<Producer> producers = ProducerService.findByNameAndInsertWhenNotFound("A-1 Pictures");
        //log.info("Producers found '{}'", producers);
        //ProducerService.findByNameAndDelete("A-1 Pictures");
        //List<Producer> producers = ProducerService.findByNamePreparedStatement("bones");
        //log.info("Producers found '{}'", producers);
        //ProducerService.updatePreparedStatement(producerToUpdate);
        List<Producer> producers = ProducerService.findByNameCallableStatement("bones");
        log.info("Producers found '{}'", producers);
    }
}
