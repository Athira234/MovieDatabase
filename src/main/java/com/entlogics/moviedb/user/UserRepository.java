package com.entlogics.moviedb.user;

import java.util.ArrayList;


import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.hibernate.internal.build.AllowSysOut;
import org.springframework.stereotype.Repository;

import com.entlogics.moviedb.movie.Movie;

@Repository
public class UserRepository implements IUserRepository {
	EntityManagerFactory factory = Persistence.createEntityManagerFactory("MDB");

	@Override
	public void rateMovie(UserMovie usermovie) {
		System.out.println("Inside rateMovie() method in UserRepository");
		int flag = 0;
		int id = 0;
		EntityManager entityManager = factory.createEntityManager();
		entityManager.getTransaction().begin();
		List<UserMovie> userMovie = entityManager.createNativeQuery("select * from lt_user_movie", UserMovie.class)
				.getResultList();
		entityManager.getTransaction().commit();
		// iterate each UserMovie object
		// if the row with particular user_id and movie_id exists ,update the
		// rating_given else add new row

		for (UserMovie usermovie1 : userMovie) {
			System.out.println(usermovie1);
			if (usermovie != null) {
				Movie movie1 = usermovie1.getMovie();
				User user1 = usermovie1.getUser();
				// hard coded values will update when implementing user controller
				if (user1.getUserId() == 1 && movie1.getMovieId() == 7) {
					System.out.println("update existing row");
					id = usermovie1.getId();
					/*
					 * usermovie1.setRatingGiven(6); entityManager.merge(usermovie1);
					 * entityManager.getTransaction().commit();
					 */
					flag = 1;
					break;
				}
			}
		}
		System.out.println("id=" + id);
		System.out.println("flag=" + flag);
		if (flag == 1) {
			entityManager.getTransaction().begin();
			usermovie = entityManager.find(UserMovie.class, id);
			usermovie.setRatingGiven(4);
			entityManager.merge(usermovie);
			entityManager.getTransaction().commit();

		}
		System.out.println("flag=" + flag);
		if (flag == 0) {
			entityManager.getTransaction().begin();
			// user and movie object will add to usermovie when implementing controllers
			Movie movie = entityManager.find(Movie.class, 7);
			User user = entityManager.find(User.class, 1);
			System.out.println("user" + user);
			usermovie.setMovie(movie);
			usermovie.setUser(user);
			usermovie.setRatingGiven(5);
			usermovie.setReview("");
			entityManager.persist(usermovie);
			entityManager.getTransaction().commit();
		}

		entityManager.close();
	}

	@Override
	public void giveMovieFeedback(UserMovie userMovie) {
		System.out.println("Inside giveMovieFeedback() method in UserRepository");
		int flag = 0;
		int id = 0;
		EntityManager entityManager = factory.createEntityManager();
		entityManager.getTransaction().begin();
		List<UserMovie> usermovie = entityManager.createNativeQuery("select * from lt_user_movie", UserMovie.class)
				.getResultList();
		entityManager.getTransaction().commit();
		// iterate each UserMovie object
		// if the row with particular user_id and movie_id exists ,update the
		// rating_given else add new row

		for (UserMovie usermovie1 : usermovie) {
			System.out.println(usermovie1);
			if (usermovie != null) {
				Movie movie1 = usermovie1.getMovie();
				User user1 = usermovie1.getUser();
				// hard coded values will update when implementing user controller
				if (user1.getUserId() == 1 && movie1.getMovieId() == 7) {
					System.out.println("update existing row");
					id = usermovie1.getId();
					flag = 1;
					break;
				}
			}
		}
		System.out.println("id=" + id);
		System.out.println("flag=" + flag);
		if (flag == 1) {
			entityManager.getTransaction().begin();
			userMovie = entityManager.find(UserMovie.class, id);
			System.out.println("usermovie details" + userMovie);
			userMovie.setReview("good movie,must watch");
			entityManager.merge(userMovie);
			entityManager.getTransaction().commit();

		}
		System.out.println("flag=" + flag);
		if (flag == 0) {
			entityManager.getTransaction().begin();
			// user and movie object will add to usermovie when implementing controllers
			Movie movie = entityManager.find(Movie.class, 7);
			User user = entityManager.find(User.class, 1);
			System.out.println("user" + user);
			userMovie.setMovie(movie);
			userMovie.setUser(user);
			userMovie.setReview("good movie,must watch");
			entityManager.persist(userMovie);
			entityManager.getTransaction().commit();
		}

		entityManager.close();

	}

