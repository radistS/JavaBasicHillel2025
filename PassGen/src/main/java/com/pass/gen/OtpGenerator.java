package com.pass.gen;

import org.apache.commons.lang3.RandomStringUtils;

public class OtpGenerator {
    public String generateOtpCode(int digitNumber){
        return RandomStringUtils.randomNumeric(digitNumber);
    }
}
