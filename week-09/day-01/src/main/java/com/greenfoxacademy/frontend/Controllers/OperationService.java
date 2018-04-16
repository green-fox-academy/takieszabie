package com.greenfoxacademy.frontend.Controllers;

import com.greenfoxacademy.frontend.Models.Operation;
import org.springframework.stereotype.Component;

@Component
public class OperationService {

  public static Operation sum(long number){
    Operation operation = new Operation(number);
    operation.setResult(0);
    for (int i = 0; i < number; i++) {
      operation.setResult(operation.getResult()+i+1);
    }
    return operation;
  }

  public static Operation factor(long number){
    Operation operation = new Operation(number);
    operation.setResult(1);
    for (int i = 0; i < number; i++) {
      operation.setResult(operation.getResult()*(i+1));
    }
    return operation;
  }
}
