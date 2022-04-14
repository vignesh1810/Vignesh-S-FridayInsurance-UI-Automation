package reports;

import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.markuputils.Markup;
import enums.ConfigProperties;
import utils.ReadPropertyFile;
import utils.ScreenshotUtils;

public final class ExtentLogger {

    private ExtentLogger() {
    }

    public static void pass(String message) {
        ExtentManager.getExtentTest().pass(message);
    }

    public static void fail(String message) {
        try {
            ExtentManager.getExtentTest().fail(message, MediaEntityBuilder.createScreenCaptureFromBase64String(ScreenshotUtils.getBase64Image()).build());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void skip(String message) {
        ExtentManager.getExtentTest().skip(message);
    }

    public static void pass(Markup message) {
        ExtentManager.getExtentTest().pass(message);
    }

    public static void fail(Markup message) {
        ExtentManager.getExtentTest().fail(message);
    }

    public static void skip(Markup message) {
        ExtentManager.getExtentTest().skip(message);
    }


}
