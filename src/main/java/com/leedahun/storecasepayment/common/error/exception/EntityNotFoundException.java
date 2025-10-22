package com.leedahun.storecasepayment.common.error.exception;

import com.leedahun.storecasepayment.common.message.ErrorMessage;
import org.springframework.http.HttpStatus;

public class EntityNotFoundException extends CustomException {

    public EntityNotFoundException(String entity, String data) {
        super(ErrorMessage.ENTITY_NOT_FOUND.getMessage() + entity + ": " + data, HttpStatus.BAD_REQUEST);
    }
}
