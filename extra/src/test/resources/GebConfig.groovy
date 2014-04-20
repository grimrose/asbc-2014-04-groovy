import org.openqa.selenium.chrome.ChromeDriver
import org.openqa.selenium.firefox.FirefoxDriver

import java.nio.file.Paths

waiting {
    timeout = 2
}

environments {
    chrome {
        driver = {
            def driverFileName = 'chromedriver'
            // windowsの場合
//            driverFileName = 'chromedriver.exe'

            def driversDir = Paths.get(System.properties['user.dir'].toString(), 'drivers')
            def driverPath = driversDir.resolve(driverFileName)
            System.setProperty('webdriver.chrome.driver', "${driverPath.toAbsolutePath()}")
            new ChromeDriver()
        }
    }
    firefox {
        driver = {
            new FirefoxDriver()
        }
    }
}
