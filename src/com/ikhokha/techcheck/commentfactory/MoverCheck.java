package com.ikhokha.techcheck.commentfactory;

public class MoverCheck implements Operation{
    @Override
    public boolean check(String comment) {
        return comment.toUpperCase().contains("MOVER");
    }
}
