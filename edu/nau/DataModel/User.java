package edu.nau.DataModel;
// package edu.nau.dataModel

import java.util.UUID;

public record User(
        UUID id,
        String firtName,
        String lastName,
        // maybe change that to type email
        String email,
        UserRole role) {

};