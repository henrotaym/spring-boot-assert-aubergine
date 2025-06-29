package henrotaym.env.http.requests;

import henrotaym.env.http.requests.relationships.VegetableRelationshipRequest;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import java.math.BigInteger;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public class SaleVegetableRequest {
  @NotNull @Positive private final BigInteger quantity;
  @Valid @NotNull private final VegetableRelationshipRequest vegetable;
}
