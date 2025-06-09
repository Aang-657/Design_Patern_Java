package Factory_Method;

public class MageCreator extends Creator {
    public Character createProduct() {
        return new Mage();
    }
}
