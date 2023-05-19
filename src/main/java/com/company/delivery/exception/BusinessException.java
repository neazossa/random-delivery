package com.company.delivery.exception;

import com.company.delivery.models.constant.GlobalMessage;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.SneakyThrows;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BusinessException extends RuntimeException {

    private String code;
    private String message;
    private String messageID;

    public BusinessException(String message) {
        super(message);
    }

    public BusinessException(GlobalMessage globalMessage) {
        super(globalMessage.message);
        this.code = globalMessage.code;
        this.message = globalMessage.message;
    }

    public BusinessException(GlobalMessage globalMessage, String additionalMessage) {
        super(globalMessage.message +" "+ additionalMessage);
        this.code = globalMessage.code;
        this.message = globalMessage.message +" "+ additionalMessage;
    }

    @SneakyThrows
    public static void throwError(GlobalMessage globalMessage, String additionalMessage){
        throw new BusinessException(globalMessage, additionalMessage);
    }

    @SneakyThrows
    public static void throwError(GlobalMessage globalMessage){
        throw new BusinessException(globalMessage);
    }

}

