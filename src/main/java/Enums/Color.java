package Enums;

public enum Color {

    // ANSI colors
    BLUE("\u001B[34m"),
    YELLOW("\u001B[33m"),
    GREEN("\u001B[32m"),
    RED("\u001B[31m"),
    RESET("\u001B[0m"),

    BLACK( "0" );

    private String code;

    Color(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }

}
