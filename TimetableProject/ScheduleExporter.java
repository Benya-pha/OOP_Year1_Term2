import java.io.File;
import java.io.IOException;
import java.io.PrintStream;

public class ScheduleExporter {
    static void export(Timetable timetable, String filename) {
        try {
            File f = new File(filename);
            PrintStream out = new PrintStream(f);
            out.println( timetable.toString() );
            out.close();
        }catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
