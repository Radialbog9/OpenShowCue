package uk.radialbog9.openshowcue.audio;

import uk.radialbog9.openshowcue.audio.genericplayer.AudioPlayer;

import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class AudioHandler {
    public static AudioHandler instance;

    private Map<UUID, File> fileMap = new HashMap<>();

    public AudioHandler() {
        instance = this;
    }

    public void play(AudioFileRef ref) {
        if(!fileMap.containsKey(ref.getUuid())) {
            fileMap.put(ref.getUuid(), ref.getFile());
        }
        AudioPlayer.loadStream(ref.getUuid().toString(), ref.getFile().getAbsolutePath());
        AudioPlayer.play(ref.getUuid().toString(), false);
    }

    public void stop(AudioFileRef ref) {
        AudioPlayer.stop(ref.getUuid().toString());
    }
}
