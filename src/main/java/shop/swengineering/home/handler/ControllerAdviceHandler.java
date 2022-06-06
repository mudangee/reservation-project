package shop.swengineering.home.handler;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import shop.swengineering.home.domain.user.dto.ResponseDto;
import shop.swengineering.home.handler.exception.CustomException;

@ControllerAdvice
public class ControllerAdviceHandler {

    @ExceptionHandler(CustomException.class)
    public ResponseEntity<ResponseDto<?>> apiException(CustomException e){

        return new ResponseEntity<>(new ResponseDto<>(-1,e.getMessage(),null), HttpStatus.BAD_REQUEST);
    }
}
