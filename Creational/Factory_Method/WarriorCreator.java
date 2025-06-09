package Factory_Method;

public class WarriorCreator extends Creator {
    public Character createProduct() {
        return new Warrior();
    }
}
