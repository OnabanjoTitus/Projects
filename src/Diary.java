public class Diary {
    private Entry entry[];

    public Diary(int numberOfEntry) {
        entry=new Entry[numberOfEntry];
    }

    public int getNumberOfEntries() {
        return entry.length;
    }

    public void addNewEntry(Entry entry) {
        for(int counter=0;counter<this.entry.length;counter++){
            if(this.entry[counter]==null){
                this.entry[counter]=entry;
                break;
            }
        }
    }

    public Entry[] getEntries() {
        return entry;
    }

    public void deleteEntry(Entry entry) {
        for(int counter=0;counter<this.entry.length;counter++){
            if(this.entry[counter]==entry){
                this.entry[counter]=null;
                break;
            }
        }
    }


}
