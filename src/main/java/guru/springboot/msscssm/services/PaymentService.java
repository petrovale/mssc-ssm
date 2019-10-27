package guru.springboot.msscssm.services;

import guru.springboot.msscssm.domain.Payment;
import guru.springboot.msscssm.domain.PaymentEvent;
import guru.springboot.msscssm.domain.PaymentState;
import org.springframework.statemachine.StateMachine;

public interface PaymentService {

  Payment newPayment(Payment payment);

  StateMachine<PaymentState, PaymentEvent> preAuth(Long paymentId);

  StateMachine<PaymentState, PaymentEvent> authorizePayment(Long paymentId);

  StateMachine<PaymentState, PaymentEvent> declineAuth(Long paymentId);
}
