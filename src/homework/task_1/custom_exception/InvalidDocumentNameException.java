package homework.task_1.custom_exception;

public class InvalidDocumentNameException extends Exception{
    private int errorNumber;

    public InvalidDocumentNameException(int errorNumber, String message) {
        super(message);
        this.errorNumber = errorNumber;
    }
    public InvalidDocumentNameException(){
    }
}
