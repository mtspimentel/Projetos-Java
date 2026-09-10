package StudentesNotes;

public class FinalNotes {

    public String name;
    public double note1;
    public double note2;
    public double note3;

    public double totalNotes() {
        return (note1 + note2 + note3) / 3;
    }

    public double missingNote() {
        return 60 - totalNotes();
    }

    public String toString() {
        return String.format("Final da grade: %.2f", totalNotes());
    }


}
