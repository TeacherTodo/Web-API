package edu.nau.DataModel;

import java.time.LocalDate;

public record Test(
    LocalDate previousAttempt,
    LocalDate nextAvailableAttempt,
    Boolean isPassed
) {
    
}
