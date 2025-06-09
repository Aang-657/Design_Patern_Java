package Command;

public class Editor {
    private StringBuilder content = new StringBuilder();

    public void type(String text) {
        content.append(text);
        System.out.println("Typed: " + text);
    }

    public void delete(int length) {
        if (content.length() >= length) {
            String deleted = content.substring(content.length() - length);
            content.setLength(content.length() - length);
            System.out.println("Deleted: " + deleted);
        }
    }

    public String getLastDeleted() {
        return content.length() > 0 ? content.substring(content.length() - 1) : "";
    }

    public String getContent() {
        return content.toString();
    }
}
