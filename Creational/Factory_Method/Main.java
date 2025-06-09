package Factory_Method;

public class Main {
    public static void main(String[] args) {
        Character warrior = CharacterFactory.createCharacter("warrior");
        warrior.display();

        Character mage = CharacterFactory.createCharacter("mage");
        mage.display();
    }
}
