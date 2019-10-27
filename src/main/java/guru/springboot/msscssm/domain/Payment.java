package guru.springboot.msscssm.domain;

import java.math.BigDecimal;
import javax.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Payment {

  @Id
  @GeneratedValue
  private Long id;

  @Enumerated(EnumType.STRING)
  private PaymentState state;

  private BigDecimal amount;
}
