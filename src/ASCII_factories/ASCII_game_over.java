package ASCII_factories;

public class ASCII_game_over implements ASCII_main{
    private static volatile ASCII_game_over instance;

    private ASCII_game_over() {}

    public static ASCII_game_over getInstance(){
        if(instance == null) {
            synchronized (ASCII_start_game.class){
                if (instance == null) {
                    instance = new ASCII_game_over();
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
