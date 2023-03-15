package uk.radialbog9.openshowcue.audio;

import uk.radialbog9.openshowcue.audio.genericplayer.AudioPlayer;

import java.io.File;

public class AudioHandler {
    public static AudioHandler instance;

    public void playFile(File file) {
        AudioPlayer.loadStream(file.getName(), file.getAbsolutePath());
        AudioPlayer.play(file.getName(), false);
    }
}
