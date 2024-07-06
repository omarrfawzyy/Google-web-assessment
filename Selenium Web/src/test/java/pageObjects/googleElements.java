package pageObjects;

import org.openqa.selenium.By;

public class googleElements {

    public static String searchTxt = "Mercedes A Class";
    public static String hpText = "The A-Class engine range kicks off with the A180. This engine, a turbocharged 1.3-litre petrol with 136hp, is plenty for a car of this size.";
    static By searchBtn =  By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/textarea");
    static By searchIcon =  By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[2]/div[4]/div[2]/div[1]/div/ul/li[1]/div/div[1]");
    static By linkBtn =  By.xpath("/html/body/div[4]/div/div[13]/div/div[4]/div/div[3]/table/tbody/tr/td[12]/a/span[2]/span");
    static By scrollView =  By.xpath("/html/body/div[2]/div/div");
    static By HPTxtLink =  By.xpath("/html/body/div[4]/div/div[13]/div/div[2]/div[2]/div/div/div[6]/div/div/div[3]/div/span");


}
