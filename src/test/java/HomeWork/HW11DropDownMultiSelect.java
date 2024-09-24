package HomeWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class HW11DropDownMultiSelect {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://syntaxprojects.com/basic-select-dropdown-demo-homework.php");

        WebElement fruits = driver.findElement(By.xpath("//select[@id='fav_fruit_selector']"));
        fruits.click();
        Select select = new Select(fruits);
        select.selectByVisibleText("Pear");

        List<WebElement> fruitOptions = select.getOptions();
        for (int i = 1; i < fruitOptions.size(); i++) {
            System.out.println(fruitOptions.get(i).getText());
        }
        System.out.println();

        WebElement dropdown = driver.findElement(By.xpath("//select[@name='States']"));
        Select selectDD = new Select(dropdown);
        if(selectDD.isMultiple()){
            System.out.println("The dropdown is multi-select");
        }

        selectDD.selectByIndex(1);
        selectDD.selectByValue("Cooking");
        selectDD.selectByVisibleText("Gardening");

        WebElement getAllBtn = driver.findElement(By.xpath("//button[@id='get_all']"));
        getAllBtn.click();

        List<WebElement> selectedOptions = selectDD.getAllSelectedOptions();
        for (WebElement opt : selectedOptions) {
            System.out.println(opt.getText());
        }
        System.out.println();
        Thread.sleep(500);
        selectDD.deselectByValue("Traveling");

        getAllBtn.click();
        List<WebElement> selectedOptions2 = selectDD.getAllSelectedOptions();
        for (WebElement opt2 : selectedOptions2) {
            System.out.println(opt2.getText());
        }
    }
}
