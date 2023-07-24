package pages;

import org.openqa.selenium.By;

public class WomenPage {
    public static By womenMenu = By.id("ui-id-4");
    public static By womenTops = By.id("ui-id-9");
    public static By womenJackets = By.id("ui-id-11");
    public static By messageSuccess = By.cssSelector("[data-ui-id='message-success']");

    public static By oliviaJacket = By.xpath("//img[@alt='Olivia 1/4 Zip Light Jacket']");
    public static By xsMeasure = By.xpath("//div[@class='swatch-opt-1396']//div[@id='option-label-size-143-item-166']");
    public static By blackColor = By.xpath("//div[@class='swatch-opt-1396']//div[@id='option-label-color-93-item-49']");
    public static By addToCartOlivia = By.cssSelector("body > div:nth-child(4) > main:nth-child(4) > div:nth-child(4) > div:nth-child(1) > div:nth-child(4) > ol:nth-child(1) > li:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(4) > div:nth-child(1) > div:nth-child(1) > form:nth-child(1) > button:nth-child(4) > span:nth-child(1)");

    public static By junoJacket = By.xpath("//img[@alt='Juno Jacket']");
    public static By mMeasure = By.xpath("//div[@class='swatch-opt-1380']//div[@id='option-label-size-143-item-168']");
    public static By greenColor = By.xpath("//div[@class='swatch-opt-1380']//div[@id='option-label-color-93-item-53']");
    public static By addToCartJuno = By.cssSelector("body > div:nth-child(4) > main:nth-child(4) > div:nth-child(4) > div:nth-child(1) > div:nth-child(4) > ol:nth-child(1) > li:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(5) > div:nth-child(1) > div:nth-child(1) > form:nth-child(1) > button:nth-child(4) > span:nth-child(1)");

    public static By addToCart = By.xpath("//a[@class='action showcart']");
    public static By viewAndEditCart = By.xpath("//span[normalize-space()='View and Edit Cart']");

    public static By proceedToCheckout = By.cssSelector("button[data-role='proceed-to-checkout']");

    public static By nextBtn = By.xpath("//button[@class='button action continue primary']");

    public static By placeOrderBtn = By.xpath("//span[normalize-space()='Place Order']");
}
