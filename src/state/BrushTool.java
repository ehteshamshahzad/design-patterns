package state;

public class BrushTool implements Tool {
    @Override
    public void mouseDown() {
        System.out.println("Display brush icon");
    }

    @Override
    public void mouseUp() {
        System.out.println("Draw a line");
    }
}
