package by.ViktoriaZakarian.constants;

public enum DATA {
    EMAIL("zakarianviktoria@gmail.com"),
    PASSWORD("Vikintosh_708"),
    INVALID_EMAIL("test@gmail.com"),
    INVALID_PASSWORD("123 user 4"),
    FIRST_NAME("Viktoria"),
    INVALID_FIRST_NAME("us er"),
    LAST_NAME("Zakarian"),
    INVALID_LAST_NAME("US%ER"),
    DATE_OF_BIRTH("07.08.2000");

    private String data;

    DATA(String data) {
        this.data = data;
    }

    public String getData() {
        return data;
    }
}
