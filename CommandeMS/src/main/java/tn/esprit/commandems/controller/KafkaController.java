package tn.esprit.commandems.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import tn.esprit.commandems.service.KafkaProducerService;

@RestController
public class KafkaController {
    @Autowired
    private KafkaProducerService producerService;

    @GetMapping("/sendMessage")
    public String sendMessage(@RequestParam("message") String message) {
        producerService.sendMessage(message);
        return "Message sent to Kafka topic";
    }
}
