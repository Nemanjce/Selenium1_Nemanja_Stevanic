
import framework.Helper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new FirefoxDriver();
        WebDriverWait wait = new WebDriverWait(driver, 10);
        Thread.sleep(4000, 1500);

        driver.manage().window().maximize();
        driver.get("http://bvtest.school.cubes.rs/login");

        WebElement emailField = wait.until(ExpectedConditions.elementToBeClickable(By.name("email")));
        emailField.sendKeys("qa@cubes.rs");

        WebElement passField = wait.until(ExpectedConditions.elementToBeClickable(By.name("password")));
        passField.sendKeys("cubesqa");

        WebElement loginButton = wait.until(ExpectedConditions.elementToBeClickable(By.className("btn-primary")));
        loginButton.click();

        WebElement categButton = wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Categories")));
        categButton.click();

        System.out.println("Naslov otvorene web stranice: " + driver.getTitle());

        WebElement addCategButton = wait.until(ExpectedConditions.elementToBeClickable(By.className("pull-right")));
        addCategButton.click();
        WebElement enterCateg = wait.until(ExpectedConditions.elementToBeClickable(By.className("form-control")));
        enterCateg.sendKeys(Helper.getRandomText());
        WebElement saveEnteredCat = wait.until(ExpectedConditions.elementToBeClickable(By.id("save-category-button")));
        saveEnteredCat.click();

        WebElement regionsButton = wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Regions")));
        regionsButton.click();
        System.out.println("Naslov otvorene web stranice: " + driver.getTitle());

        WebElement addRegionButton = wait.until(ExpectedConditions.elementToBeClickable(By.className("pull-right")));
        addRegionButton.click();
        WebElement enterNewReg = wait.until(ExpectedConditions.elementToBeClickable(By.className("input-md")));
        enterNewReg.sendKeys(Helper.getRandomText());
        WebElement saveNewReg = wait.until(ExpectedConditions.elementToBeClickable(By.id("save-region-button")));
        saveNewReg.click();

        WebElement portalsNav = wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Portals")));
        portalsNav.click();
        System.out.println("Naslov otvorene web stranice: " + driver.getTitle());

        WebElement addPortalButton = wait.until(ExpectedConditions.elementToBeClickable(By.className("pull-right")));
        addPortalButton.click();
        WebElement addPortalName = wait.until(ExpectedConditions.elementToBeClickable(By.className("form-control")));
        addPortalName.sendKeys(Helper.getRandomText());

        WebElement addPortalUrl = wait.until(ExpectedConditions.elementToBeClickable(By.id("url")));
        addPortalUrl.sendKeys("http://test.rs");
        WebElement saveNewPortal = wait.until(ExpectedConditions.elementToBeClickable(By.id("save-portal-button")));
        saveNewPortal.click();

        Thread.sleep(6000, 1500);
        driver.quit();
    }

}
