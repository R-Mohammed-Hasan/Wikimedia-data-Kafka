package springboot;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootProducerApplication implements CommandLineRunner {


    public static void main(String[] args) {
        System.out.println("apllication started");
        SpringApplication.run(SpringBootProducerApplication.class);
    }

    @Autowired
    private KafkaProducer kafkaProducer;

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Run method running");
        kafkaProducer.sendMessage();
    }
}
