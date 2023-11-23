package ASCII_factories;

public class ASCII_ball_2 implements ASCII_main{
    private static volatile ASCII_ball_2 instance;

    private ASCII_ball_2() {}

    public static ASCII_ball_2 getInstance() {
        if (instance == null) {
            synchronized (ASCII_ball_2.class) {
                if (instance == null) {
                    instance = new ASCII_ball_2();
                }
            }
        }
        return instance;
    }

    @Override
    public String createASCIIArt(String text) {
        return "                             ,--,      ,--,                \n" +
               "                          ,---.'|   ,---.'|                \n" +
               "    ,---,.    ,---,       |   | :   |   | :       ,----,   \n" +
               "  ,'  .'  \\  '  .' \\      :   : |   :   : |     .'   .' \\  \n" +
               ",---.' .' | /  ;    '.    |   ' :   |   ' :   ,----,'    | \n" +
               "|   |  |: |:  :       \\   ;   ; '   ;   ; '   |    :  .  ; \n" +
               ":   :  :  /:  |   /\\   \\  '   | |__ '   | |__ ;    |.'  /  \n" +
               ":   |    ; |  :  ' ;.   : |   | :.'||   | :.'|`----'/  ;   \n" +
               "|   :     \\|  |  ;/  \\   \\;   :    ;'   :    ;  /  ;  /    \n" +
               "|   |   . |'  :  | \\  \\ ,'|   |  ./ |   |  ./  ;  /  /-,   \n" +
               "'   :  '; ||  |  '  '--'  ;   : ;   ;   : ;   /  /  /.`|   \n" +
               "|   |  | ; |  :  :        |   ,/    |   ,/ ./__;      :   \n" +
               "|   :   /  |  | ,'        '---'     '---'  |   :    .'    \n" +
               "|   | ,'   `--''                            ;   | .'       \n" +
               "`----'                                      `---'          ";
    }
}
