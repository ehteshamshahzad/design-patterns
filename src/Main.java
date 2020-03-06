import memento.Document;
import memento.Editor;
import memento.History;

public class Main {
    public static void main(String[] args) {
        new Main().Memento();
    }

    void Memento() {
        var editor = new Editor();
        var history = new History();

        editor.setDocument(new Document("Story", "Arial", 12));
        history.push(editor.createState());
        System.out.print(editor.getDocument() + "\n");

        editor.setDocument(new Document("Title", "Arial", 12));
        history.push(editor.createState());
        System.out.print(editor.getDocument() + "\n");

        editor.setDocument(new Document("Title", "Times New Roman", 12));
        history.push(editor.createState());
        System.out.print(editor.getDocument() + "\n");

        editor.setDocument(new Document("Title", "Times New Roman", 14));

        System.out.print(editor.getDocument() + "\n");

        editor.restore(history.pop());
        editor.restore(history.pop());

        System.out.print("===================\n" + editor.getDocument() + "\n");
    }
}
