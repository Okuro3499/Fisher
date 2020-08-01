package com.jade.fisher;

import androidx.test.ext.junit.runners.AndroidJUnit4;
import androidx.test.filters.LargeTest;
import androidx.test.rule.ActivityTestRule;

import org.junit.Rule;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
@LargeTest
public class ProductsActivityInstrumentationTest {
    @Rule
    public ActivityTestRule<ProductsActivity> activityTestRule =
            new ActivityTestRule<>(ProductsActivity.class);
}
