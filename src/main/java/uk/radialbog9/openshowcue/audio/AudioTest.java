package uk.radialbog9.openshowcue.audio;

import java.io.File;

public class AudioTest {
    public static void main(String[] args) {
        AudioHandler.instance = new AudioHandler();
        AudioHandler.instance.playFile(new File("C:\\Users\\joe\\Downloads\\Fubu, Tom Ferry - Lies (feat. Mila Falls).wav"));
    }
}
