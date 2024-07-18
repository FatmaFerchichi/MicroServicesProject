package tn.esprit.paymentms.service;

import org.springframework.stereotype.Service;
import tn.esprit.paymentms.entity.Payment;

import java.util.List;


@Service
public interface IPaymentService {
    List<Payment> getAllPayments();
    Payment savePayment(Payment payment);

}

