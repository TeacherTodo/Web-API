package edu.nau.DataModel;

// NOTE: https://en.wikipedia.org/wiki/Academic_term

public enum Term {
    SPRING("spring"),
    SUMMER("summer"),
    FALL("fall");

    private final String value;

    Term(String val) {
        this.value = val;
    }

    @Override
    public String toString() {
        return this.value;
    }
}
