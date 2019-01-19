package ru.codeking.beatbox;

import android.support.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static org.hamcrest.CoreMatchers.anything;

@RunWith(AndroidJUnit4.class)
public class BeatBoxActivityTest {
    @Rule
    public ActivityTestRule<BeatBoxActivity> mActivityRule = new ActivityTestRule<>(BeatBoxActivity.class);

    @Test
    public void showsFirstFileName(){
        onView(withTest("65_cjipie")).check(matches(anything()));
    }

}
