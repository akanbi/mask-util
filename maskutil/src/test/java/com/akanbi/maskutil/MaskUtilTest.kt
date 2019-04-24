package com.akanbi.maskutil

import org.junit.Assert.assertEquals
import org.junit.Test

class MaskUtilTest {

    @Test
    fun `should mask content with format CNPJ`() {
        val result = MaskUtil.maskContent(MaskTypes.CNPJ, "12345678901234")

        assertEquals("12.345.678/9012-34", result)
    }

    @Test
    fun `should mask content with format CPF`() {
        val result = MaskUtil.maskContent(MaskTypes.CPF, "12345678901")

        assertEquals("123.456.789-01", result)
    }

    @Test
    fun `should maks content with uppercase text`() {
        val result = MaskUtil.maskContent(MaskTypes.UPPERCASE, "Hello World !!")

        assertEquals("HELLO WORLD !!", result)
    }

    @Test
    fun `should maks content with lowercase text`() {
        val result = MaskUtil.maskContent(MaskTypes.LOWERCASE, "Hello World !!")

        assertEquals("hello world !!", result)
    }

    @Test
    fun `should unmask content with signals`() {
        val result = MaskUtil.unmask("123.456-7/90(12) 012 ")

        assertEquals("12345679012012", result)
    }

    @Test
    fun `should mask content with phone with ten digits`() {
        val result = MaskUtil.maskContent(MaskTypes.PHONE_TEN_DIGITS, "5191230978")

        assertEquals("(51) 9123-0978", result)
    }

    @Test
    fun `should mask content with phone with eleven digits`() {
        val result = MaskUtil.maskContent(MaskTypes.PHONE_ELEVEN_DIGITS, "51987650102")

        assertEquals("(51) 98765-0102", result)
    }

}