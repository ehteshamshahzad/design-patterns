package memento;

public class EditorState<T> { // Memento
    private final T data;

    public EditorState(T document) {
        this.data = document;
    }

    public T getDocument() {
        return data;
    }

}
