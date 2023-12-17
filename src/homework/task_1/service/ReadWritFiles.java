package homework.task_1.service;

import homework.task_1.logs.Log;
import homework.task_1.validation.Validator;

import java.io.*;
import java.util.Date;

public class ReadWritFiles {
    public static  void readingWritingFiles(String path){
        Log.EXECUTION_LOG(new Date(),"Start reading file\n");
        try{
            BufferedReader reader = new BufferedReader(new FileReader(path));
            String line = reader.readLine();
            while (line != null) {
                System.out.println(line);
                Validator.validationNameDocuments(line);
                line = reader.readLine();
            }
            //тут закрывается ридер?
            reader.close();
        } catch (FileNotFoundException e) {
            Log.ERROR_LOG(new Date(), e.getMessage());
        } catch (IOException e) {
            Log.ERROR_LOG(new Date(), e.getMessage());
        } finally {
            //не смог закрыть его тут, нет метода.
        }
        Log.EXECUTION_LOG(new Date(), "End of file reading\n");
    }
}
