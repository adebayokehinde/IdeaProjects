import java.util.ArrayList;
import java.util.List;

public class Dairy {
    private String username;
    private String password;
    private boolean isLocked;
    private List<Entry> entries;

    public Dairy(String username, String password) {
        this.username = username;
        this.password = password;
        this.isLocked = true; // Diary is locked by default
        this.entries = new ArrayList<>();
    }

    public void unlockDiary(String password) {
        if (this.password.equals(password)) {
            this.isLocked = false;
        }
    }

    public void lockDiary() {
        this.isLocked = true;
    }

    public boolean isLocked() {
        return isLocked;
    }

    public void createEntry(String title, String content) {
        if (!isLocked) {
            entries.add(new Entry(entries.size() + 1, title, content));
        } else {
            System.out.println("Diary is locked. Cannot create entry.");
        }
    }

    public void deleteEntry(int id) {
        if (!isLocked) {
            entries.removeIf(entry -> entry.getId() == id);
        } else {
            System.out.println("Diary is locked. Cannot delete entry.");
        }
    }

    public Entry findEntryById(int id) {
        for (Entry entry : entries) {
            if (entry.getId() == id) {
                return entry;
            }
        }
        return null;
    }

    public void updateEntry(int id, String title, String content) {
        Entry entry = findEntryById(id);
        if (entry != null && !isLocked) {
            entry.setTitle(title);
            entry.setContent(content);
        } else {
            System.out.println("Diary is locked or entry not found. Cannot update entry.");
        }
    }

    public String getUsername() {
        return username;
    }
}


