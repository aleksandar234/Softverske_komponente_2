package com.raf.restdemo.dto.review;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

public class ReviewUpdateDto {

    private String comment;

    @Min(1) @Max(5)
    private int rate;

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public int getRate() {
        return rate;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }
}
