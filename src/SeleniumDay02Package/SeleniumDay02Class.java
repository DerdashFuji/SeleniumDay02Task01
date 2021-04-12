package SeleniumDay02Package;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class SeleniumDay02Class {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\fuads\\Desktop\\D T\\Browser Drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
                                //        1. Navigate to duotech.io
        driver.get("https://www.duotech.io/");
                                //        2. Verify the page title contains Duotech Academy
        String expectedtitle = "Duotech Academy";
        String actualTitle = driver.getTitle();
        System.out.println(actualTitle);
        verifyContains(actualTitle, expectedtitle);
                                //        3. Navigate to tiktok.com
        driver.get("https://www.tiktok.com/");
                                //        4. Verify the url is https://www.tiktok.com/
        String eU = "https://www.tiktok.com/";
        String aU = driver.getCurrentUrl();
           verifyEquals(aU, eU);
                                //        5. Navigate to https://stackoverflow.com/
        driver.get("https://stackoverflow.com/");
                                //        6. Verify the title contains Stack Overflow
        String at = driver.getTitle();
        String et = "Stack Overflow";
                    verifyContains(at, et);
                                //        7. Navigate back to duotech.io and verify that page contains
        driver.navigate().back();
        driver.navigate().back();
                                //        Start New IT Career text
        String eT1 = "IT Career";
        String ps = driver.getPageSource();
        verifyContains( ps, eT1);


        driver.quit();


    }
        public static void verifyContains(String a, String e){
            if (a.contains(e)){
                System.out.println("Test Passed. The title contains " + e +" which is act title is" + a);
            }else{
                System.out.println("Test Failed. The title contains " + e +" which is exp title is" + a);
            } }


    public static void verifyEquals(String a, String e) {

        if (a.equals(e)) {
            System.out.println("Test Passed. ");
        } else {
            System.out.println("Test Failed");
        } }





}
