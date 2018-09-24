//Dlaczego oznaczyłem Npc jako abstract?
public abstract class Npc {
    private String name;
    private int age;
    private boolean isGoodCharacter;

    public Npc(String name, int age, boolean isGoodCharacter) {
        this.name = name;
        this.age = age;
        this.isGoodCharacter  = isGoodCharacter;
    }

    public boolean isGoodCharacter() {
        return isGoodCharacter;
    }

    public void setGoodCharacter(boolean goodCharacter) {
        isGoodCharacter = goodCharacter;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public abstract void action(Player player);
}
