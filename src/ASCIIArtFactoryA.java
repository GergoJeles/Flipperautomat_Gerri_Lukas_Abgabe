public class ASCIIArtFactoryA implements ASCIIArtFactory {
    private static ASCIIArtFactoryA instance;

    private ASCIIArtFactoryA() {}

    public static ASCIIArtFactoryA getInstance() {
        if (instance == null) {
            instance = new ASCIIArtFactoryA();
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
