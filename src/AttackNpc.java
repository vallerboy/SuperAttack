public class AttackNpc extends Npc {


    public AttackNpc(String name, int age, boolean isGoodCharacter) {
        super(name, age, isGoodCharacter);
    }

    @Override
    public void action(Player player) {
        System.out.println("Atakuje CIE!!!!!!!!!!!!!!!!!!");
        player.setHealth(player.getHealth() + (isGoodCharacter() ? 1 : -1));
    }
}
