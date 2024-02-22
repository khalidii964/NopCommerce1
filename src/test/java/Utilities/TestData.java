package Utilities;

import org.testng.annotations.DataProvider;

public class TestData {

    @DataProvider(name = "loginValidEmailInvalidPassData")
    public Object[][] loginNegative() {
        Object[][] testDate = {
                {"t.one@techno.com", "111111"},
        };
        return testDate;
    }
    @DataProvider(name = "loginInvalidEmailValidPass")
    public Object[][] loginNegative2() {
        Object[][] testDate = {
                {"xxxxxx@gmail.com", "Qwerty12"},
        };
        return testDate;
    }

    @DataProvider(name = "loginValidEmailEmptyPass")
    public Object[][] loginNegative3() {
        Object[][] testDate = {
                {"t.one@techno.com", " "},
        };
        return testDate;
    }
    @DataProvider(name = "loginEmptyEmailValidPass")
    public Object[][] loginNegative4() {
        Object[][] testDate = {
                {" ", "Qwerty12"},
        };
        return testDate;
    }
}