import org.junit.*;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import play.mvc.*;
import play.test.*;
import play.libs.F.*;

import static play.test.Helpers.*;
import static org.junit.Assert.*;

import static org.fluentlenium.core.filter.FilterConstructor.*;

public class IntegrationTest extends WithBrowser {

    /**
     * add your integration test here
     * in this example we just check if the welcome page is being shown
     */
    @Test
    public void test() {
        running(testServer(3333, fakeApplication(inMemoryDatabase())), getDriver(), new Callback<TestBrowser>() {
            public void invoke(TestBrowser browser) throws InterruptedException {
                browser.goTo("http://localhost:3333");
                Thread.sleep(5000);
                assertTrue(browser.pageSource().contains("Your new application is ready."));
            }
        });
    }

    public WebDriver getDriver(){
        return new FirefoxDriver();
    }

}
