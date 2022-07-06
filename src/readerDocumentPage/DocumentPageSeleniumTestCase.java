package readerDocumentPage;
/* File name: DocumentPageSeleniumTestCase.java */
import readerDocumentPage.ReadDocumentPageCSV;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;

public class DocumentPageSeleniumTestCase {

    public static void main(String[] args) {
//        System.setProperty("webdriver.chrome.driver", "/Users/jjun/Documents/IDEAprojects/chromedriver");
//        WebDriver driver = new ChromeDriver();
//
//        readerDocumentPage.contentLines obj = new readerDocumentPage.contentLines();
//        contentLines values = new contentLines();
        ReadDocumentPageCSV obj = new ReadDocumentPageCSV();
////        driver.get(obj.rocketLawyerBaseURL());
////        String arrContent = String.valueOf(obj.rocketLawyerBaseURL());
//        ArrayList<Object> arrContent = new ArrayList<Object>();
        int i = 0;
        for (obj.rocketLawyerBaseURL() : r) {
            System.out.println(obj.rocketLawyerBaseURL());

//            driver.get((String) arrContent.get(i));
//
//            String expectedTitle = "Inspection Worksheet";
//            if (driver.getTitle().contains(expectedTitle))
//                System.out.println("ok");
//            else
//                System.out.println("nope");
        }
//        driver.quit();

    }
}
