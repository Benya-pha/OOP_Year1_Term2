import javax.swing.*;
import java.awt.*;

public class TimetablePanel extends JPanel {
    private Timetable timetable;
    private JTextArea textArea;

    public TimetablePanel(Timetable timetable) {
        this.timetable = timetable;
        setLayout(new BorderLayout());
        textArea = new JTextArea();
        textArea.setEditable(false);
        add(new JScrollPane(textArea), BorderLayout.CENTER);
        refresh();
    }

    public void refresh() {
        textArea.setText(timetable.toString());
    }

}
