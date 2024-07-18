package tn.esprit.commandems.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import tn.esprit.commandems.dto.PaymentDto;

@FeignClient(name = "paymentms")  // This should match the spring.application.name in PaymentMS
public interface PaymentClient {

    @GetMapping("/payments/{orderId}")
    PaymentDto getPayment(@PathVariable("orderId") String orderId);

    @PostMapping("/payments")
    void createPayment(@RequestBody PaymentDto paymentDTO);

    @GetMapping("/payments/test")
    String testPaymentMS();
}
