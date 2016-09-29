package colors;

public class ColorFactory {

    public static IColor create(int time) {
        int mod = time % 5;
        if (mod == 3) {
            return new GreenColor();
        } else if (mod == 4) {
            return new YellowColor();
        } else if (mod == 0) {
            return new RedColor();
        } else {
            throw new IllegalArgumentException("Time color not supported!");
        }
    }
}
