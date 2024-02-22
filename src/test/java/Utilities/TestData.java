package Utilities;

import org.testng.annotations.DataProvider;

public class TestData {

    @DataProvider(name = "loginPositiveData")
    public Object[][] loginTestData() {
        Object[][] testDate = {
                {"", ""},
                {"Admin", "Admin123"},
        };
        return testDate;
    }
    @DataProvider(name = "loginPositiveDataCorrect")
    public Object[][] loginCorrect() {
        Object[][] testDate = {
                {"Admin", "Admin123"},
        };
        return testDate;
    }

    @DataProvider(name = "loginValidEmailInvPass")
    public Object[][] loginValidEmailInvPass() {
        Object[][] testDate = {
                {"t.one@techno.com", "11111"},
        };
        return testDate;
    }

    @DataProvider(name = "loginInvalidEmailValidPass")
    public Object[][] loginınValidEmailValidPass() {
        Object[][] testDate = {
                {"xxxd@gmail.com", "Qwerty12"},
        };
        return testDate;
    }

    @DataProvider(name = "loginValidEmailEmptyPass")
    public Object[][] loginınValidEmailEmptyPass() {
        Object[][] testDate = {
                {"xxxd@gmail.com", " "},
        };
        return testDate;
    }


    @DataProvider(name = "loginEmptyEmailValidPass")
    public Object[][] loginınEmptyEmailValidPass() {
        Object[][] testDate = {
                {" ", "Qwerty12"},
        };
        return testDate;
    }


    @DataProvider(name = "loginValidEmailValidPass")
    public Object[][] loginValidEmailValidPass() {
        Object[][] testDate = {
                {"t.one@techno.com", "Qwerty12"},
        };
        return testDate;
    }



}