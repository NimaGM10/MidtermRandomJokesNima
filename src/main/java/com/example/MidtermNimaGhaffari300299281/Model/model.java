package com.example.MidtermNimaGhaffari300299281.Model;

public class model {
    private String joke;

    public model(String joke){
        this.joke = joke;
    }

    public String getJoke() {
        return joke;
    }

    public void setJoke(String joke) {
        this.joke = joke;
    }

    @Override
    public String toString() {
        return "model{" +
                "joke='" + joke + '\'' +
                '}';
    }
}
