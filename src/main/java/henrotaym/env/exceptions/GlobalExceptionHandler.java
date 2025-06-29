package henrotaym.env.exceptions;

import henrotaym.env.http.resources.exceptions.ApiExceptionResource;
import henrotaym.env.mappers.ApiExceptionMapper;
import jakarta.persistence.EntityNotFoundException;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

// @Order(Ordered.HIGHEST_PRECEDENCE)
@ControllerAdvice
@AllArgsConstructor
public class GlobalExceptionHandler {
  private ApiExceptionMapper apiExceptionMapper;

  @ExceptionHandler(exception = EntityNotFoundException.class)
  @ResponseStatus(value = HttpStatus.NOT_FOUND)
  public ResponseEntity<ApiExceptionResource> handleEntityNotFoundException(
      EntityNotFoundException exception) {
    ApiException apiException = this.apiExceptionMapper.entityNotFound(exception);

    return this.apiExceptionMapper.responseEntity(apiException);
  }

  @ExceptionHandler(exception = MethodArgumentNotValidException.class)
  @ResponseStatus(value = HttpStatus.BAD_REQUEST)
  public ResponseEntity<ApiExceptionResource> handleMethodArgumentNotValidException(
      MethodArgumentNotValidException exception) {
    ApiException apiException = this.apiExceptionMapper.methodArgumentNotValid(exception);

    return this.apiExceptionMapper.responseEntity(apiException);
  }

  @ExceptionHandler(exception = InsufficientStockException.class)
  @ResponseStatus(value = HttpStatus.UNPROCESSABLE_ENTITY)
  public ResponseEntity<ApiExceptionResource> handleInsufficientStockException(
      InsufficientStockException exception) {
    ApiException apiException = this.apiExceptionMapper.insufficientStockException(exception);

    return this.apiExceptionMapper.responseEntity(apiException);
  }
}
