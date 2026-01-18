import java.util.List;

public class MultiplicationTable {
    private int number;
    private int range;
    private List<String> tableLines;

    public MultiplicationTable(int number, int range, List<String> tableLines) {
        this.number = number;
        this.range = range;
        this.tableLines = tableLines;
    }

    public int getNumber() {
        return number;
    }

    public int getRange() {
        return range;
    }

    public List<String> getTableLines() {
        return tableLines;
    }
}
