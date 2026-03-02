package com.automationhub.testNG.concepts;


import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class OptionalExample {

    @Test
    @Parameters({"city", "zipCode"})
    public void optionalTest(
            @Optional("UnknownCity") String city,
            @Optional("00000") String zipCode) {

        System.out.println("City: " + city);
        System.out.println("Zip Code: " + zipCode);
    }
}
