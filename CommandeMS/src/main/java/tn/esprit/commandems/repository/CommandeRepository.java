package tn.esprit.commandems.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.commandems.entity.Commande;

public interface CommandeRepository  extends JpaRepository<Commande, Long> {
}
