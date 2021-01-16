package com.ikhokha.techcheck.commentfactory;

import java.util.Locale;

public class SpamCheck implements Operation {
    @Override
    public boolean check(String comment) {
        return comment.toUpperCase().contains("HTTP://") ||
                comment.toUpperCase().contains("HTTPS://") ||
                comment.toUpperCase().contains("WWW");
    }
}
