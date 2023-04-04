package classes;

import java.util.Arrays;
import java.util.Objects;

public class QuarkeTrack {
    private int[] lines;

    public QuarkeTrack(int[] lines) {
        this.lines = lines;
    }

    public int getTotalDistance() {
        int sum = 0;
        for (int line : lines) {
            sum += line;
        }
        return sum;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        QuarkeTrack that = (QuarkeTrack) obj;
        return getTotalDistance() == that.getTotalDistance();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getTotalDistance());
    }
}
