package homework.task_1.service;

import homework.task_1.logger.DoLog;
import homework.task_1.validation.Validator;

import java.io.*;
import java.util.Date;

public class ReadWritFiles {
    public static  void readingWritingFiles(String path){
        DoLog.EXECUTION_LOG(new Date(),"Start reading file\n");
        try(BufferedReader reader = new BufferedReader(new FileReader(path))){
            String line = reader.readLine();
            while (line != null) {
                Validator.validationNameDocuments(line);
                line = reader.readLine();
            }
        } catch (FileNotFoundException e) {
            DoLog.ERROR_LOG(new Date(), e.getMessage());
        } catch (IOException e) {
            DoLog.ERROR_LOG(new Date(), e.getMessage());
        }
        DoLog.EXECUTION_LOG(new Date(), "End of file reading\n");
    }
}
