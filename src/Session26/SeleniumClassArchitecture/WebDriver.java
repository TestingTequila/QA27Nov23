package Session26.SeleniumClassArchitecture;

public interface WebDriver extends  SearchContext
{
    public  String get(String url);
    public  String getTitle();
    public  void click();
    public void sendKeys(String element, String text);
    public  void close();

}
