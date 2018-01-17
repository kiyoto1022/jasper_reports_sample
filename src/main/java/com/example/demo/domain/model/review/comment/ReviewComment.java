package com.example.demo.domain.model.review.comment;

public class ReviewComment {

    String reviewerName;
    String comment;
    int score;

    public ReviewComment(String reviewerName, String comment, int score) {
        this.reviewerName = reviewerName;
        this.comment = comment;
        this.score = score;
    }

    public String getReviewerName() {
        return reviewerName;
    }

    public String getComment() {
        return comment;
    }

    public int getScore() {
        return score;
    }
}