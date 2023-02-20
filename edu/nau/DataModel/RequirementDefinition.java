package edu.nau.DataModel;

// import java.time.LocalDate;
import java.util.ArrayList;
import java.util.UUID;
import java.net.URL;

public record RequirementDefinition(
    UUID id,
    String name,
    String description,
    ArrayList<URL> links,
    Boolean hasRequiredDocuments,
    ArrayList<Document> defaultDocuments,
    Boolean isDoccumentApprovalRequired,
    Boolean isTest

    // we will prpbbaly want to have a way to say "this is due xx days before the end of your term" then maybe have a new calander for terms, and make a new table. we could also say, x fridays before the end of the term.
) {
    
}

