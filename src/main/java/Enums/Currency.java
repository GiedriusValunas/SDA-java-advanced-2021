package Enums;

public enum Currency {

    EURO("€"),
    USD("$");

    private String logo;

    Currency(String logo) {
        this.logo = logo;
    }

    public String getLogo() {
        return logo;
    }
}
