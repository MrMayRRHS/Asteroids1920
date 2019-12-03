import mayflower.*;
import java.util.*;

public class Sensors extends GameView
{
  //800 by 600 screen per person
  public Sensors(Client client, GameState state){
    super(client,state);
  }
  
  public void compareCords(){
    NetworkActor[] actors =getState().getActors();
    NetworkActor ship = null;
    for (NetworkActor a:actors){
      if(a.getType().equals("ship")){ship = a;}
    }
    if(ship!=null){
      int shipx = ship.getX();
      int shipy = ship.getY();
    }
  }
}