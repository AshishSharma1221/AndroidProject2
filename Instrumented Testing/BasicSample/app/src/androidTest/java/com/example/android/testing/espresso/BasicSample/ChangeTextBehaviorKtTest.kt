package com.example.android.testing.espresso.BasicSample

import androidx.test.ext.junit.rules.activityScenarioRule
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions
import androidx.test.espresso.action.ViewActions.*
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.espresso.matcher.ViewMatchers.withText
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.filters.LargeTest
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
@LargeTest
class ChangeTextBehaviorKtTest {

    @get:Rule var activityScenarioRule = activityScenarioRule<MainActivity>()

    @Test
    fun changeText_sameActivity() {
        onView(withId(R.id.editTextUserInput))
            .perform(typeText("123"), closeSoftKeyboard())
        onView(withId(R.id.changeTextBt)).perform(click())
        onView(withId(R.id.textToBeChanged)).check(matches(withText("123")))
    }

    @Test
    fun changeText_abcdef_sameActivity() {
        onView(withId(R.id.editTextUserInput))
            .perform(typeText("abcdef"), closeSoftKeyboard())
        onView(withId(R.id.changeTextBt)).perform(click())
        onView(withId(R.id.textToBeChanged)).check(matches(withText("abcdef")))
    }

    @Test
    fun changeText_abcdef_newActivity() {
        onView(withId(R.id.editTextUserInput))
            .perform(typeText("abcdef"), closeSoftKeyboard())
        onView(withId(R.id.activityChangeTextBtn)).perform(click())
        onView(withId(R.id.show_text_view)).check(matches(withText("abcdef")))
    }
}