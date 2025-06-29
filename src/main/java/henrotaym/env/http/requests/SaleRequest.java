package henrotaym.env.http.requests;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import java.util.List;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public class SaleRequest {
  @Valid
  @NotNull
  @Size(min = 1)
  private final List<SaleVegetableRequest> vegetables;
}
