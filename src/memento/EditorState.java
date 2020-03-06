package memento;

public class EditorState { // Memento
    private final Document document;

    public EditorState(Document document) {
        this.document = document;
    }

    public Document getDocument() {
        return document;
    }

}
