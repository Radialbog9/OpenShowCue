package uk.radialbog9.openshowcue.audio.genericplayer;

abstract class PlayThread extends Thread {
    public abstract void setLooping(boolean loop);

    public abstract void playSound();

    public abstract void stopSound();
}
