package ASCII_factories;

public class ASCII_ball_3 implements ASCII_main {
    private static volatile ASCII_ball_3 instance;

    private ASCII_ball_3() {}

    public static ASCII_ball_3 getInstance() {
        if (instance == null) {
            synchronized (ASCII_ball_2.class) {
                if (instance == null) {
                    instance = new ASCII_ball_3();
                }
            }
        }
        return instance;
    }

    @Override
    public String createASCIIArt(String text) {
        return 

        "____  ____  _     _      _____ \n" +
       "/  __\/  _ \/ \   / \     \__  \" \n" +
       "| | //| / \|| |   | |       /  |\n"+
       "| |_\\| |-||| |_/\| |_/\   _\  |\n"+
       "\____/\_/ \|\____/\____/  /____/"
                                       
       
       
    }
}
