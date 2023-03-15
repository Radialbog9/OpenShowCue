package uk.radialbog9.openshowcue.audio.genericplayer;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.DataLine;

class AudioData {
    public AudioInputStream audioInputStream = null;
    public DataLine dataLine = null;
    public PlayThread thread = null;
}
