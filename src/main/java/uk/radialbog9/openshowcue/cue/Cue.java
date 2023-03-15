package uk.radialbog9.openshowcue.cue;

import uk.radialbog9.openshowcue.StartType;

import java.util.ArrayList;
import java.util.List;

public interface Cue {
    boolean enabled = false;
    StartType startType = StartType.MANUAL;
    List<Cue> subCues = new ArrayList<>();
    void go();
    void pause();
    void resume();
    void stop();
    void next();
}
