package com.company.delivery.exception;

import com.company.delivery.models.constant.GlobalMessage;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.SneakyThrows;

@Setter
@Getter
@AllArgsConstructor
public class DataNotFoundException extends RuntimeException {

    private String code;
    private String message;
    private String messageId;

    public DataNotFoundException() {
        super();
    }

    public DataNotFoundException(Exception e) {
        super(e);
    }

    public DataNotFoundException(GlobalMessage globalMessage) {
        super(globalMessage.message);
        this.code = globalMessage.code;
        this.message = globalMessage.message;
    }

    public DataNotFoundException(GlobalMessage globalMessage, String additionalMessage) {
        super(globalMessage.message + " " + additionalMessage);
        this.code = globalMessage.code;
        this.message = globalMessage.message + " " + additionalMessage;
    }

    public DataNotFoundException(String code, String message) {
        this.code = code;
        this.message = message;
    }

    @SneakyThrows
    public static void throwError(GlobalMessage globalMessage, String additionalMessage) {
        throw new DataNotFoundException(globalMessage, additionalMessage);
    }

    @SneakyThrows
    public static void throwError(GlobalMessage globalMessage) {
        throw new BusinessException(globalMessage);
    }

}
