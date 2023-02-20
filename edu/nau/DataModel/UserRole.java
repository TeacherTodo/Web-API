package edu.nau.DataModel;
// package edu.nau.dateModel

public enum UserRole {
    GUEST("guest"),
    STUDENT("student"),
    ADMIN("admin");

    private final String value;

    UserRole(String val) {
        this.value = val;
    }

    @Override
    public String toString() {
        return this.value;
    }
}
