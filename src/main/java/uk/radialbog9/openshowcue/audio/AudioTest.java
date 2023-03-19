package uk.radialbog9.openshowcue.audio;

import java.io.File;

public class AudioTest {
    public static void main(String[] args) {
        AudioHandler.instance = new AudioHandler();
        AudioFileRef ref = new AudioFileRef(new File("C:\\Users\\joe\\Downloads\\Fubu, Tom Ferry - Lies (feat. Mila Falls).wav"));
        AudioHandler.instance.play(ref);
    }
}
