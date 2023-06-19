package net.najiboulhouch.kafkaexample;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaListeners {

    @KafkaListener(topics = "firstTopic" , groupId = "grpID")
    void listener(String data) {
        System.out.println("Listener received:" + data + " ");
    }
}
