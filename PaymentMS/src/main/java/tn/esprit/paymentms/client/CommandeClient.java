package tn.esprit.paymentms.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import tn.esprit.paymentms.dto.CommandeDto;

import java.util.List;

@FeignClient(name = "commandems", url = "http://localhost:9090")
public interface CommandeClient {

    @GetMapping("/commandes")
    List<CommandeDto> getAllCommandes();

    @PostMapping("/commandes")
    CommandeDto createCommande(@RequestBody CommandeDto commandeDto);
}
