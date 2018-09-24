public class ShoperNpc extends Npc {


    public ShoperNpc(String name, int age, boolean isGoodCharacter) {
        super(name, age, isGoodCharacter);
    }

    @Override
    public void action(Player player) {
        System.out.println("Sprzedaje Ci cos tam cos tam cos tam!");
        player.setLevel(player.getLevel() + 1);
    }
}
