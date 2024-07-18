package tn.esprit.paymentms.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumerService {
    @KafkaListener(topics = "commande_topic", groupId = "payment-group")
    public void consume(String message) {
        System.out.println("Consumed message: " + message);
        // Process the message here
    }
}
