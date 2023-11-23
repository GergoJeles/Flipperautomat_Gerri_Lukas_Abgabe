package ASCII_factories;

public class ASCII_ball_1 implements ASCII_main{
    private static ASCII_ball_1 instance;

    private ASCII_ball_1() {}

    public static ASCII_ball_1 getInstance() {
        if (instance == null) {
            instance = new ASCII_ball_1();
        }
        return instance;
    }

    @Override
    public String createASCIIArt(String text) { return
        "  ____          _      _        __ \n" +
                   " |  _ \\   /\\   | |    | |      /_ |\n" +
                   " | |_) | /  \\  | |    | |       | |\n" +
                   " |  _ < / /\\ \\ | |    | |       | |\n" +
                   " | |_) / ____ \\| |____| |____   | |\n" +
                   " |____/_/    \\_\\______|______|  |_|\n" +
                   "                                   \n" +
                   "                                   ";
    }
}
