public class Starter {
    public static void main(String[] args) {
        Game game = new Game();

        game.setPlayer(new Player("Oskar", 60, 0));

        game.addNpc(new ShoperNpc("Janek", 50, true));
        game.addNpc(new ShoperNpc("Tomek", 56, false));
        game.addNpc(new ShoperNpc("Jarek", 12, false));

        game.addNpc(new AttackNpc("Zły gnom", 56, false));
        game.addNpc(new AttackNpc("Zły gnom1", 56, false));
        game.addNpc(new AttackNpc("Zły gnom2", 56, true));

        game.start();
    }
}
