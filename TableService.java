import java.util.ArrayList;
import java.util.List;

public class TableService {

    private List<MultiplicationTable> history = new ArrayList<>();

    public void generateTable(int number, int range) {
        List<String> lines = new ArrayList<>();

        System.out.println("\nTable of " + number + " (1 to " + range + ")");
        for (int i = 1; i <= range; i++) {
            String line = number + " x " + i + " = " + (number * i);
            lines.add(line);
            System.out.println(line);
        }

        history.add(new MultiplicationTable(number, range, lines));
    }

    public void showHistory() {
        if (history.isEmpty()) {
            System.out.println("\n⚠ No history available.");
            return;
        }

        System.out.println("\n📜 Multiplication Table History:");
        for (MultiplicationTable table : history) {
            System.out.println("\nNumber: " + table.getNumber() +
                               " | Range: 1 to " + table.getRange());
            for (String line : table.getTableLines()) {
                System.out.println(line);
            }
        }
    }
}
