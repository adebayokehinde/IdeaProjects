public class Diary {
    private int id;
    private String title;
    private String content;

    public void Entry(int id, String titlt, String content){
        this.id = id;
        this.title = titlt;
        this.content = content;

    }
    public int getId() {
        return id;
    }
    public String getTitle() {
        return title;
    }
    public String getContent() {
        return content;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public void setContent(String content) {
        this.content = content;
    }
}
