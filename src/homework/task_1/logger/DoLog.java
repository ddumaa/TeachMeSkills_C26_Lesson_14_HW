package homework.task_1.logger;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Date;

public class DoLog {

    private static final String EXECUTION_LOG_FILE = "C:\\Users\\dimad\\IdeaProjects\\TeachMeSkills_C26_Lesson_14_HW\\log\\execution_log\\execution_log.txt";
    private static final String ERROR_LOG_FILE = "C:\\Users\\dimad\\IdeaProjects\\TeachMeSkills_C26_Lesson_14_HW\\log\\error_log\\error_log.txt";
    private static final String VALID_DOCNUM = "C:\\Users\\dimad\\IdeaProjects\\TeachMeSkills_C26_Lesson_14_HW\\verified_documents\\valid_documents\\valid_docnum.txt";
    private static final String VALID_CONTRACT = "C:\\Users\\dimad\\IdeaProjects\\TeachMeSkills_C26_Lesson_14_HW\\verified_documents\\valid_documents\\valid_сontract.txt";
    private static final String INVALID_DOCUMENT = "C:\\Users\\dimad\\IdeaProjects\\TeachMeSkills_C26_Lesson_14_HW\\verified_documents\\invalid_documents\\invalid_documents.txt";


    public static void EXECUTION_LOG(Date date, String infoMessage){
        try {
            String message = date +  " -> " + infoMessage;
            Files.write(Paths.get(EXECUTION_LOG_FILE), message.getBytes(), StandardOpenOption.APPEND);
        } catch (IOException e) {
            //do nothing;
        }
    }
    public static void ERROR_LOG(Date date, String errorMessage){
        try {
            String message = date +  " -> " + errorMessage;
            Files.write(Paths.get(ERROR_LOG_FILE), message.getBytes(), StandardOpenOption.APPEND);
        } catch (IOException e) {
            //do nothing;
        }
    }
    public static void INVALID_DOCUMENT(Date date, String invalidMessage) {
        try {
            String message = date +  " -> " + invalidMessage;
            Files.write(Paths.get(INVALID_DOCUMENT), message.getBytes(), StandardOpenOption.APPEND);
        } catch (IOException e) {
            //do nothing;
        }
    }
    public static void VALID_DOCNUM(Date date, String validMessage) {
        try {
            String message = date +  " -> " + validMessage;
            Files.write(Paths.get(VALID_DOCNUM), message.getBytes(), StandardOpenOption.APPEND);
        } catch (IOException e) {
            //do nothing;
        }
    }
    public static void VALID_CONTRACT(Date date, String validMessage) {
        try {
            String message = date +  " -> " + validMessage;
            Files.write(Paths.get(VALID_CONTRACT), message.getBytes(), StandardOpenOption.APPEND);
        } catch (IOException e) {
            //do nothing;
        }
    }
}
