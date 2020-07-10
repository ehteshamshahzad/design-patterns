import memento.Document;
import memento.Editor;
import memento.History;
import state.BrushTool;
import state.Canvas;
import state.EraserTool;
import state.SelectionTool;

public class Main {
    public static void main(String[] args) {
//        new Main().Memento();

        new Main().drawUIControl();
    }

    void Memento() {
        var editor = new Editor<Document>();
        var history = new History<Document>();

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

    void drawUIControl() {
        var canvas = new Canvas();
        canvas.setCurrentTool(new SelectionTool());
        canvas.mouseDown();
        canvas.mouseUp();

        canvas.setCurrentTool(new BrushTool());
        canvas.mouseDown();
        canvas.mouseUp();

        canvas.setCurrentTool(new EraserTool());
        canvas.mouseDown();
        canvas.mouseUp();
    }
}
