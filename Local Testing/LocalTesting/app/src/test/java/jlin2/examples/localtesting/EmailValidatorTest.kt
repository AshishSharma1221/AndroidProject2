package jlin2.examples.localtesting

import org.junit.Assert.assertFalse
import org.junit.Assert.assertTrue
import org.junit.Test

class EmailValidatorTest {

    @Test
    fun testValidEmail() {
        assertTrue(EmailValidator.isValidEmail("123@abc.com"))
    }

    @Test
    fun testInvalidEmail() {
        assertFalse(EmailValidator.isValidEmail("123@abc"))
        assertFalse(EmailValidator.isValidEmail("testing123"))
        assertFalse(EmailValidator.isValidEmail(""))
    }
}
