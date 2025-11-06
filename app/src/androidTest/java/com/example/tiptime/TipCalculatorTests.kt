package com.example.tiptime

import org.junit.Assert.assertEquals
import org.junit.Test
import java.text.NumberFormat

class TipCalculatorTests {

    @Test
    fun calculateTip_20PercentNoRoundup() {
        val amount = 10.00
        val tipPercent = 20.00
        val expectedTip = NumberFormat.getCurrencyInstance().format(2)
        val actualTip = calculateTip(amount = amount, tipPercent = tipPercent, false)
        assertEquals(expectedTip, actualTip)
    }

    @Test
    fun calculateTip_15PercentNoRoundup() {
        val amount = 10.00
        val tipPercent = 15.00
        val expectedTip = NumberFormat.getCurrencyInstance().format(1.5)
        val actualTip = calculateTip(amount = amount, tipPercent = tipPercent, false)
        assertEquals(expectedTip, actualTip)
    }

    @Test
    fun calculateTip_50PercentNoRoundup() {
        val amount = 10.00
        val tipPercent = 50.00
        val expectedTip = NumberFormat.getCurrencyInstance().format(5)
        val actualTip = calculateTip(amount = amount, tipPercent = tipPercent, false)
        assertEquals(expectedTip, actualTip)
    }

    @Test
    fun calculateTip_100PercentNoRoundup() {
        val amount = 10.00
        val tipPercent = 100.00
        val expectedTip = NumberFormat.getCurrencyInstance().format(10)
        val actualTip = calculateTip(amount = amount, tipPercent = tipPercent, false)
        assertEquals(expectedTip, actualTip)
    }
}