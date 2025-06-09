package Factory_Method;

public class CharacterFactory {
    public static Character createCharacter(String type) {
        Creator creator;
        if ("warrior".equalsIgnoreCase(type)) {
            creator = new WarriorCreator();
        } else if ("mage".equalsIgnoreCase(type)) {
            creator = new MageCreator();
        } else {
            throw new IllegalArgumentException("Tipe karakter tidak valid");
        }
        return creator.createProduct();
    }
}
