
import java.io.FileWriter;
import java.io.IOException;

public class LogTextInFile {
    private static final String FILE_OUTPUT = "log.txt";
    private static FileWriter fileWriter;

    public static void writeLog(String st, boolean flag){
        try {
            fileWriter = new FileWriter(FILE_OUTPUT, flag);
            fileWriter.write(st);
            System.out.print(st);
        } catch (IOException e) {
            System.out.println("Произошла ошибкa записи в файл.");
            e.printStackTrace();
        } finally {
            freeResource(fileWriter);
        }
    }

    public static void writeLog(String st){
        try {
            fileWriter = new FileWriter(FILE_OUTPUT, true);
            fileWriter.write(st);
            System.out.print(st);
        } catch (IOException e) {
            System.out.println("Произошла ошибкa записи в файл.");
            e.printStackTrace();
        } finally {
            freeResource(fileWriter);
        }
    }

    public static void freeResource(FileWriter file){
        if (file != null) {
            try {
                file.close();
            }
            catch (IOException e) {
                System.out.println("Произошла ошибкa освобождения файла.");
                e.printStackTrace();
            }
        }
    }
}
