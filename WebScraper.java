import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.JavascriptExecutor;

import org.jsoup.Jsoup;


import java.net.URL;

public class WebScraper {
    public static void main(String[] args) {
        // Set the path to ChromeDriver


        // Instantiate ChromeDriver
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        // 10 cities of california Construction and infrastructure project
        String richmond_city_url= "https://www.ci.richmond.ca.us/1404/Major-Projects";
        String LosAngeles_city_url = "https://engineering.lacity.gov/major_projects";
        String SanFrancisco_city_url = "https://www.sfpublicworks.org/projects";
        String SanDiego_city_url = "https://www.sandiego.gov/cip/projectinfo/featuredprojects";
        String oakland_city_url = "https://www.oaklandca.gov/topics/major-development-projects";
        String SantaBarbara_url = "https://santabarbaraca.gov/government/construction-projects";
        String BakerField_city_url = "https://www.bakersfieldcity.us/555/Current-Projects";
        String PalmSprings_city_url = "https://www.palmspringsca.gov/government/departments/planning/project-submittals-status";
        String eureka_city_url= "https://eurekaconst.com/projects-2/";
        String Riverside_city_url="https://www.riversideca.gov/utilities/projects";



        // LINK 1 in Table i.e Richmond, California-------------------------------------------------------------------------------
        // Navigate to the webpage, web scrapes the page and gets the html
        driver.get(richmond_city_url);
        String Page = driver.getPageSource();
        System.out.println(" The page Source HTML is: -------->/n"+Page);

        //navigates to links under Capital Projects to get project details contents
        driver.navigate().to("https://www.ci.richmond.ca.us/viaverdiproject");
        JavascriptExecutor js1 = (JavascriptExecutor) driver;
        for (int i = 0; i < 10; i++) {
            js1.executeScript("window.scrollBy(0, 500)");
            try {
                Thread.sleep(500); // Adjust sleep time to control scrolling speed
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        WebElement content = driver.findElement(By.tagName("body"));
        System.out.println("PAGE CONTENT OF Capital Projects is : --> /n"+content.getText() );
        driver.navigate().back();

        // next to 2nd link under capital projects
        driver.navigate().to("https://www.ci.richmond.ca.us/4486/Travel-Safe-Richmond");
        JavascriptExecutor js2 = (JavascriptExecutor) driver;
        for (int i = 0; i < 10; i++) {
            js2.executeScript("window.scrollBy(0, 500)");
            try {
                Thread.sleep(500); // Adjust sleep time to control scrolling speed
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        WebElement content1 = driver.findElement(By.tagName("body"));
        System.out.println("PAGE CONTENT OF Capital Projects is : --> /n"+content1.getText() );
        driver.navigate().back();

        // Navigate to Under-Construction Projects links..
        driver.navigate().to("https://ca-richmond3.civicplus.com/3552/Chevron-Richmond-Refinery-Modernization-");
        JavascriptExecutor js3 = (JavascriptExecutor) driver;
        for (int i = 0; i < 10; i++) {
            js3.executeScript("window.scrollBy(0, 500)");
            try {
                Thread.sleep(500); // Adjust sleep time to control scrolling speed
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        WebElement content2 = driver.findElement(By.tagName("body"));
        System.out.println("PAGE CONTENT OF Under Construction projects : --> /n"+content2.getText() );
        driver.navigate().back();

        //Under-Construction Projects links..
        driver.navigate().to("https://www.ci.richmond.ca.us/3449/Making-Waves-Academy-Expansion-Project");
        JavascriptExecutor js4 = (JavascriptExecutor) driver;
        for (int i = 0; i < 10; i++) {
            js4.executeScript("window.scrollBy(0, 500)");
            try {
                Thread.sleep(500); // Adjust sleep time to control scrolling speed
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        WebElement content3 = driver.findElement(By.tagName("body"));
        System.out.println("PAGE CONTENT OF Under Construction projects : --> /n"+content3.getText() );
        driver.navigate().back();

        //Under-Construction Projects links..
        driver.navigate().to("https://www.ci.richmond.ca.us/3977/Richmond-Country-Club-Residential-Projec");
        JavascriptExecutor js5 = (JavascriptExecutor) driver;
        for (int i = 0; i < 10; i++) {
            js5.executeScript("window.scrollBy(0, 500)");
            try {
                Thread.sleep(500); // Adjust sleep time to control scrolling speed
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        WebElement content4 = driver.findElement(By.tagName("body"));
        System.out.println("PAGE CONTENT OF Under Construction projects : --> /n"+content4.getText() );
        driver.navigate().back();

        //Under-Construction Projects links..
        driver.navigate().to("https://www.ci.richmond.ca.us/4175/47400/Duke-Realty-Light-Industrial-Warehouse?activeLiveTab=widgets");
        JavascriptExecutor js6 = (JavascriptExecutor) driver;
        for (int i = 0; i < 10; i++) {
            js6.executeScript("window.scrollBy(0, 500)");
            try {
                Thread.sleep(500); // Adjust sleep time to control scrolling speed
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        WebElement content5 = driver.findElement(By.tagName("body"));
        System.out.println("PAGE CONTENT OF Under Construction projects : --> /n"+content5.getText() );
        driver.navigate().back();
        

        // LINK 2 : Los Angeles, California------------------------------------------------------------------------------------------
        // Navigate to the webpage, web scrapes the page and gets the html
        driver.get(LosAngeles_city_url);
        String Page1 = driver.getPageSource();
        System.out.println(" The page Source HTML is: -------->/n"+Page1);

        //Navigate to
        driver.navigate().to("https://engineering.lacity.gov/about-us/divisions/clean-water/2020-floodplain-management-plan-update");
        WebElement content6 = driver.findElement(By.tagName("body"));
        System.out.println("PAGE CONTENT OF Under Construction projects : --> /n"+content6.getText() );
        driver.navigate().back();

        driver.navigate().to("https://engineering.lacity.gov/abh-projects");
        WebElement content7 = driver.findElement(By.tagName("body"));
        System.out.println("PAGE CONTENT OF Under Construction projects : --> /n"+content7.getText() );
        driver.navigate().back();

        driver.navigate().to("https://engineering.lacity.gov/about-us/divisions/environmental-management/projects/asphalt-plant-no-1-replacement-and-modernization-project");
        WebElement content8 = driver.findElement(By.tagName("body"));
        System.out.println("PAGE CONTENT OF Under Construction projects : --> /n"+content8.getText() );
        driver.navigate().back();

        driver.navigate().to("https://engineering.lacity.gov/about-us/divisions/bridge-improvement/glendale-hyperion-bridge-improvement-project");
        WebElement content9 = driver.findElement(By.tagName("body"));
        System.out.println("PAGE CONTENT OF Under Construction projects : --> /n"+content9.getText() );
        driver.navigate().back();

        driver.navigate().to("https://engineering.lacity.gov/silver-lake-reservoir-complex-master-plan");
        WebElement content10 = driver.findElement(By.tagName("body"));
        System.out.println("PAGE CONTENT OF Under Construction projects : --> /n"+content10.getText() );
        driver.navigate().back();


        // LINK 3 : San Francisco data -------------------------------------------------------------------------------------------
        driver.get(SanFrancisco_city_url);
        JavascriptExecutor js7 = (JavascriptExecutor) driver;
        for (int i = 0; i < 10; i++) {
            js7.executeScript("window.scrollBy(0, 500)");
            try {
                Thread.sleep(500); // Adjust sleep time to control scrolling speed
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        String Page2 = driver.getPageSource();
        System.out.println(" The page Source HTML is: -------->/n"+Page2);

        driver.navigate().to("https://www.sfpublicworks.org/project/wiggle");
        JavascriptExecutor js8 = (JavascriptExecutor) driver;
        for (int i = 0; i < 10; i++) {
            js8.executeScript("window.scrollBy(0, 500)");
            try {
                Thread.sleep(500); // Adjust sleep time to control scrolling speed
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        WebElement content11 = driver.findElement(By.tagName("body"));
        System.out.println("PAGE CONTENT OF Under Construction projects : --> /n"+content11.getText() );
        driver.navigate().back();

        driver.navigate().to("https://www.sfpublicworks.org/VL61");
        JavascriptExecutor js9 = (JavascriptExecutor) driver;
        for (int i = 0; i < 10; i++) {
            js9.executeScript("window.scrollBy(0, 500)");
            try {
                Thread.sleep(500); // Adjust sleep time to control scrolling speed
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        WebElement content12 = driver.findElement(By.tagName("body"));
        System.out.println("PAGE CONTENT OF Under Construction projects : --> /n"+content12.getText() );
        driver.navigate().back();

        driver.navigate().to("https://www.sfpublicworks.org/VL53");
        JavascriptExecutor js10 = (JavascriptExecutor) driver;
        for (int i = 0; i < 10; i++) {
            js10.executeScript("window.scrollBy(0, 500)");
            try {
                Thread.sleep(500); // Adjust sleep time to control scrolling speed
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        WebElement content13 = driver.findElement(By.tagName("body"));
        System.out.println("PAGE CONTENT OF Under Construction projects : --> /n"+content13.getText() );
        driver.navigate().back();

        //Link 4: san diego ----------------------------------------------------------------------------------------------------------------
        driver.get(SanDiego_city_url);
        JavascriptExecutor js11 = (JavascriptExecutor) driver;
        for (int i = 0; i < 10; i++) {
            js11.executeScript("window.scrollBy(0, 500)");
            try {
                Thread.sleep(500); // Adjust sleep time to control scrolling speed
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        String Page3 = driver.getPageSource();
        System.out.println(" The page Source HTML is: -------->/n"+Page3);

        driver.navigate().to("https://www.sandiego.gov/cip/projectinfo/featuredprojects/convoyresurfacing");
        JavascriptExecutor js12 = (JavascriptExecutor) driver;
        for (int i = 0; i < 10; i++) {
            js12.executeScript("window.scrollBy(0, 500)");
            try {
                Thread.sleep(500); // Adjust sleep time to control scrolling speed
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        WebElement content14 = driver.findElement(By.tagName("body"));
        System.out.println("PAGE CONTENT OF Under Construction projects : --> /n"+content14.getText() );
        driver.navigate().back();

        driver.navigate().to("https://www.sandiego.gov/cip/projectinfo/featuredprojects/alvarado");
        JavascriptExecutor js13 = (JavascriptExecutor) driver;
        for (int i = 0; i < 10; i++) {
            js13.executeScript("window.scrollBy(0, 500)");
            try {
                Thread.sleep(500); // Adjust sleep time to control scrolling speed
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        WebElement content15 = driver.findElement(By.tagName("body"));
        System.out.println("PAGE CONTENT OF Under Construction projects : --> /n"+content15.getText() );
        driver.navigate().back();

        driver.navigate().to("https://www.sandiego.gov/cip/projectinfo/BotanicalBuilding");
        JavascriptExecutor js14 = (JavascriptExecutor) driver;
        for (int i = 0; i < 10; i++) {
            js14.executeScript("window.scrollBy(0, 500)");
            try {
                Thread.sleep(500); // Adjust sleep time to control scrolling speed
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        WebElement content16 = driver.findElement(By.tagName("body"));
        System.out.println("PAGE CONTENT OF Under Construction projects : --> /n"+content16.getText() );
        driver.navigate().back();

        //Link 5: oakland -------------------------------------------------------------------------------------------------------------
        driver.get(oakland_city_url);
        JavascriptExecutor js15 = (JavascriptExecutor) driver;
        for (int i = 0; i < 10; i++) {
            js15.executeScript("window.scrollBy(0, 500)");
            try {
                Thread.sleep(500); // Adjust sleep time to control scrolling speed
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        String Page4 = driver.getPageSource();
        System.out.println(" The page Source HTML is: -------->/n"+Page4);

        driver.navigate().to("https://www.oaklandca.gov/projects/460-24th-st-pigozzi-project");
        JavascriptExecutor js16 = (JavascriptExecutor) driver;
        for (int i = 0; i < 10; i++) {
            js16.executeScript("window.scrollBy(0, 500)");
            try {
                Thread.sleep(500); // Adjust sleep time to control scrolling speed
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        WebElement content17 = driver.findElement(By.tagName("body"));
        System.out.println("PAGE CONTENT OF Under Construction projects : --> /n"+content17.getText() );
        driver.navigate().back();

        driver.navigate().to("https://www.oaklandca.gov/projects/500-kirkham-project");
        JavascriptExecutor js17 = (JavascriptExecutor) driver;
        for (int i = 0; i < 10; i++) {
            js17.executeScript("window.scrollBy(0, 500)");
            try {
                Thread.sleep(500); // Adjust sleep time to control scrolling speed
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        WebElement content18 = driver.findElement(By.tagName("body"));
        System.out.println("PAGE CONTENT OF Under Construction projects : --> /n"+content18.getText() );
        driver.navigate().back();

        driver.navigate().to("https://www.oaklandca.gov/projects/98th-san-leandro-madison-park");
        JavascriptExecutor js18 = (JavascriptExecutor) driver;
        for (int i = 0; i < 10; i++) {
            js18.executeScript("window.scrollBy(0, 500)");
            try {
                Thread.sleep(500); // Adjust sleep time to control scrolling speed
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        WebElement content19 = driver.findElement(By.tagName("body"));
        System.out.println("PAGE CONTENT OF Under Construction projects : --> /n"+content19.getText() );
        driver.navigate().back();

        //Link 6 :santa barbara ----------------------------------------------------------------------------------------------------
        driver.get(SantaBarbara_url);
        JavascriptExecutor js19 = (JavascriptExecutor) driver;
        for (int i = 0; i < 10; i++) {
            js19.executeScript("window.scrollBy(0, 500)");
            try {
                Thread.sleep(500); // Adjust sleep time to control scrolling speed
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        String Page5 = driver.getPageSource();
        System.out.println(" The page Source HTML is: -------->/n"+Page5);

        driver.navigate().to("https://sbparksandrec.santabarbaraca.gov/projects/alameda-park-bandstand-repair-project");
        JavascriptExecutor js20 = (JavascriptExecutor) driver;
        for (int i = 0; i < 10; i++) {
            js20.executeScript("window.scrollBy(0, 500)");
            try {
                Thread.sleep(500); // Adjust sleep time to control scrolling speed
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        WebElement content20 = driver.findElement(By.tagName("body"));
        System.out.println("PAGE CONTENT OF Under Construction projects : --> /n"+content20.getText() );
        driver.navigate().back();

        driver.navigate().to("https://santabarbaraca.gov/projects/andree-clark-bird-refuge-restoration");
        JavascriptExecutor js21 = (JavascriptExecutor) driver;
        for (int i = 0; i < 10; i++) {
            js21.executeScript("window.scrollBy(0, 500)");
            try {
                Thread.sleep(500); // Adjust sleep time to control scrolling speed
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        WebElement content21 = driver.findElement(By.tagName("body"));
        System.out.println("PAGE CONTENT OF Under Construction projects : --> /n"+content21.getText() );
        driver.navigate().back();

       // Link 7 :BakerField -------------------------------------------------------------------------------------------------------
        driver.get(BakerField_city_url);
        JavascriptExecutor js22 = (JavascriptExecutor) driver;
        for (int i = 0; i < 10; i++) {
            js22.executeScript("window.scrollBy(0, 500)");
            try {
                Thread.sleep(500); // Adjust sleep time to control scrolling speed
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        String Page6 = driver.getPageSource();
        System.out.println(" The page Source HTML is: -------->/n"+Page6);

        driver.navigate().to("https://www.bakersfieldcity.us/613/24th-Street-Improvements");
        JavascriptExecutor js23 = (JavascriptExecutor) driver;
        for (int i = 0; i < 10; i++) {
            js23.executeScript("window.scrollBy(0, 500)");
            try {
                Thread.sleep(500); // Adjust sleep time to control scrolling speed
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        WebElement content22 = driver.findElement(By.tagName("body"));
        System.out.println("PAGE CONTENT OF Under Construction projects : --> /n"+content22.getText() );
        driver.navigate().back();

        driver.navigate().to("https://www.bakersfieldcity.us/562/Centennial-Corridor");
        JavascriptExecutor js24 = (JavascriptExecutor) driver;
        for (int i = 0; i < 10; i++) {
            js24.executeScript("window.scrollBy(0, 500)");
            try {
                Thread.sleep(500); // Adjust sleep time to control scrolling speed
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        WebElement content23 = driver.findElement(By.tagName("body"));
        System.out.println("PAGE CONTENT OF Under Construction projects : --> /n"+content23.getText() );
        driver.navigate().back();

        // Link 8: palm springs ---------------------------------------------------------------------------------------------------
        driver.get(PalmSprings_city_url);
        JavascriptExecutor js25 = (JavascriptExecutor) driver;
        for (int i = 0; i < 10; i++) {
            js25.executeScript("window.scrollBy(0, 500)");
            try {
                Thread.sleep(500); // Adjust sleep time to control scrolling speed
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        String Page7 = driver.getPageSource();
        System.out.println(" The page Source HTML is: -------->/n"+Page7);

        driver.navigate().to("https://www.palmspringsca.gov/government/departments/planning/for-homeowners-and-residents");
        JavascriptExecutor js26 = (JavascriptExecutor) driver;
        for (int i = 0; i < 10; i++) {
            js26.executeScript("window.scrollBy(0, 500)");
            try {
                Thread.sleep(500); // Adjust sleep time to control scrolling speed
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        WebElement content24 = driver.findElement(By.tagName("body"));
        System.out.println("PAGE CONTENT OF Under Construction projects : --> /n"+content24.getText() );
        driver.navigate().back();

        driver.navigate().to("https://www.bakersfieldcity.us/562/Centennial-Corridor");
        JavascriptExecutor js27 = (JavascriptExecutor) driver;
        for (int i = 0; i < 10; i++) {
            js27.executeScript("window.scrollBy(0, 500)");
            try {
                Thread.sleep(500); // Adjust sleep time to control scrolling speed
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        WebElement content25 = driver.findElement(By.tagName("body"));
        System.out.println("PAGE CONTENT OF Under Construction projects : --> /n"+content25.getText() );
        driver.navigate().back();

        // Link 9: eureka --------------------------------------------------------------------------------------------------
        driver.get(eureka_city_url);
        String Page8 = driver.getPageSource();
        System.out.println(" The page Source HTML is: -------->/n"+Page8);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        for (int i = 0; i < 10; i++) {
            js.executeScript("window.scrollBy(0, 500)");
            try {
                Thread.sleep(500); // Adjust sleep time to control scrolling speed
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        WebElement content26 = driver.findElement(By.tagName("body"));
        System.out.println("PAGE CONTENT OF Under Construction projects : --> /n"+content26.getText() );

        //Link 10 :Riverside ----------------------------------------------------------------------------------------------
        driver.get(Riverside_city_url);
        String Page9 = driver.getPageSource();
        System.out.println(" The page Source HTML is: -------->/n"+Page9);
        JavascriptExecutor jss = (JavascriptExecutor) driver;
        for (int i = 0; i < 10; i++) {
            jss.executeScript("window.scrollBy(0, 500)");
            try {
                Thread.sleep(500); // Adjust sleep time to control scrolling speed
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        WebElement content27 = driver.findElement(By.tagName("body"));
        System.out.println("PAGE CONTENT OF Under Construction projects : --> /n"+content27.getText() );
        driver.quit();


    }
}


