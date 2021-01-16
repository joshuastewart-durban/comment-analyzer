package com.ikhokha.techcheck.commentfactory;

public class ShorterThan15Check implements Operation{
    @Override
    public boolean check(String comment) {
        return comment.length() < 15;
    }
}
