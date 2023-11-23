package ASCII_factories;

public class ASCII_start_game implements ASCII_main{
    private static volatile ASCII_start_game instance;

    private ASCII_start_game() {}

    public static ASCII_start_game getInstance(){
        if(instance == null) {
            synchronized (ASCII_start_game.class){
                if (instance == null) {
                    instance = new ASCII_start_game();
                }
            }
        }
        return instance;
    }

    @Override
    public String createASCIIArt(String text) {
        return "

        o__ __o     o                   o      \o       o/ 
       <|     v\   <|>                 <|>      v\     /v  
       / \     <\  / \                 / \       <\   />   
       \o/     o/  \o/               o/   \o       \o/     
        |__  _<|/   |               <|__ __|>       |      
        |          / \              /       \      / \     
       <o>         \o/            o/         \o    \o/     
        |           |            /v           v\    |      
       / \         / \ _\o__/_  />             <\  / \     
                                                           
                                                           
                                                           
      
      ";
    }
    
}
