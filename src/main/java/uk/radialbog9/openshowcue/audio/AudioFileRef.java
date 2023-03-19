package uk.radialbog9.openshowcue.audio;

import lombok.Getter;

import java.io.File;
import java.util.UUID;

public class AudioFileRef {
    @Getter
    private final UUID uuid;
    @Getter
    private final File file;

    public AudioFileRef(File file) {
        this.uuid = UUID.randomUUID();
        this.file = file;
    }
}
