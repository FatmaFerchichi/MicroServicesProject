package tn.esprit.paymentms.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import tn.esprit.paymentms.entity.Payment;

public interface PaymentRepository extends MongoRepository<Payment, String> {
}
