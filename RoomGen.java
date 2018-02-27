
import java.util.ArrayList;
import java.util.Random;

public class RoomGen {

    int numRoom;
    ArrayList<Room> roomlist = new ArrayList();
    Random dice = new Random();
    int r = dice.nextInt(4) + 1;
    int e = dice.nextInt(3) + 1;

    RoomGen(int numRoom) {
        this.numRoom = numRoom;
    }

    public void getroom() {
        Room palace_entrance = new Room("The entrance of an old Egyptian palace...");
        Room trap_door = new Room("You fell through a trap door into a pit... ");
        Room tunnel = new Room("The entrance of a mysterious tunnel...");
        Room throne = new Room("The throne room!");
        
        for(int i = 0; i < this.r; i++){
            int type = dice.nextInt(4) + 1;
            if(type == 1){
                this.roomlist.add(palace_entrance);
            }if(type == 2){
                this.roomlist.add(trap_door);
            }if(type == 3){
                this.roomlist.add(tunnel);
            }if(type == 4){
                this.roomlist.add(throne);
                
            }
        }
    }
 
    public String toStringGen(){
        String blank = "";
        for(int i = 0; i < this.roomlist.size(); i++){
              Room room = this.roomlist.get(i);
              blank += room.toStringRoom();

        }
        return blank;
    }
}
