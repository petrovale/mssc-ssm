package guru.springboot.msscssm.services;

import guru.springboot.msscssm.domain.Payment;
import guru.springboot.msscssm.domain.PaymentEvent;
import guru.springboot.msscssm.domain.PaymentState;
import guru.springboot.msscssm.repository.PaymentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.statemachine.StateMachine;
import org.springframework.statemachine.config.StateMachineFactory;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class PaymentServiceImpl implements PaymentService {
  private final PaymentRepository paymentRepository;
  private final StateMachineFactory<PaymentState, PaymentEvent> stateMachineFactory;

  @Override
  public Payment newPayment(Payment payment) {
    payment.setState(PaymentState.NEW);
    return paymentRepository.save(payment);
  }

  @Override
  public StateMachine<PaymentState, PaymentEvent> preAuth(Long paymentId) {
    return null;
  }

  @Override
  public StateMachine<PaymentState, PaymentEvent> authorizePayment(Long paymentId) {
    return null;
  }

  @Override
  public StateMachine<PaymentState, PaymentEvent> declineAuth(Long paymentId) {
    return null;
  }
}