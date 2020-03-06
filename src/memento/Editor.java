package memento;

public class Editor { // Originator
    private Document document;

    public EditorState createState() {
        return new EditorState(document);
    }

    public void restore(EditorState editorState) {
        document = editorState.getDocument();
    }

    public Document getDocument() {
        return document;
    }

    public void setDocument(Document document) {
        this.document = document;
    }
}
