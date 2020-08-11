package com.jade.fisher;

import android.content.Intent;
import android.widget.TextView;

import com.jade.fisher.ui.FishActivity;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.shadows.ShadowActivity;

import static org.junit.Assert.assertTrue;

@RunWith(RobolectricTestRunner.class)

public class ProductsActivityTest {
    private FishActivity activity;

    @Before
    public void setUp() {
        activity = Robolectric.setupActivity(FishActivity.class);
    }

    @Test
    public void validateTextViewContent() {
        TextView searchTextView = activity.findViewById(R.id.searchTextView);
        assertTrue("search".equals(searchTextView.getText().toString()));
    }

    @Test
    public void secondActivityStarted() {
        activity.findViewById(R.id.searchButton).performClick();
        Intent expectedIntent = new Intent(activity, FishActivity.class);
        ShadowActivity shadowActivity = org.robolectric.Shadows.shadowOf(activity);
        Intent actualIntent = shadowActivity.getNextStartedActivity();
        assertTrue(actualIntent.filterEquals(expectedIntent));
    }
}