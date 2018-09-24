public class MonsterNpc extends Npc {

    private int power;

    public MonsterNpc(String name, int age, int power) {
        super(name, age, false);
        this. power = power;
    }

    @Override
    public void action(Player player) {

    }
}
