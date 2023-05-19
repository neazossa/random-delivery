package com.company.delivery.models.constant;

public enum GlobalMessage {

    SUCCESS("00", "SUCCESS"),
    FAILED("01", "FAILED"),
    DATA_ALREADY_EXISTS("02", "Data Already Exists"),
    DATA_NOT_FOUND("06", "DATA NOT FOUND"),
    EMPLOYEE_DATA_NOT_FOUND("07", "EMPLOYEE DATA NOT FOUND"),
    DUPLICATE_LEGAL_ID("08", "Legal Id is exists"),
    DUPLICATE_PHONE_NUMBER("09", "Phone number is exists"),
    PHONE_NUMBER_LENGTH("10", "Phone number min 10 max 16"),
    USER_ALREADY_ACTIVE("11", "User already active"),
    USER_ALREADY_BLOCK("12", "User already block"),
    PARTICIPANT_CODE_NOT_FOUND("13", "Participant Code Not Found"),
    USERNAME_ALREADY_EXISTS("14", "Username already exists"),
    OLD_PASSWORD_NOT_MATCH("15", "Your old password is not match"),
    METHOD_ARGUMENTS_NOT_VALID("98", "Method arguments not valid"),
    ERROR("99", "ERROR"),
    SYSTEM_ERROR("99", "Contact our team"),
    UNAUTHORIZED("401", "Unauthorized");

    public final String code;
    public final String message;

    GlobalMessage(String code, String message) {
        this.code = code;
        this.message = message;
    }
}
