package tn.esprit.commandems.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import tn.esprit.commandems.dto.CommandeDto;
import tn.esprit.commandems.dto.PaymentDto;
import tn.esprit.commandems.entity.Commande;

@Mapper
public interface CommandeMapper {
    CommandeMapper INSTANCE = Mappers.getMapper(CommandeMapper.class);

    PaymentDto commandeToPayment(Commande commande);
    CommandeDto commandeToCommandeDto(Commande commande);
    Commande commandeDtoToCommande(CommandeDto commandeDto);
}
