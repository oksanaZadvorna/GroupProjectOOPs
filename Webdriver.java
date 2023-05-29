package GroupProjectOOPs;

interface Webdriver {
    void open();
    void close();
    String getTitle();

}
interface TakesScreenshot{
    void getScreenshot();
}
interface RemoteWebDriver extends Webdriver, TakesScreenshot{
    void navigate();
}
class ChromeDriver implements RemoteWebDriver{

    @Override
    public void open() {
        System.out.println("The browser opens");
    }

    @Override
    public void close() {
        System.out.println("The browser closes");
    }

    @Override
    public String getTitle() {
        return "Chrome";
    }

    @Override
    public void getScreenshot() {
        System.out.println("The browser takes screenshot");
    }

    @Override
    public void navigate() {
        System.out.println("The browser navigates");
    }
}
class FirefoxDriver implements RemoteWebDriver{

    @Override
    public void open() {
        System.out.println("The browser opens");
    }

    @Override
    public void close() {
        System.out.println("The browser closes");
    }

    @Override
    public String getTitle() {
        return "Firefox";
    }

    @Override
    public void getScreenshot() {
        System.out.println("The browser takes screenshot");
    }

    @Override
    public void navigate() {
        System.out.println("The browser navigates");
    }
}
class SafariDriver implements RemoteWebDriver{

    @Override
    public void open() {
        System.out.println("The browser opens");
    }

    @Override
    public void close() {
        System.out.println("The browser closes");
    }

    @Override
    public String getTitle() {

        return "Safari";
    }

    @Override
    public void getScreenshot() {
        System.out.println("The browser takes screenshot");
    }

    @Override
    public void navigate() {
        System.out.println("The browser navigates");
    }
}
class WebTester{
    public static void main(String[] args) {
        RemoteWebDriver [] drivers={new ChromeDriver(), new FirefoxDriver(), new SafariDriver()};
        for (RemoteWebDriver driver : drivers) {
            driver.open();
            driver.close();
            System.out.println(driver.getTitle());
            driver.navigate();
            driver.getScreenshot();

        }
    }
}