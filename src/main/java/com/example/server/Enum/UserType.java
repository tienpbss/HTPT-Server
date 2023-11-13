package com.example.server.Enum;

public enum UserType {
    GIANGVIEN("GIANGVIEN"), SINHVIEN("SINHVIEN");

    private final String type;

    UserType(String string) {
        type = string;
    }

    @Override
    public String toString() {
        return type;
    }
}
