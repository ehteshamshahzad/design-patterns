package memento;

import java.util.ArrayList;
import java.util.List;

public class History { // Caretaker
    private final List<EditorState> editorStates = new ArrayList<>();

    public void push(EditorState editorState) {
        editorStates.add(editorState);
    }

    public EditorState pop() {
        var lastIndex = editorStates.size() - 1;
        var lastState = editorStates.get(lastIndex);
        editorStates.remove(lastState);

        return lastState;
    }
}
