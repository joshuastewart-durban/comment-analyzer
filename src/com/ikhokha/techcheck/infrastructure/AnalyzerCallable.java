package com.ikhokha.techcheck.infrastructure;

import com.ikhokha.techcheck.CommentAnalyzer;

import java.io.File;
import java.util.Map;
import java.util.concurrent.Callable;

public class AnalyzerCallable implements Callable {
    public File commentFile;
    CommentAnalyzer commentAnalyzer;
    public AnalyzerCallable(File _commentFile){
        this.commentFile = _commentFile;
        commentAnalyzer = new CommentAnalyzer(commentFile);

    }
    @Override
    public Map<String, Integer> call() throws Exception {
        return commentAnalyzer.analyze();
    }
}
