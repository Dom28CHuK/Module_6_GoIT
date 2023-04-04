import classes.Level;

public class Main {
    public static void main(String[] args) {
//        //Quarke level, name is Test
//        System.out.println(new Level("Test"));

//        Level.Point p1 = new Level.Point(3, 5);
//        Level.Point p2 = new Level.Point(10, 100);
//        Level.Point p3 = new Level.Point(50, 40);
//
//        Level.Point[] points = {p1, p2, p3};
//
//        //Quarke level, name is Test, point count is 3
//        System.out.println(new Level("Test", points));

//        Level.Point p1 = new Level.Point(3, 5);
//        Level.Point p2 = new Level.Point(10, 100);
//        Level.Point p3 = new Level.Point(50, 40);
//
//        Level.Point[] points = {p1, p2, p3};
//
//        Level.LevelInfo info = new Level.LevelInfo("Quarke Intro", "Easy");
//
//        //Quarke level, name is Quarke Intro, difficulty is Easy, point count is 3
//        System.out.println(new Level(info, points));

        Level.Point p1 = new Level.Point(3, 5);
        Level.Point p2 = new Level.Point(10, 100);
        Level.Point p3 = new Level.Point(50, 40);

        Level.Point[] points = {p1, p2, p3};

        Level.LevelInfo info = new Level.LevelInfo("Quarke Intro", "Easy");

        //3015
        System.out.println(new Level(info, points).calculateLevelHash());
    }
}
