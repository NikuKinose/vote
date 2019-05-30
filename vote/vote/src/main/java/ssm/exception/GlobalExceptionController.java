package ssm.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import javax.servlet.http.HttpSession;

@ControllerAdvice
public class GlobalExceptionController {


    @ExceptionHandler({Exception.class})
    public String exception(Exception e, HttpSession session) {
        session.setAttribute("e",e);
        return "error";
    }
}

