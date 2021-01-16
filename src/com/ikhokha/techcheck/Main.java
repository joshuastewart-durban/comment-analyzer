package com.ikhokha.techcheck;

import com.ikhokha.techcheck.infrastructure.AnalyzerCallable;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.*;

public class Main {
    public static Integer nThreads = 3;

    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(nThreads);
        List<Future<Map<String, Integer>>> list = new ArrayList<Future<Map<String, Integer>>>();
        Map<String, Integer> totalResults = new ConcurrentHashMap<>();

        File docPath = new File("docs");
        File[] commentFiles = docPath.listFiles((d, n) -> n.endsWith(".txt"));

        for (File commentFile : commentFiles) {
            Callable<Map<String, Integer>> callable = new AnalyzerCallable(commentFile);
            Future<Map<String, Integer>> future = executor.submit(callable);
            list.add(future);
        }
        executor.shutdown();
        for (Future<Map<String, Integer>> mapFuture : list) {
            try {
                Map<String, Integer> results = mapFuture.get();
                addReportResults(results, totalResults);
            } catch (InterruptedException | ExecutionException e) {
                e.printStackTrace();
            }
        }
        System.out.println("RESULTS\n=======");
        totalResults.forEach((k, v) -> System.out.println(k + " : " + v));
    }

    /**
     * This method adds the result counts from a source map to the target map
     *
     * @param source the source map
     * @param target the target map
     */
    private static void addReportResults(Map<String, Integer> source, Map<String, Integer> target) {

        for (Map.Entry<String, Integer> entry : source.entrySet()) {
            if (target.containsKey(entry.getKey())) {
                target.put(entry.getKey(), entry.getValue() + target.get(entry.getKey()));
            } else {
                target.put(entry.getKey(), entry.getValue());
            }

        }

    }

}
