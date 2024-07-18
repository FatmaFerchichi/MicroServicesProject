package tn.esprit.commandems.service;

import tn.esprit.commandems.client.PaymentClient;
import tn.esprit.commandems.dto.PaymentDto;
import tn.esprit.commandems.entity.Commande;
import tn.esprit.commandems.repository.CommandeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommandeServiceImp implements ICommandeService {
    @Autowired
    private CommandeRepository commandeRepository;
    @Autowired
    private PaymentClient paymentClient;
    @Autowired
    private KafkaProducerService kafkaProducerService;
    @Override
    public List<Commande> getAllCommandes() {
        return commandeRepository.findAll();
    }

    @Override
    public Commande saveCommande(Commande commande) {
        Commande savedCommande = commandeRepository.save(commande);

        // Convert Commande to PaymentDTO
        PaymentDto paymentDTO = new PaymentDto();
        paymentDTO.setOrderId(savedCommande.getId().toString());
        paymentDTO.setAmount(savedCommande.getTotalAmount());
        paymentDTO.setPaymentMethod("Credit Card"); // Set payment method as required

        // Appel asynchrone pour créer un paiement
        String message = "Create payment for Order ID: " + savedCommande.getId();
        kafkaProducerService.sendMessage(message);

        return savedCommande;
    }

}