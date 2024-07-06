package pageObjects;

import MobileActions.GenericMethods.GenericMethods;

import static org.testng.Assert.assertEquals;

public class googleHelper extends googleElements {

    public static void fillSearch() {
        GenericMethods.click(searchBtn);
        GenericMethods.type(searchBtn, searchTxt);
    }

    public static void clickOnSearch() {
        GenericMethods.submit(searchBtn);
    }

    public static void clickOnNextPage() throws InterruptedException {
        int x=0;
        Thread.sleep(2000);
        GenericMethods.click(linkBtn);
        x++;
        Thread.sleep(2000);
        GenericMethods.click(linkBtn);
        x++;

        System.out.println("The page Number: " + x);
    }

    public static void validateOnHorsePower() {
        System.out.println(GenericMethods.getElementText(HPTxtLink));
        assertEquals(GenericMethods.getElementText(HPTxtLink), hpText);

    }
}
