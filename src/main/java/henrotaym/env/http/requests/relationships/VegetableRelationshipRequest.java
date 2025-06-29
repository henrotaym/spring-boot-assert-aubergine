package henrotaym.env.http.requests.relationships;

import henrotaym.env.annotations.ExistsInDatabase;
import henrotaym.env.repositories.VegetableRepository;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public class VegetableRelationshipRequest {
  @NotNull
  @ExistsInDatabase(repository = VegetableRepository.class)
  private final Long id;
}
