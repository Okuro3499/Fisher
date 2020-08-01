package com.jade.fisher;

import androidx.test.ext.junit.runners.AndroidJUnit4;
import androidx.test.filters.LargeTest;
import androidx.test.rule.ActivityTestRule;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.action.ViewActions.closeSoftKeyboard;
import static androidx.test.espresso.action.ViewActions.typeText;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;

@RunWith(AndroidJUnit4.class)
@LargeTest
public class ProductsActivityInstrumentationTest {
    @Rule
    public ActivityTestRule<ProductsActivity> activityTestRule =
            new ActivityTestRule<>(ProductsActivity.class);

    @Test
    public void validateEditText() {
        onView(withId(R.id.searchEditText)).perform(typeText("Coy Fish"))
                .check(matches(withText("Coy Fish")));
    }

    @Test
    public void searchIsPassedToProductsActivity() {
        String search = "Coy Fish";
        onView(withId(R.id.searchEditText)).perform(typeText(search)).perform(closeSoftKeyboard());
        try {
            Thread.sleep(250);
        } catch (InterruptedException e) {
            System.out.println("got interrupted!");
        }
        onView(withId(R.id.searchButton)).perform(click());
        onView(withId(R.id.searchTextView)).check(matches
                (withText("Products found: " + search)));
    }
}
