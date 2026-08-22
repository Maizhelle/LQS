import java.io.Serializable;

public class Student implements Serializable {
    private static final long serialVersionUID = 1L;
    private static final int MAX_NAME_LENGTH = 50;
    private static final int MAX_DEPARTMENT_LENGTH = 80;
    private static final String NAME_PATTERN = "^[\\p{L}][\\p{L}'-]*(?: [\\p{L}][\\p{L}'-]*)*, [\\p{L}][\\p{L}'-]*(?: [\\p{L}][\\p{L}'-]*)*(?:, [\\p{L}]\\.)?$";
    private static final String STUDENT_ID_PATTERN = "\\d{4}-\\d{7}";

    private final String name;
    private final String id;
    private final String department;
    
    public Student(String name, String id, String department) {
        this(name, id, department, false);
    }

    public Student(String name, String id, String department, boolean generalId) {
        this.name = validateName(name);
        this.id = validateId(id, generalId);
        this.department = validateText(department, "Department/college", MAX_DEPARTMENT_LENGTH);
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public String getDepartment() {
        return department;
    }

    private static String validateName(String name) {
        String normalizedName = validateText(name, "Student name", MAX_NAME_LENGTH);
        if (!normalizedName.matches(NAME_PATTERN)) {
            throw new IllegalArgumentException("Student name must use the format Surname, First Name, M.I. (if any), for example Doe, Jane, A.");
        }
        return normalizedName;
    }

    private static String validateId(String id, boolean generalId) {
        String normalizedId = validateText(id, generalId ? "ID" : "Student ID", generalId ? 30 : 12);
        if (!generalId && !normalizedId.matches(STUDENT_ID_PATTERN)) {
            throw new IllegalArgumentException("Student ID must use the format ####-#######, for example 2026-1234567.");
        }
        return normalizedId;
    }

    private static String validateText(String value, String fieldName, int maxLength) {
        if (value == null) {
            throw new IllegalArgumentException(fieldName + " is required.");
        }

        String normalizedValue = value.trim();
        if (normalizedValue.isEmpty()) {
            throw new IllegalArgumentException(fieldName + " is required.");
        }
        if (normalizedValue.length() > maxLength) {
            throw new IllegalArgumentException(fieldName + " must be " + maxLength + " characters or fewer.");
        }
        if (normalizedValue.codePoints().anyMatch(Character::isISOControl)) {
            throw new IllegalArgumentException(fieldName + " cannot contain control characters.");
        }
        return normalizedValue;
    }
}

