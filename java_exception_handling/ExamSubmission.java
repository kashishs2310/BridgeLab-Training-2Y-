import java.time.*;

class LateSubmissionException extends Exception {
    public LateSubmissionException(String msg) { super(msg); }
}

class InvalidFileFormatException extends Exception {
    public InvalidFileFormatException(String msg) { super(msg); }
}

class ExamPortal {
    private final LocalDateTime deadline = LocalDateTime.of(2025, 11, 8, 23, 59);

    public void submitExam(String fileName, LocalDateTime submissionTime)
            throws LateSubmissionException, InvalidFileFormatException {
        if (!fileName.endsWith(".pdf"))
            throw new InvalidFileFormatException("Invalid file format. Only .pdf allowed.");
        if (submissionTime.isAfter(deadline))
            throw new LateSubmissionException("Late submission! Deadline has passed.");
        System.out.println("Exam submitted successfully: " + fileName);
    }
}

public class ExamSubmission {
    public static void main(String[] args) {
        ExamPortal portal = new ExamPortal();
        try {
            portal.submitExam("answer.docx", LocalDateTime.now());
        } catch (LateSubmissionException | InvalidFileFormatException e) {
            System.out.println("Submission failed: " + e.getMessage());
        }
    }
}
