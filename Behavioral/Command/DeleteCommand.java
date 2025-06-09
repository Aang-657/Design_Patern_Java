package Command;

public class DeleteCommand implements Command {
    private String text;
    private Editor editor;

    public DeleteCommand(Editor editor) {
        this.editor = editor;
        this.text = editor.getLastDeleted();
    }

    public void execute() {
        editor.delete(1);
    }

    public void undo() {
        editor.type(text);
    }
}