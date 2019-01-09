package ru.codeking.beatbox.viewmodel;

import org.junit.Before;
import org.junit.Test;

import ru.codeking.beatbox.model.BeatBox;
import ru.codeking.beatbox.model.Sound;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.mockito.Mockito.mock;

public class SoundViewModelTest {
    private BeatBox mBeatBox;
    private Sound mSound;
    private SoundViewModel mSubject;

    @Before
    public void setUp() throws Exception {
        mBeatBox = mock(BeatBox.class);
        mSound = new Sound("assetPath");
        mSubject = new SoundViewModel(mBeatBox);
        mSubject.setSound(mSound);
    }

    @Test
    public void exprosesSoundNameAsTitle(){
        assertThat(mSubject.getTitle(), is(mSound.getName()));
    }
}