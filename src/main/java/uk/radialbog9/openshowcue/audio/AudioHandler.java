package uk.radialbog9.openshowcue.audio;

import uk.radialbog9.openshowcue.audio.genericplayer.AudioPlayer;

import java.io.File;

public class AudioHandler {
    public AudioHandler() {
    }
    public void playFile(File file) {
        AudioPlayer.loadStream("test", file.getAbsolutePath());
        AudioPlayer.play("test", false);
    }
}
