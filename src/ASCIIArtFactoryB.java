public class ASCIIArtFactoryB implements ASCIIArtFactory {
    private static volatile ASCIIArtFactoryB instance;

    private ASCIIArtFactoryB() {}

    public static ASCIIArtFactoryB getInstance() {
        if (instance == null) {
            synchronized (ASCIIArtFactoryB.class) {
                if (instance == null) {
                    instance = new ASCIIArtFactoryB();
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
