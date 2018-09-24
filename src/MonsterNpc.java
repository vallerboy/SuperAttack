public class MonsterNpc extends Npc {

    public MonsterNpc(String name, int age, int attack) {
        super(name, age, false, attack);
    }

    @Override
    public void action(Player player) {
        System.out.println("Spotkałeś potwora! ");
        player.setHealth(player.getHealth() - getAttack());
    }
}
