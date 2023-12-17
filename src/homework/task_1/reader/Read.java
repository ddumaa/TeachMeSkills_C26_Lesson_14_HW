package homework.task_1.reader;

import homework.task_1.logs.Log;

import java.io.FileReader;
import java.io.IOException;
import java.util.Date;

public class Read {
    public static void readFile(String path)  {
        Log.EXECUTION_LOG(new Date(),"Start reading file\n");
        try(FileReader reader = new FileReader(path)) {
            int c;
            while((c=reader.read())!=-1){
                System.out.print((char)c);
            }
        }
        catch(IOException e){
            Log.ERROR_LOG(new Date(), e.getMessage());
        }
        Log.EXECUTION_LOG(new Date(),"End of file reading\n");
    }
}
