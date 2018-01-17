package com.example.demo.domain.model.review.comment;

import java.util.List;

/**
 * Created by akiyamakiyoto on 2018/01/17.
 */
public class ReviewComments {

    List<ReviewComment> value;

    public ReviewComments(List<ReviewComment> value) {
        this.value = value;
    }

    public List<ReviewComment> getValue() {
        return value;
    }

    public int totalScore() {
        int totalScore = 0;
        for (ReviewComment reviewComment : value) {
            totalScore += reviewComment.getScore();
        }
        return totalScore;
    }

    public int count() {
        return value.size();
    }
}