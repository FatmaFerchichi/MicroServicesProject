package tn.esprit.paymentms.mapper;


import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import tn.esprit.paymentms.dto.PaymentDto;
import tn.esprit.paymentms.entity.Payment;

@Mapper
public interface PaymentMapper {

    PaymentMapper INSTANCE = Mappers.getMapper(PaymentMapper.class);

    PaymentDto toPaymentDTO(Payment payment);

    Payment toPayment(PaymentDto paymentDTO);
}