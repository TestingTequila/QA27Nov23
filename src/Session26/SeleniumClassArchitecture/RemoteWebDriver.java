package Session26.SeleniumClassArchitecture;

public class RemoteWebDriver implements WebDriver, JavaScriptExecutor
{

    @Override
    public void findElement() {
        System.out.println("RWD---findElement");
    }

    @Override
    public void findElements() {
        System.out.println("RWD---findElements");
    }

    @Override
    public String get(String url) {
        System.out.println("RWD---get");
        return url;
    }

    @Override
    public String getTitle() {
        System.out.println("RWD---getTitle");
        return "Goggle";
    }

    @Override
    public void click() {
        System.out.println("RWD---click");
    }

    @Override
    public void sendKeys(String element, String text) {
        System.out.println("RWD---sendKeys");
    }

    @Override
    public void close() {
        System.out.println("RWD---close");
    }

    @Override
    public void executeScript() {
        System.out.println("RWD---executeScript");
    }
}
