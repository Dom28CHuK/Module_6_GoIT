package classes;

public class TargetFinder {
    public int[] findTarget(int[] aiCoords, int[][] targets) {
        int minDistance = Integer.MAX_VALUE;
        int[] closestTarget = targets[0];

        for (int[] target : targets) {
            int distance = calculateDistance(aiCoords, target);
            if (distance < minDistance) {
                minDistance = distance;
                closestTarget = target;
            }
        }
        return closestTarget;
    }

    private int calculateDistance(int[] point1, int[] point2) {
        int xDiff = point1[0] - point2[0];
        int yDiff = point1[1] - point2[1];
        return (int) Math.sqrt(xDiff * xDiff + yDiff * yDiff);
    }
}
