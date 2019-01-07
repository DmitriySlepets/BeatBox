package ru.codeking.beatbox.viewmodel;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

import ru.codeking.beatbox.model.BeatBox;
import ru.codeking.beatbox.model.Sound;

public class SoundViewModel extends BaseObservable {
    private Sound mSound;
    private BeatBox mBeatBox;

    public SoundViewModel(BeatBox beatBox) {
        mBeatBox = beatBox;
    }

    public Sound getSound() {
        return mSound;
    }

    @Bindable
    public String getTitle(){
        return mSound.getName();
    }

    public void setSound(Sound sound) {
        mSound = sound;
        notifyChange();
    }
}
