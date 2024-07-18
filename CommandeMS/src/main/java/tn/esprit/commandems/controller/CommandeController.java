package tn.esprit.commandems.controller;

import org.springframework.beans.factory.annotation.Autowired;
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

    @PostMapping
    public Commande createCommande(@RequestBody Commande commande) {
        return commandeService.saveCommande(commande);
    }

    @GetMapping("/test-payment")
    public String testPayment() {
        return paymentClient.testPaymentMS();
    }
}