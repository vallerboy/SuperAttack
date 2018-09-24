import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class Game {
    private List<Npc> npcList;
    private Player player;

    public Game() {
        //konstruktor tworzacy obiekt
        npcList = new ArrayList<>();
    }

    public void start() {
        while (player.getHealth() >= 0 && player.getLevel() <= 50){
            System.out.println("Życie gracza: " + player.getHealth());
            System.out.println("Level gracza: " + player.getLevel());
            talkToRandomNpc();


            System.out.println("------------------------------------------");
        }

        System.out.println("Game Over");
    }



    public void addNpc(Npc npc){
        npcList.add(npc);
    }

    public void setPlayer(Player player){
        this.player = player;
    }

    public void talkToRandomNpc(){
        Random random = new Random();

        Npc npc = npcList.get(random.nextInt(npcList.size()));
        System.out.println("Zagadałeś do: " + npc.getName());

        npc.action(player);
    }
}
