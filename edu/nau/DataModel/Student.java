package edu.nau.DataModel;
import java.util.UUID;
import java.time.Year;

public record Student(
    UUID userId,
    String programId,
    Term graduationTerm, // NOTE: is it bad to include the data type in the name
    Year graduationYear
) {
    
}
