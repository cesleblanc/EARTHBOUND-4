package main.java.Heroes;

public class Ness extends Hero {

    String asciiArt = ("           _____\n" +
            "          /_____\\__    \n" +
            "          \\/6.6\\/--`   \n" +
            "          (  _  )     \n" +
            "          ,'---',     \n" +
            "         / _____ \\     \n" +
            "        /_/_____\\_\\   \n" +
            "        \\ |_____| /  \n" +
            "         \\|_____|/    \n" +
            "          |  |  |     \n" +
            "          |  |  |      \n" +
            "          \\__|__/       \n" +
            "          _|_|_|_      \n" +
            "         (___|___) ");

    public Ness() {
        setHP(200.00);
        setName("NESS");
        setWeapon("a baseball bat");
        setImage(asciiArt);
        setPhysDamage(20.00);
        setSpecDamage(45.00);
    }
}