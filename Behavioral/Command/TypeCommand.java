package Command;

public class TypeCommand implements Command {
    private String text;
    private Editor editor;

    public TypeCommand(Editor editor, String text) {
        this.editor = editor;
        this.text = text;
    }

    public void execute() {
        editor.type(text);
    }

    public void undo() {
        editor.delete(text.length());
    }
}
