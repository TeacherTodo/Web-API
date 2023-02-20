package edu.nau.DataModel;
import java.util.ArrayList;
import java.util.UUID;

// NOTE: it might be useful to have a version for a program as a program might use the same name, but have changing requirements.
// NOTE: it could be useful to have information about when the program is valid, but it is not necessary. You could just create a whole new program with the same name, and different requirements.

public record Program(
    UUID id,
    String name,
    ArrayList<RequirementDefinition> requirements
) {
    
}
