import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {
    private Timetable timetable;
    private InputPanel inputPanel;
    private TimetablePanel timetablePanel;

    public MainFrame() {
        setTitle("Class Schedule");
        setSize(900, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // ใช้ Layout พื้นฐาน
        setLayout(new BorderLayout());

        timetable = new Timetable();
        inputPanel = new InputPanel(timetable, this);
        timetablePanel = new TimetablePanel(timetable);

        // วาง Panel ซ้ายและขวาตามลำดับ
        add(inputPanel, BorderLayout.WEST);
        add(timetablePanel, BorderLayout.CENTER);

        setVisible(true);
    }

    public void refreshTable() {
        timetablePanel.refresh();
    }

    public static void main(String[] args) {
        new MainFrame();
    }
}