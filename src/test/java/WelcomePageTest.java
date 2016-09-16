import org.testng.annotations.Test;

import java.io.IOException;

/**
 * Created by Xangel2008 on 16-Sep-16.
 */
public class WelcomePageTest extends TestBase {
    @Test(dataProvider = "devices")
    public void welcomePage_shouldLookGood_onDevice(TestDevice device) throws IOException {
        load("/");
        checkLayout("/specs/welcomePage.spec", device.getTags());
    }
}