	@Override
	public void addMovieToWatchlist(int watchlistId, int movieId) {
		System.out.println("Inside addMovieToWatchlist() method in UserRepository");

		EntityManager entityManager = factory.createEntityManager();
		entityManager.getTransaction().begin();
		UserWatchListItems item = new UserWatchListItems();
		item.setMovieId(movieId);
		item.setWatchlistId(watchlistId);
		System.out.println("Items " + item);
		entityManager.persist(item);
		/*
		 * entityManager .createNativeQuery(
		 * "INSERT INTO  lt_user_watchlist_items(watchlist_id,movie_id,notes,date_added) VALUES (?,?,?,?)"
		 * ) .setParameter(1, 1).setParameter(2, 1).setParameter(3,
		 * "No.1 Watchlist").setParameter(4, "2021-10-20") .executeUpdate();
		 */

		entityManager.getTransaction().commit();
		entityManager.close();

	}

	@Override
	public void addMovieToFavourites(UserMovie userMovie) {
		System.out.println("Inside addMovieToFavourites() method in UserRepository");
		int flag = 0;
		int id = 0;
		EntityManager entityManager = factory.createEntityManager();
		entityManager.getTransaction().begin();
		List<UserMovie> userMovies = entityManager.createNativeQuery("select * from lt_user_movie", UserMovie.class)
				.getResultList();
		entityManager.getTransaction().commit();
		// iterate each UserMovie object
		// if the row with particular user_id and movie_id exists ,update the
		// rating_given else add new row

		for (UserMovie usermovie1 : userMovies) {
			System.out.println(usermovie1);
			if (usermovie1 != null) {
				Movie movie1 = usermovie1.getMovie();
				User user1 = usermovie1.getUser();
				// hard coded values will update when implementing user controller
				if (user1.getUserId() == 1 && movie1.getMovieId() == 7) {
					System.out.println("update existing row");
					id = usermovie1.getId();
					flag = 1;
					break;
				}
			}
		}
		System.out.println("id=" + id);
		System.out.println("flag=" + flag);
		if (flag == 1) {
			entityManager.getTransaction().begin();
			userMovie = entityManager.find(UserMovie.class, id);
			userMovie.setFavourite(true);
			entityManager.merge(userMovie);
			entityManager.getTransaction().commit();

		}
		System.out.println("flag=" + flag);
		if (flag == 0) {
			entityManager.getTransaction().begin();
			// user and movie object will add to usermovie when implementing controllers
			Movie movie = entityManager.find(Movie.class, 7);
			User user = entityManager.find(User.class, 1);
			System.out.println("user" + user);
			userMovie.setMovie(movie);
			userMovie.setUser(user);
			userMovie.setFavourite(true);
			entityManager.persist(userMovie);
			entityManager.getTransaction().commit();
		}

		entityManager.close();
	}

