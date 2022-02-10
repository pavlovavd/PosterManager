package ru.netology.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

public class Movie {
        private int id;
        private String name;
        private String genre;
        private boolean premierTomorrow;
        private int movies = 10;

        public int getMovies() {
                return movies;
        }

        public void setMovies(int movies) {
                this.movies = movies;
        }

        public int getId() {
                return id;
        }

        public void setId(int id) {
                this.id = id;
        }

        public String getName() {
                return name;
        }

        public void setName(String name) {
                this.name = name;
        }

        public String getGenre() {
                return genre;
        }

        public void setGenre(String genre) {
                this.genre = genre;
        }

        public boolean isPremierTomorrow() {
                return premierTomorrow;
        }

        public void setPremierTomorrow(boolean premierTomorrow) {
                this.premierTomorrow = premierTomorrow;
        }
}

