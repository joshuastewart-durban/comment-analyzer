package com.ikhokha.techcheck.commentfactory;

public class ShakerCheck implements Operation {
    @Override
    public boolean check(String comment) {
        return comment.toUpperCase().contains("SHAKER");
    }
}
