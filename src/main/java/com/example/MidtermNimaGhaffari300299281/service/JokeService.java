package com.example.MidtermNimaGhaffari300299281.service;

import com.example.MidtermNimaGhaffari300299281.Model.RandomJokes;
import org.springframework.stereotype.Service;

@Service
public class JokeService {

    private RandomJokes randomJokes;

    public JokeService(){
        this.randomJokes = new RandomJokes();
    }

    public String getRandomJokes(){
        return randomJokes.getRandomJokes();
    }
}
