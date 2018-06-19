package br.com.gabriel.springRest.controller;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ErrorCustonController implements ErrorController {
    
    private static String PATH_ERROR = "errors/";
    private static String ERROR_DEFAULT = PATH_ERROR+"default";

    @Override
    public String getErrorPath ( ) {
	return ERROR_DEFAULT;
    }
    
    @RequestMapping("/error")
    public String handleError(HttpServletRequest request) {
        Object status = request.getAttribute(RequestDispatcher.ERROR_STATUS_CODE);
         
        if (status != null) {
            Integer statusCode = Integer.valueOf(status.toString());
         
            if(statusCode == HttpStatus.NOT_FOUND.value()) {
                return PATH_ERROR+"error-404";
            }
            else if(statusCode == HttpStatus.INTERNAL_SERVER_ERROR.value()) {
                return PATH_ERROR+"error-500";
            }
        }
        return ERROR_DEFAULT;
    }

}
