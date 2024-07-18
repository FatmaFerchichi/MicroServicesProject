package tn.esprit.commandems.service;

import tn.esprit.commandems.entity.Commande;

import java.util.List;

public interface ICommandeService {
    List<Commande> getAllCommandes();
    Commande saveCommande(Commande commande);
}
