package uk.radialbog9.openshowcue.cue.types;

import uk.radialbog9.openshowcue.audio.AudioFileRef;
import uk.radialbog9.openshowcue.audio.AudioHandler;
import uk.radialbog9.openshowcue.cue.Cue;

import java.io.File;

public class SoundCue implements Cue {

    private AudioFileRef audioFileRef;

    public SoundCue(File file) {
        if(file.exists())
            this.audioFileRef = new AudioFileRef(file);
        else
            throw new IllegalArgumentException("File does not exist");
    }

    @Override
    public void go() {
        AudioHandler.instance.play(audioFileRef);
    }

    @Override
    public void pause() {
        AudioHandler.instance.stop(audioFileRef);
    }

    @Override
    public void resume() {
        AudioHandler.instance.play(audioFileRef);

    }

    @Override
    public void stop() {
        AudioHandler.instance.stop(audioFileRef);

    }

    @Override
    public void next() {
        AudioHandler.instance.stop(audioFileRef);
    }
}
