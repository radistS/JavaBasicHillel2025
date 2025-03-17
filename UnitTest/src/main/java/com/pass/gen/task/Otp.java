package com.pass.gen.task;

import com.pass.gen.OtpGenerator;

public class Otp {

    public String getOtp(int size){
        return new OtpGenerator().generateOtpCode(size);
    }
}
