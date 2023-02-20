package edu.nau.DataModel;

import java.util.UUID;
import java.net.URL;

public record Document(
    UUID id,
    UUID ownerId,
    // TODO: do we want to change the filename to a java.util.file fileName?
    String fileName,
    // TODO: the file will not be in the document. it is probably best to have a link the the actual url that will have the binary date in the response
    URL url
) {
    
}
