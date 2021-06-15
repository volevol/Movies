package com.sumin.mymovies.data;

import android.arch.lifecycle.LiveData;
import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;

import java.util.List;

@Dao
public interface MovieDao {
    @Query("SELECT * FROM movies")
    LiveData<List<Movie>> getAllMovies();

<<<<<<< HEAD
    @Query("SELECT * FROM favourite_movies")
=======
    @Query("SELECT * FROM movies")
>>>>>>> 28fadd0e46a78d06cd9d812b404980a8f66c8583
    LiveData<List<FavouriteMovie>> getAllFavouriteMovies();

    @Query("SELECT * FROM movies WHERE id == :movieId")
    Movie getMovieById(int movieId);

    @Query("SELECT * FROM favourite_movies WHERE id == :movieId")
    FavouriteMovie getFavouriteMovieById(int movieId);

    @Query("DELETE FROM movies")
    void deleteAllMovies();

    @Insert
    void insertMovie(Movie movie);

    @Delete
    void deleteMovie(Movie movie);

    @Insert
    void insertFavouriteMovie(FavouriteMovie movie);

    @Delete
    void deleteFavouriteMovie(FavouriteMovie movie);
}
