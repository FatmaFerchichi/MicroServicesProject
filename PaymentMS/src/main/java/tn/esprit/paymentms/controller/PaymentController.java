package tn.esprit.paymentms.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;
import tn.esprit.paymentms.entity.Payment;
import tn.esprit.paymentms.service.IPaymentService;

import java.util.List;

@RestController
@RequestMapping("/payments")
public class PaymentController {
    @Autowired
    @Qualifier("paymentServiceImp")
    private IPaymentService paymentService;

    @GetMapping
    public List<Payment> getAllPayments() {
        return paymentService.getAllPayments();
    }

    @PostMapping
    public Payment createPayment(@RequestBody Payment payment) {
        return paymentService.savePayment(payment);
    }

    @GetMapping("/test")
    public String testPaymentMS() {
        return "PaymentMS is up and running!";
    }
}