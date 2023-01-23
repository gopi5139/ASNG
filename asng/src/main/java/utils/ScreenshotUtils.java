package utils;

import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import framework.WebDriverHelper;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Scenario;
import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;

public class ScreenshotUtils {
	
	@AfterStep
    public static void as(Scenario scenario) throws IOException, InterruptedException
    {
		ConfigFileReaderUtils cfr = new ConfigFileReaderUtils();
		String flag = cfr.getScreenshotFlag();
		if(null != flag && !flag.isEmpty()) {
			if (Boolean.valueOf(flag)) {
				scenario.attach(getByteScreenshot(), "image/png", "");
				//scenario.attach(takeFullPageScreenShotAsByte(), "image/png", "");
			} else {
				if(scenario.isFailed()){
					scenario.attach(getByteScreenshot(), "image/png", "");
					//scenario.attach(takeFullPageScreenShotAsByte(), "image/png", "");
		    		WebDriverHelper.getDriver().close();
		    	}
			}
		}    	
    }
    public static byte[] getByteScreenshot() throws IOException 
    {
    	File sourcePath = ((TakesScreenshot) WebDriverHelper.getDriver()).getScreenshotAs(OutputType.FILE);
		byte[] fileContent = FileUtils.readFileToByteArray(sourcePath);
		return fileContent;
    }
    private static byte[] takeFullPageScreenShotAsByte() throws IOException {
        Screenshot fpScreenshot = new AShot().shootingStrategy(ShootingStrategies.viewportPasting(1000)).takeScreenshot(WebDriverHelper.getDriver());

        BufferedImage originalImage = fpScreenshot.getImage();

        try (ByteArrayOutputStream baos = new ByteArrayOutputStream()) {
            ImageIO.write(originalImage, "png", baos);
            baos.flush();
            return baos.toByteArray();
        }
    }
}
