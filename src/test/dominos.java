package test;

import methods.methods;
import org.openqa.selenium.By;

public class dominos {

    methods method = new methods();
    By fieldToType =  By.name("q");
    By domino = By.partialLinkText("/site/dominos.com");
    By coupon = By.partialLinkText("/code/out/1599680?d=dominos.com");
    By copy = By.id("copy-button");


    public void test() {
        method.open("https://couponfollow.com/");
        method.type(fieldToType, "Dominos");
        method.click(domino);
        method.click(coupon);
        method.click(copy);
    }


}
