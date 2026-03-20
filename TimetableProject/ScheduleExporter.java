import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class ScheduleExporter {
    public static void export(Timetable timetable, String filename) {
        try {
            File f = new File(filename);
            PrintWriter out = new PrintWriter(f);
            out.println(timetable.toString());
            out.close();
        } catch (FileNotFoundException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}