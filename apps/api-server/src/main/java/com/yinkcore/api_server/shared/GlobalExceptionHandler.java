package com.yinkcore.api_server.shared;

import com.yinkcore.shared.application.response.ErrorResponse;
import com.yinkcore.shared.domain.exception.BusinessException;
import com.yinkcore.shared.domain.exception.ResourceNotFoundException;
import com.yinkcore.shared.infrastructure.time.ClockProvider;
import jakarta.servlet.http.HttpServletRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestControllerAdvice
@RequiredArgsConstructor
public class GlobalExceptionHandler {

  private final ClockProvider time;
  
  @ExceptionHandler(ResourceNotFoundException.class)
  @ResponseStatus(HttpStatus.NOT_FOUND)
  public ErrorResponse handleNotFound(ResourceNotFoundException ex, HttpServletRequest request) {

    return new ErrorResponse(
      time.now(), 404, "NOT_FOUND", ex.getMessage(), request.getRequestURI());
  }

  @ExceptionHandler(BusinessException.class)
  @ResponseStatus(HttpStatus.BAD_REQUEST)
  public ErrorResponse handleBusiness(BusinessException ex, HttpServletRequest request) {

    return new ErrorResponse(
      time.now(), 400, "BUSINESS_ERROR", ex.getMessage(), request.getRequestURI());
  }
}
