package com.yinkcore.api_server.shared;

import com.yinkcore.shared.application.response.ErrorResponse;
import com.yinkcore.shared.application.response.ValidationErrorResponse;
import com.yinkcore.shared.domain.exception.BusinessException;
import com.yinkcore.shared.domain.exception.ResourceNotFoundException;
import com.yinkcore.shared.infrastructure.time.ClockProvider;
import jakarta.servlet.http.HttpServletRequest;
import java.time.Instant;
import java.util.HashMap;
import java.util.Map;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.*;



/**
 * ensures that all exceptions thrown by controllers are handled in a consistent way, providing
 * meaningful error responses to clients and improving the overall robustness of the API.
 * By centralizing exception handling logic, it promotes cleaner code and better separation of concerns,
 * allowing controllers to focus on business logic while the GlobalExceptionHandler manages error responses.
 * This class is annotated with @RestControllerAdvice, which allows it to intercept exceptions thrown by any
 * controller in the application and return appropriate HTTP responses based on the type of exception encountered.
 * The handler methods are annotated with @ExceptionHandler to specify which exceptions they handle, and 
 * @ResponseStatus to set the HTTP status code for the response.
 * 
 * The handleNotFound method handles ResourceNotFoundException and returns a 404 Not Found response with an error message.
 * The handleBusiness method handles BusinessException and returns a 400 Bad Request response with an error message.
 * The handleValidation method handles MethodArgumentNotValidException and returns a 400 Bad Request response with 
 * validation errors.
 * Overall, this class plays a crucial role in ensuring that the API provides clear and consistent error responses to 
 * clients, enhancing the user experience and making it easier for developers to debug issues.
 * 
 * @author Young Lecturer
 * @since 2026-06-11
 * 
 */
@RestControllerAdvice
@RequiredArgsConstructor
public class GlobalExceptionHandler {

  private final ClockProvider time;


  /**
   * Handles ResourceNotFoundException and returns a 404 Not Found response with an error message.
   *
   * @param ex the ResourceNotFoundException that was thrown
   * @param request the HttpServletRequest that resulted in the exception
   * @return an ErrorResponse containing details about the error
   */
  @ExceptionHandler(ResourceNotFoundException.class)
  @ResponseStatus(HttpStatus.NOT_FOUND)
  public ErrorResponse handleNotFound(ResourceNotFoundException ex, HttpServletRequest request) {

    return new ErrorResponse(
        time.now(), 404, "NOT_FOUND", ex.getMessage(), request.getRequestURI());
  }


  /**
   * Handles BusinessException and returns a 400 Bad Request response with an error message.
   * @param ex the BusinessException that was thrown
   * @param request the HttpServletRequest that resulted in the exception
   * @return an ErrorResponse containing details about the error
   * 
   */
  @ExceptionHandler(BusinessException.class)
  @ResponseStatus(HttpStatus.BAD_REQUEST)
  public ErrorResponse handleBusiness(BusinessException ex, HttpServletRequest request) {

    return new ErrorResponse(
        time.now(), 400, "BUSINESS_ERROR", ex.getMessage(), request.getRequestURI());
  }

  
  /**
  * Handles MethodArgumentNotValidException and returns a 400 Bad Request response with validation errors.
  * @param ex the MethodArgumentNotValidException that was thrown
  * @return a ValidationErrorResponse containing details about the validation errors
  */
  @ExceptionHandler(MethodArgumentNotValidException.class)
  @ResponseStatus(HttpStatus.BAD_REQUEST)
  public ValidationErrorResponse handleValidation(MethodArgumentNotValidException ex) {

    Map<String, String> errors = new HashMap<>();

    ex.getBindingResult()
        .getFieldErrors()
        .forEach(error -> errors.put(error.getField(), error.getDefaultMessage()));

    return new ValidationErrorResponse(Instant.now(), 400, "VALIDATION_ERROR", errors);
  }
}
