import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class automationnegative {

    public static void main(String[] args) throws MalformedURLException {

        DesiredCapabilities dc = new DesiredCapabilities();

        dc.setCapability(MobileCapabilityType.DEVICE_NAME,"J6AXGF04M771ZAB");
        dc.setCapability("platformName", "Android");
        dc.setCapability("appPackage", "com.loginmodule.learning");
        dc.setCapability("appActivity", ".activities.LoginActivity");

        AndroidDriver<AndroidElement> ad = new AndroidDriver<AndroidElement>(new URL("http://127.0.0.1:4723/wd/hub"),dc);

        ad.navigate().back();
        MobileElement el11 = (MobileElement) ad.findElementById("com.loginmodule.learning:id/textViewLinkRegister");
        el11.click();
        ad.navigate().back();
        MobileElement el2 = (MobileElement) ad.findElementById("com.loginmodule.learning:id/textInputEditTextName");
        el2.sendKeys("FransDedy");
        MobileElement el3 = (MobileElement) ad.findElementById("com.loginmodule.learning:id/textInputEditTextEmail");
        el3.sendKeys("frans@gmail.com");
        MobileElement el4 = (MobileElement) ad.findElementById("com.loginmodule.learning:id/textInputEditTextPassword");
        el4.sendKeys("frans@gmail.com");
        MobileElement el5 = (MobileElement) ad.findElementById("com.loginmodule.learning:id/textInputEditTextConfirmPassword");
        el5.sendKeys("fransgmail.com");
        MobileElement el6 = (MobileElement) ad.findElementById("com.loginmodule.learning:id/appCompatButtonRegister");
        el6.click();



        //  Assert.assertEquals(ad.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.support.v7.widget.LinearLayoutCompat/android.widget.TextView[3]")).getText(),"fransdedypasaribu@gmail.com");

    }

}
