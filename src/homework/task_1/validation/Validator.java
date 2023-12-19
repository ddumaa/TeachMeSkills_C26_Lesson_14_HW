package homework.task_1.validation;

import homework.task_1.logger.DoLog;
import homework.task_1.utils.IConsts;

import java.util.Date;

public class Validator {
    public static void validationNameDocuments (String nameDocuments) {
        if (nameDocuments.length() != IConsts.DOCUMENT_LENGTH || nameDocuments.matches("\\W+")) {
            DoLog.INVALID_DOCUMENT(new Date(), nameDocuments+" -> Invalid number: number length exceeded/service characters\n");
            //при броске кастомной ошибки прерывается поток, убрал другие упоминания в других классах
            //throw new InvalidDocumentNameException(101, "Invalid number: number length exceeded/service characters\n");
        } else if (nameDocuments.startsWith(IConsts.DOCUMENT_START_1)){
            DoLog.VALID_DOCNUM(new Date(), nameDocuments+"\n");
        } else if (nameDocuments.startsWith(IConsts.DOCUMENT_START_2)){
            DoLog.VALID_CONTRACT(new Date(), nameDocuments+"\n");
        } else {
            DoLog.INVALID_DOCUMENT(new Date(), nameDocuments+" -> Used incorrect name\n");
            //при броске кастомной ошибки прерывается поток, убрал другие упоминания в других классах
            //throw new InvalidDocumentNameException(102, "Used incorrect name\n");
        }
    }
}
