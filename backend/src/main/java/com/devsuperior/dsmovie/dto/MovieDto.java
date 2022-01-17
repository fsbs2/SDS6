package com.devsuperior.dsmovie.dto;

import com.devsuperior.dsmovie.entities.Movie;

import java.io.Serializable;

public class MovieDto implements Serializable {
    private final Long id;
    private final String title;
    private final Double score;
    private final Integer count;
    private final String image;

    public MovieDto(Long id, String title, Double score, Integer count, String image) {
        this.id = id;
        this.title = title;
        this.score = score;
        this.count = count;
        this.image = image;
    }

    public MovieDto(Movie movie) {
        id = movie.getId();
        title = movie.getTitle();
        score = movie.getScore();
        count = movie.getCount();
        image = movie.getImage();
    }

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public Double getScore() {
        return score;
    }

    public Integer getCount() {
        return count;
    }

    public String getImage() {
        return image;
    }
}
