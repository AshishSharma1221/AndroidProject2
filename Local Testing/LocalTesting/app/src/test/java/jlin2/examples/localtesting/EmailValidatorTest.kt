package jlin2.examples.localtesting

import org.junit.Assert.assertFalse
import org.junit.Assert.assertTrue
import org.junit.Test

class EmailValidatorTest {

    @Test
    fun testValidEmail() {
        assertTrue(EmailValidator.isValidEmail("123@abc.com"))
	assertTrue(EmailValidator.isValidEmail("123@abc.co.ca"))
    }

    @Test
    fun testInvalidEmail() {
        assertFalse(EmailValidator.isValidEmail("123@abc"))
 	assertFalse(EmailValidator.isValidEmail("123@abc..com"))
        assertFalse(EmailValidator.isValidEmail("testing123"))
        assertFalse(EmailValidator.isValidEmail(""))
    }
}
