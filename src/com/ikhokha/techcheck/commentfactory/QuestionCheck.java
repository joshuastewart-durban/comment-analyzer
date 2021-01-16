package com.ikhokha.techcheck.commentfactory;

public class QuestionCheck implements Operation{

    @Override
    public boolean check(String comment) {
        return comment.contains("?");
    }
}
