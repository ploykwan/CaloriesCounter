package com.example.kwankaew.caloriescounter

import org.junit.Assert
import org.junit.Test

class CalculateBMITest {
    @Test
    fun calculateBMI(){
        val cal = UserInfo()
        cal.calculate("163","72","true","20",1.0)
        Assert.assertEquals("27.43", cal.bmi)
    }
}
