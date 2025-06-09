package Command;
/* 
 * 
public class Main {
    public static void main(String[] args) {
        Editor editor = new Editor();
        Invoker invoker = new Invoker();

        invoker.setCommand(new TypeCommand(editor, "Hello"));
        invoker.executeCommand();

        invoker.setCommand(new DeleteCommand(editor));
        invoker.executeCommand();

        invoker.undoCommand(); // Mengembalikan "o"
        System.out.println("Content: " + editor.getContent());
    }
}
 *
 */

public class Main {
    public static void main(String[] args) {
        Editor editor = new Editor();
        Invoker invoker = new Invoker();

        // Mengetik teks "Hello"
        invoker.setCommand(new TypeCommand(editor, "Hello"));
        invoker.executeCommand();

        // Menampilkan konten setelah mengetik
        System.out.println("Content after typing: " + editor.getContent());

        // Menghapus karakter terakhir
        invoker.setCommand(new DeleteCommand(editor));
        invoker.executeCommand();

        // Menampilkan konten setelah menghapus
        System.out.println("Content after deleting: " + editor.getContent());

        // Undo penghapusan
        invoker.undoCommand();

        // Menampilkan konten setelah undo
        System.out.println("Content after undo: " + editor.getContent());
    }
}