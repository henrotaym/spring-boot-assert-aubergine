package henrotaym.env.annotations;

import henrotaym.env.http.resources.exceptions.ApiExceptionResource;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD})
@ApiResponse(
    responseCode = "400",
    content = @Content(schema = @Schema(implementation = ApiExceptionResource.class)))
public @interface ValidateRequest {}
