package memento;

import java.util.ArrayList;
import java.util.List;

public class History<T> { // Caretaker

    // We can use a stack or list
    private final List<EditorState<T>> editorStates = new ArrayList<>();

    public void push(EditorState<T> editorState) {
        editorStates.add(editorState);
    }

    public EditorState<T> pop() {
        var lastIndex = editorStates.size() - 1;
        var lastState = editorStates.get(lastIndex);
        editorStates.remove(lastState);

        return lastState;
    }
}
