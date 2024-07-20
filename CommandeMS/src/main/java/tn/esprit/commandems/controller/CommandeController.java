package tn.esprit.commandems.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import tn.esprit.commandems.client.PaymentClient;
import tn.esprit.commandems.entity.Commande;
import tn.esprit.commandems.service.ICommandeService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/commandes")
public class CommandeController {
    @Autowired
    private ICommandeService commandeService;
    @Autowired
    private PaymentClient paymentClient;

    @GetMapping
    public List<Commande> getAllCommandes() {
        return commandeService.getAllCommandes();
    }

    @PostMapping("/commandes")
    public ResponseEntity<Commande> createCommande(@RequestBody Commande commande) {
        try {
            Commande savedCommande = commandeService.saveCommande(commande);
            return new ResponseEntity<>(savedCommande, HttpStatus.CREATED);
        } catch (Exception e) {
            e.printStackTrace();
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
    @GetMapping("/test-payment")
    public String testPayment() {
        return paymentClient.testPaymentMS();
    }
}