	@Override
	public void recommendMovie(UserMovie userMovie) {
		System.out.println("Inside recommendMovie() method in UserRepository");
		int flag = 0;
		int id = 0;
		EntityManager entityManager = factory.createEntityManager();
		entityManager.getTransaction().begin();
		List<UserMovie> userMovies = entityManager.createNativeQuery("select * from lt_user_movie", UserMovie.class)
				.getResultList();
		entityManager.getTransaction().commit();
		// iterate each UserMovie object
		// if the row with particular user_id and movie_id exists ,update the
		// rating_given else add new row

		for (UserMovie usermovie1 : userMovies) {
			System.out.println(usermovie1);
			if (usermovie1 != null) {
				Movie movie1 = usermovie1.getMovie();
				User user1 = usermovie1.getUser();
				// hard coded values will update when implementing user controller
				if (user1.getUserId() == 1 && movie1.getMovieId() == 7) {
					System.out.println("update existing row");
					id = usermovie1.getId();
					flag = 1;
					break;
				}
			}
		}
		System.out.println("id=" + id);
		System.out.println("flag=" + flag);
		if (flag == 1) {
			entityManager.getTransaction().begin();
			userMovie = entityManager.find(UserMovie.class, id);
			userMovie.setRecommeded(true);
			entityManager.merge(userMovie);
			entityManager.getTransaction().commit();

		}
		System.out.println("flag=" + flag);
		if (flag == 0) {
			entityManager.getTransaction().begin();
			// user and movie object will add to usermovie when implementing controllers
			Movie movie = entityManager.find(Movie.class, 7);
			User user = entityManager.find(User.class, 1);
			System.out.println("user" + user);
			userMovie.setMovie(movie);
			userMovie.setUser(user);
			userMovie.setRecommeded(true);
			entityManager.persist(userMovie);
			entityManager.getTransaction().commit();
		}

		entityManager.close();

	}

	@Override
	public List<UserWatchListItems> findWatchList(int watchlistId) {
		System.out.println("Inside findWatchList() method in UserRepository");
		EntityManager entityManager = factory.createEntityManager();
		entityManager.getTransaction().begin();
		// find movies in watchlist of a user
		List<UserWatchListItems> userWatchlistsItems = entityManager
				.createNativeQuery("select * from lt_user_watchlist_items where watchlist_id=" + watchlistId,
						UserWatchListItems.class)
				.getResultList();
		System.out.println("watchListItems" + userWatchlistsItems);

		entityManager.getTransaction().commit();
		entityManager.close();
		return userWatchlistsItems;
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
		for (UserMovie usermovie : userMovie) {
			if (usermovie.isFavourite() == true) {
				Movie movie = usermovie.getMovie();
				movies.add(movie);
			}
		}
		System.out.println("favourite movies" + movies);
		entityManager.close();
		return movies;
	}

	@Override
	public List<UserMovie> findRatings(int userId) {
		System.out.println("Inside findRatings() method in UserRepository");
		EntityManager entityManager = factory.createEntityManager();
		entityManager.getTransaction().begin();
		// find list of movies rated by the user
		List<UserMovie> userMovies = entityManager.createNativeQuery(
				"select * from lt_user_movie where user_id=" + userId + " and rating_given IS NOT NULL",
				UserMovie.class).getResultList();
		// print usermovie list
		System.out.println("usermovies :" + userMovies);
		entityManager.close();
		return userMovies;
	}

	@Override
	public List<UserMovie> findFeedbacks(int userId) {
		System.out.println("Inside findFeedbacks() method in UserRepository");
		EntityManager entityManager = factory.createEntityManager();
		entityManager.getTransaction().begin();
		// find list of usermovies
		List<UserMovie> userMovies = entityManager
				.createNativeQuery("select * from lt_user_movie where user_id=" + userId + " and review IS NOT NULL",
						UserMovie.class)
				.getResultList();
		// print usermovie list
		System.out.println("usermovies :" + userMovies);
		entityManager.close();
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
		EntityManager entityManager = factory.createEntityManager();
		entityManager.getTransaction().begin();
		entityManager.clear();
		user.setEmail("athira123@gmail.com");
		entityManager.merge(user);
		entityManager.getTransaction().commit();

	}

	@Override
	public void updatePassword(User user) {
		System.out.println("Inside updatePassword() method in UserRepository");

		EntityManager entityManager = factory.createEntityManager();
		entityManager.getTransaction().begin();
		user.setPassword("ak123");
		entityManager.merge(user);
		entityManager.getTransaction().commit();
		entityManager.close();

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

		// repo.rateMovie(us);
		// repo.findProfile(1);
		// User user = repo.findProfile(1);
		//repo.giveMovieFeedback(us);
		// repo.addMovieToWatchlist(1,5);
		// repo.updatePassword(user);
		// repo.addMovieToFavourites(us);
		 repo.recommendMovie(us);
		// repo.findWatchList(1);
		// repo.findFavourites(2);
		// repo.findRatings(1);
		// repo.updateProfile(user);
	}
}
