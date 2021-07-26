import java.time.LocalDate;
import java.time.LocalDateTime;

public class Entry {
    private String entryTitle;
    private String entryBody;
    private LocalDateTime localDateTime;
    public Entry(String entryTitle){
        this.entryTitle=entryTitle;
        this.localDateTime=LocalDateTime.now();
    }

    public void setEntryTitle(String entryTitle) {
        this.entryTitle=entryTitle;
    }

    public String getEntryTitle() {
        return entryTitle;
    }

    public void setEntryBody(String entryBody) {
        this.entryBody=entryBody;
    }

    public String getEntryBody() {
        return entryBody;
    }

    public LocalDateTime getDateAndTime() {
        return localDateTime;
    }
    public String viewEntry() {
        return String.format(""+getEntryTitle()+""+ LocalDate.now()+""+getEntryBody());

    }
    public String toString(){
        return viewEntry();
    }


    public void updateEntry(String entryBody) {
        this.entryBody+=entryBody;
    }
}
