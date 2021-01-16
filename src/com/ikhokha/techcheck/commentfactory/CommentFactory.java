package com.ikhokha.techcheck.commentfactory;

import com.ikhokha.techcheck.enums.MetricTypeEnum;

import java.util.HashMap;
import java.util.Map;

public class CommentFactory {
    public static Map<String, Operation> operationMap = new HashMap<>();
    static {
        operationMap.put(MetricTypeEnum.SHAKER_MENTIONS.toString(), new ShakerCheck());
        operationMap.put(MetricTypeEnum.MOVER_MENTIONS.toString(), new MoverCheck());
        operationMap.put(MetricTypeEnum.SPAM.toString(), new SpamCheck());
        operationMap.put(MetricTypeEnum.SHORTER_THAN_15.toString(), new ShorterThan15Check());
        operationMap.put(MetricTypeEnum.QUESTIONS.toString(), new QuestionCheck());
    }
}
