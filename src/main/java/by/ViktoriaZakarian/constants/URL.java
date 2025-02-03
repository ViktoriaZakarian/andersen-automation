package by.ViktoriaZakarian.constants;

public enum URL {
    AUTOMATION_PRACTICE("http://www.automationpractice.pl/index.php"),
    ZOO("https://zoo.waw.pl/"),
    W3SCHOOLS("https://www.w3schools.com/"),
    CLICK_SPEED_TESTER("https://www.clickspeedtester.com/click-counter/"),
    ANDERSEN_LAB("https://andersenlab.com/"),
    ANDERSEN_LOGIN("https://qa-course-01.andersenlab.com/login"),
    ANDERSEN_REGISTRATION("https://qa-course-01.andersenlab.com/registration");

    private String url;

    URL(String url) {
        this.url = url;
    }

    public String getUrl() {
        return url;
    }
}
