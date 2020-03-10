package memento;

public class Editor<T> { // Originator
    private T data;

    public EditorState<T> createState() {
        return new EditorState<T>(data);
    }

    public void restore(EditorState<T> editorState) {
        data = editorState.getDocument();
    }

    public T getDocument() {
        return data;
    }

    public void setDocument(T document) {
        this.data = document;
    }
}
