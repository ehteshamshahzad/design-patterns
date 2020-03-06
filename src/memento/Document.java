package memento;

public class Document {
    private String content;
    private String fontName;
    private double fontSize;

    public Document(String content, String fontName, double fontSize) {
        this.content = content;
        this.fontName = fontName;
        this.fontSize = fontSize;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getFontName() {
        return fontName;
    }

    public void setFontName(String fontName) {
        this.fontName = fontName;
    }

    public double getFontSize() {
        return fontSize;
    }

    public void setFontSize(double fontSize) {
        this.fontSize = fontSize;
    }

    @Override
    public String toString() {
        return "Content: " + getContent()
                + "\nFont Name: " + getFontName()
                + "\nFont Size: " + getFontSize()
                + "\n";
    }
}
