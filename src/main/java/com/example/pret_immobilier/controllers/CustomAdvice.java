package com.example.pret_immobilier.controllers;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.util.List;

@RestControllerAdvice
public class CustomAdvice extends ResponseEntityExceptionHandler {

    /**
     * On redéfini "handleMethodArgumentNotValid" qui est la méthode appelée par
     * Spring en cas d'erreur de validation. En effet, Spring lève une exception
     * "MethodArgumentNotValidException" si la moindre contrainte de validation
     * est violée sur un DTO, l'exception est ensuite interceptée par le
     * framework avant d'appeler "handleMethodArgumentNotValid".
     * <p>
     * Dans cette redéfinition nous spécifions le statut HTTP 400 BAD REQUEST et
     * retournons la liste de toutes les erreurs dans le corps de la réponse
     * HTTP.
     */
    @Override
    protected ResponseEntity<Object> handleMethodArgumentNotValid(
            MethodArgumentNotValidException ex, HttpHeaders headers,
            HttpStatus status, WebRequest request) {
        HttpStatus badRequest = HttpStatus.BAD_REQUEST;
        List<ObjectError> errors = ex.getAllErrors();
        return handleExceptionInternal(ex, errors, headers, badRequest,
                request);
    }
}
