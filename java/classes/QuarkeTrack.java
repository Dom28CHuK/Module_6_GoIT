package classes;

import java.util.Arrays;

public class QuarkeTrack {
    private int[] lines;

    public QuarkeTrack(int[] lines) {
        this.lines = lines;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        QuarkeTrack that = (QuarkeTrack) o;
        return Arrays.equals(lines, that.lines);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(lines);
    }
}
