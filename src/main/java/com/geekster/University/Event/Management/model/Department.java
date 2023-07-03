package com.geekster.University.Event.Management.model;

public enum Department {
    ME("Mechanical Engineering"),
    ECE("Electronics and Communication Engineering"),
    CIVIL("Civil Engineering"),
    CSE("Computer Science and Engineering");

    private final String displayName;

    Department(String displayName) {
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return displayName;
    }
}
