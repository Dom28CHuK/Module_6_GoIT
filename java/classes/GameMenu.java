package classes;

import java.awt.*;

public class GameMenu {

    public void act(MenuItem item) {
        System.out.println(item.getAction());
    }

    public static abstract class MenuItem {
        abstract String getAction();
    }

    public static class Options extends MenuItem {
        @Override
        String getAction() {
            return "options";
        }
    }

    public static class Start extends MenuItem {
        @Override
        String getAction() {
            return "start";
        }
    }

    public static class Exit extends MenuItem {
        @Override
        String getAction() {
            return "exit";
        }
    }
}

