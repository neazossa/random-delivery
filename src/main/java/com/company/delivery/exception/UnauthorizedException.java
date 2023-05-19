package com.company.delivery.exception;

import com.company.delivery.models.constant.GlobalMessage;
import lombok.*;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class UnauthorizedException extends RuntimeException {

    private String code;
    private String message;
    private String messageId;

    public UnauthorizedException(Exception e) {
        super(e);
    }

    public UnauthorizedException(GlobalMessage globalMessage) {
        super(globalMessage.message);
        this.code = globalMessage.code;
        this.message = globalMessage.message;
    }

    public UnauthorizedException(GlobalMessage globalMessage, String additionalMessage) {
        super(globalMessage.message + " " + additionalMessage);
        this.code = globalMessage.code;
        this.message = globalMessage.message + " " + additionalMessage;
    }

    @SneakyThrows
    public static void throwError(GlobalMessage globalMessage, String additionalMessage) {
        throw new UnauthorizedException(globalMessage, additionalMessage);
    }

    @SneakyThrows
    public static void throwError(GlobalMessage globalMessage) {
        throw new BusinessException(globalMessage);
    }

}
