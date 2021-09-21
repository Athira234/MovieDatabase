package com.entlogics.moviedb.user;

import java.util.ArrayList;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.springframework.stereotype.Repository;

import com.entlogics.moviedb.movie.Movie;

@Repository
public class UserRepository implements IUserRepository {
	EntityManagerFactory factory = Persistence.createEntityManagerFactory("MDB");

	@Override
	public void rateMovie(UserMovie usermovie) {
		System.out.println("Inside rateMovie() method in UserRepository");
		int flag = 0;
		EntityManager entityManager = factory.createEntityManager();
		entityManager.getTransaction().begin();
		List<UserMovie> userMovie = entityManager.createNativeQuery("select * from lt_user_movie", UserMovie.class)
				.getResultList();

		for (UserMovie um : userMovie) {
			System.out.println(um);
			if (um != null) {
				if (um.getUser_id() == 1 && um.getMovie_id() == 6) {
					flag = 1;
					break;
				}
			}
		}
		System.out.println("flag=" + flag);
		if (flag == 1) {
			entityManager.createNativeQuery("update lt_user_movie set rating_given= ? where user_id= ? and movie_id= ?",
					UserMovie.class).setParameter(1, 9).setParameter(2, 1).setParameter(3, 1).executeUpdate();
		} else {
			entityManager.createNativeQuery("INSERT INTO  lt_user_movie(user_id,movie_id,rating_given) VALUES (?,?,?)")
					.setParameter(1, 1).setParameter(2, 6).setParameter(3, 9).executeUpdate();
		}

		entityManager.getTransaction().commit();
		entityManager.close();
	}

	@Override
	public void giveMovieFeedback(UserMovie userMovie) {
		System.out.println("Inside giveMovieFeedback() method in UserRepository");
		int flag = 0;
		EntityManager entityManager = factory.createEntityManager();
		entityManager.getTransaction().begin();
		List<UserMovie> userMovies = entityManager.createNativeQuery("select * from lt_user_movie", UserMovie.class)
				.getResultList();
		for (UserMovie um : userMovies) {

			System.out.println(um);
			if (um != null) {
				if (um.getUser_id() == 1 && um.getMovie_id() == 4) {
					flag = 1;
					break;
				}

			}
		}
		if (flag == 1) {
			entityManager
					.createNativeQuery("update lt_user_movie feedback_given= ? where user_id= ? and movie_id= ?",
							UserMovie.class)
					.setParameter(1, "It is a Horror movie,Nice scripted").setParameter(2, 1).setParameter(3, 4)
					.executeUpdate();
		} else {

			entityManager.createNativeQuery("INSERT INTO  lt_user_movie(user_id,movie_id,review) VALUES (?,?,?)")
					.setParameter(1, 1).setParameter(2, 4).setParameter(3, "It is a Horror movie,Nice scripted")
					.executeUpdate();
		}

		entityManager.getTransaction().commit();
		entityManager.close();

	}

	@Override
	public void addMovieToWatchlist(UserWatchListItems movie) {
		System.out.println("Inside addMovieToWatchlist() method in UserRepository");

		EntityManager entityManager = factory.createEntityManager();
		entityManager.getTransaction().begin();
		entityManager
				.createNativeQuery(
						"INSERT INTO  lt_user_watchlist_items(watchlist_id,movie_id,notes,date_added) VALUES (?,?,?,?)")
				.setParameter(1, 1).setParameter(2, 1).setParameter(3, "No.1 Watchlist").setParameter(4, "2021-10-20")
				.executeUpdate();

		entityManager.getTransaction().commit();
		entityManager.close();

	}

	@Override
	public void addMovieToFavourites(UserMovie userMovie) {
		System.out.println("Inside addMovieToFavourites() method in UserRepository");
		EntityManager entityManager = factory.createEntityManager();
		entityManager.getTransaction().begin();
		entityManager.createNativeQuery("update lt_user_movie set is_favourite= ? where user_id= ? and movie_id= ?",
				UserMovie.class).setParameter(1, true).setParameter(2, 1).setParameter(3, 2).executeUpdate();

		entityManager.getTransaction().commit();
		entityManager.close();
	}

	@Override
	public void recommendMovie(UserMovie userMovie) {
		System.out.println("Inside recommendMovie() method in UserRepository");
		EntityManager entityManager = factory.createEntityManager();
		entityManager.getTransaction().begin();
		entityManager.createNativeQuery("update lt_user_movie set is_recommended= ? where user_id= ? and movie_id= ?",
				UserMovie.class).setParameter(1, true).setParameter(2, 1).setParameter(3, 2).executeUpdate();
		entityManager.getTransaction().commit();
		entityManager.close();

	}

	@Override
	public List<UserWatchList> findWatchList(int userId) {
		System.out.println("Inside findWatchList() method in UserRepository");
		EntityManager entityManager = factory.createEntityManager();
		entityManager.getTransaction().begin();

		List<UserWatchList> userWatchlists = entityManager
				.createNativeQuery("select * from dt_user_watchlist where user_id=" + userId, UserWatchList.class)
				.getResultList();
		System.out.println(userWatchlists);
		entityManager.getTransaction().commit();
		entityManager.close();
		return userWatchlists;
	}

	@Override
	public List<Movie> findFavourites(int userId) {
		System.out.println("Inside findFavourites() method in UserRepository");
		EntityManager entityManager = factory.createEntityManager();
		entityManager.getTransaction().begin();
		List<UserMovie> userMovie = entityManager
				.createNativeQuery("select * from lt_user_movie where user_id=" + userId, UserMovie.class)
				.getResultList();
		List<Movie> movies = new ArrayList<Movie>();
		for (UserMovie um : userMovie) {
			if (um.isFavourite() == true) {
				Movie movie = um.getMovie();
				movies.add(movie);
			}
		}
		System.out.println(movies);

		return movies;
	}

	@Override
	public List<UserMovie> findRatings(int userId, int movieId) {
		System.out.println("Inside findRatings() method in UserRepository");
		return null;
	}

	@Override
	public List<UserMovie> findFeedbacks(int userId, int movieId) {
		System.out.println("Inside findFeedbacks() method in UserRepository");
		return null;
	}

	@Override
	public User findProfile(int userId) {
		System.out.println("Inside findProfile() method in UserRepository");
		EntityManager entityManager = factory.createEntityManager();

		entityManager.getTransaction().begin();
		User user = entityManager.find(User.class, userId);
		System.out.println("user details :" + user);
		entityManager.getTransaction().commit();

		return user;

	}

	@Override
	public void updateProfile(User user) {
		System.out.println("Inside updateProfile() method in UserRepository");

	}

	@Override
	public void updatePassword(User user) {
		System.out.println("Inside updatePassword() method in UserRepository");

	}

	@Override
	public void signUp() {
		System.out.println("Inside signUp()  method in UserRepository");

	}

	@Override
	public void login() {
		System.out.println("Inside login()  method in UserRepository");

	}

	@Override
	public void logout() {
		System.out.println("Inside logout()  method in UserRepository");
	}

	public static void main(String[] args) {

		UserRepository repo = new UserRepository();
		UserMovie us = new UserMovie();

		repo.rateMovie(us);
		// repo.findProfile(1);
		// repo.giveMovieFeedback(us);
		// repo.addMovieToWatchlist(null);

		// repo.addMovieToFavourites(us);
		// repo.recommendMovie(us);
		// repo.findWatchList(1);
		// repo.findFavourites(2);
	}
}
