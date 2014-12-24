package com.pdt.daggerexample;

import android.support.test.espresso.matcher.ViewMatchers;
import android.test.ActivityInstrumentationTestCase2;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

public class SampleEspressoTest extends ActivityInstrumentationTestCase2<MainActivity> {

    public SampleEspressoTest() {
        super(MainActivity.class);
    }

    @Override
    public void setUp() throws Exception {
        super.setUp();
        // Espresso will not launch our activity for us, we must launch it via getActivity().
        getActivity();
    }

    public void testCheckText() {
        onView(ViewMatchers.withId(com.pdt.daggerexample.R.id.espresso_test))
                .check(matches(withText("Espresso Test")));
    }
}
