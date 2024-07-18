package tn.esprit.paymentms.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import tn.esprit.paymentms.client.CommandeClient;
import tn.esprit.paymentms.dto.CommandeDto;
import tn.esprit.paymentms.entity.Payment;
import tn.esprit.paymentms.repository.PaymentRepository;

import java.util.List;

@Service
@Qualifier("paymentServiceImp")
public class PaymentServiceImp implements IPaymentService {
    @Autowired
    private PaymentRepository paymentRepository;
    @Autowired
    private CommandeClient commandeClient;

    @Override
    public List<Payment> getAllPayments() {
        return paymentRepository.findAll();
    }

    @Override
    public Payment savePayment(Payment payment) {
        return paymentRepository.save(payment);
    }
    public List<CommandeDto> getAllCommandes() {
        return commandeClient.getAllCommandes();
    }

    public CommandeDto createCommande(CommandeDto commandeDto) {
        return commandeClient.createCommande(commandeDto);
    }
}