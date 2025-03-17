package com.pass.gen.task;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OtpTest {

    @Test
    void getOtp() {
        assertEquals(5, new Otp().getOtp(5).length());
    }
}