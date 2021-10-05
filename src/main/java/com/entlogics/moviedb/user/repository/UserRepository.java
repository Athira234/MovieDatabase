package com.entlogics.moviedb.user.repository;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.springframework.stereotype.Repository;

import com.entlogics.moviedb.movie.entities.Movie;
import com.entlogics.moviedb.user.entities.User;
import com.entlogics.moviedb.user.entities.UserMovie;
import com.entlogics.moviedb.user.entities.UserWatchList;
import com.entlogics.moviedb.user.entities.UserWatchListItems;

@Repository
public class UserRepository implements IUserRepository {
	EntityManagerFactory factory = Persistence.createEntityManagerFactory("MDB");

	@Override
	public void rateMovie(UserMovie usermovie) {
		System.out.println("Inside rateMovie() method in UserRepository");
		int flag = 0;
		int id = 0;
		LocalDate localDate = LocalDate.now();
		EntityManager entityManager = factory.createEntityManager();
		entityManager.getTransaction().begin();
		List<UserMovie> userMovie = entityManager.createNativeQuery("select * from tt_user_movie", UserMovie.class)
				.getResultList();
		entityManager.getTransaction().commit();
		// iterate each UserMovie object
		// if the row with particular user_id and movie_id exists ,update the
		// rating_given else add new row
		Movie movie = usermovie.getMovie();
		User user = usermovie.getUser();
		int userId=user.getUserId();
		int movieId=movie.getMovieId();
		for (UserMovie usermovie1 : userMovie) {
			System.out.println(usermovie1);
			if (usermovie != null) {
				Movie movie1 = usermovie1.getMovie();
				User user1 = usermovie1.getUser();
				// hard coded values will update when implementing user controller
				if (user1.getUserId()==userId && movie1.getMovieId()==movieId) {
					System.out.println("update existing row");
					// id = usermovie1.getId();
					entityManager.getTransaction().begin();
					usermovie1.setRatingGiven(usermovie.getRatingGiven());
					usermovie1.setRatingGivenDate(localDate);
					entityManager.merge(usermovie1);
					entityManager.getTransaction().commit();

					flag = 1;
					break;
				}
			}
		}

		System.out.println("flag=" + flag);
		if (flag == 0) {
			entityManager.getTransaction().begin();
			// user and movie object will add to usermovie when implementing controllers
			Movie movie1 = entityManager.find(Movie.class, movieId);
			User user1 = entityManager.find(User.class, userId);
			UserMovie usermovie2=new UserMovie();
			System.out.println("user" + user);
			usermovie2.setMovie(movie1);
		    usermovie2.setUser(user1);
		    usermovie2.setRatingGivenDate(localDate);
		     usermovie2.setRatingGiven(usermovie.getRatingGiven());
			// usermovie.setReview("");
			entityManager.persist(usermovie2);
			entityManager.getTransaction().commit();
		}

		entityManager.close();
	}

	@Override
	public void giveMovieFeedback(UserMovie userMovie) {
		System.out.println("Inside giveMovieFeedback() method in UserRepository");
		LocalDate localDate = LocalDate.now();
		int flag = 0;
		int id = 0;
		EntityManager entityManager = factory.createEntityManager();
		entityManager.getTransaction().begin();
		List<UserMovie> usermovies = entityManager.createNativeQuery("select * from tt_user_movie", UserMovie.class)
				.getResultList();
		entityManager.getTransaction().commit();
		Movie movie = userMovie.getMovie();
		User user = userMovie.getUser();
		int userId=user.getUserId();
		int movieId=movie.getMovieId();
		// iterate each UserMovie object
		// if the row with particular user_id and movie_id exists ,update the
		// feedback else add new row

		for (UserMovie usermovie1 : usermovies) {
			System.out.println(usermovie1);
			if (usermovies != null) {
				Movie movie1 = usermovie1.getMovie();
				User user1 = usermovie1.getUser();
				// hard coded values will update when implementing user controller
				if (user1.getUserId() == userId && movie1.getMovieId() == movieId) {
					System.out.println("update existing row");
					entityManager.getTransaction().begin();
					usermovie1.setReview(userMovie.getReview());
					usermovie1.setRatingGivenDate(localDate);
					entityManager.merge(usermovie1);
					entityManager.getTransaction().commit();
					flag = 1;
					break;
				}
			}
		}

		System.out.println("flag=" + flag);
		if (flag == 0) {
			entityManager.getTransaction().begin();
			// user and movie object will add to usermovie when implementing controllers
			Movie movie1 = entityManager.find(Movie.class, movieId);
			User user1 = entityManager.find(User.class, userId);
			UserMovie usermovie2=new UserMovie();
			System.out.println("user" + user);
			usermovie2.setMovie(movie1);
		    usermovie2.setUser(user1);
		     usermovie2.setReview(userMovie.getReview());
		     usermovie2.setRatingGivenDate(localDate);
			// usermovie.setReview("");
			entityManager.persist(usermovie2);
			entityManager.getTransaction().commit();
		}

		entityManager.close();

	}

	@Override
	public void addMovieToWatchlist( UserWatchListItems watchListItem) {
		System.out.println("Inside addMovieToWatchlist() method in UserRepository");
		LocalDate localDate = LocalDate.now();
		EntityManager entityManager = factory.createEntityManager();
		entityManager.getTransaction().begin();
		watchListItem.setDateAdded(localDate);
		watchListItem.setNotes("");
		entityManager.persist(watchListItem);
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
		List<UserMovie> userMovies = entityManager.createNativeQuery("select * from tt_user_movie", UserMovie.class)
				.getResultList();
		entityManager.getTransaction().commit();
		Movie movie = userMovie.getMovie();
		User user = userMovie.getUser();
		
		// iterate each UserMovie object
		// if the row with particular user_id and movie_id exists ,update the is_favourite else add new row
          
		for (UserMovie usermovie1 : userMovies) {
			System.out.println(usermovie1);
			if (usermovie1 != null) {
				Movie movie1 = usermovie1.getMovie();
				User user1 = usermovie1.getUser();
				// hard coded values will update when implementing user controller
				if (user1.getUserId() ==user.getUserId() && movie1.getMovieId()==(movie.getMovieId())) {
					System.out.println("update existing row");
					entityManager.getTransaction().begin();
					usermovie1.setFavourite(true);
					entityManager.merge(usermovie1);
					entityManager.getTransaction().commit();
					flag = 1;
					break;
				}
			}
		}

		System.out.println("flag=" + flag);
		if (flag == 0) {
			entityManager.getTransaction().begin();
			// user and movie object will add to usermovie when implementing controllers
			//Movie movie = entityManager.find(Movie.class, 7);
		//	User user = entityManager.find(User.class, 1);
			//System.out.println("user" + user);
			//userMovie.setMovie(movie);
			//userMovie.setUser(user);
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
		List<UserMovie> userMovies = entityManager.createNativeQuery("select * from tt_user_movie", UserMovie.class)
				.getResultList();
		entityManager.getTransaction().commit();
		Movie movie = userMovie.getMovie();
		User user = userMovie.getUser();
		// iterate each UserMovie object
		// if the row with particular user_id and movie_id exists ,update the is Recommend
		

		for (UserMovie usermovie1 : userMovies) {
			System.out.println(usermovie1);
			if (usermovie1 != null) {
				Movie movie1 = usermovie1.getMovie();
				User user1 = usermovie1.getUser();
				
				// hard coded values will update when implementing user controller
				if (user1.getUserId() == user.getUserId() && movie1.getMovieId() == movie.getMovieId()) {
					System.out.println("update existing row");
					entityManager.getTransaction().begin();
					usermovie1.setRecommeded(true);
					entityManager.merge(usermovie1);
					entityManager.getTransaction().commit();
					flag = 1;
					break;
				}
			}
		}

		System.out.println("flag=" + flag);
		if (flag == 0) {
			entityManager.getTransaction().begin();
			// user and movie object will add to usermovie when implementing controllers
			entityManager.persist(userMovie);
			entityManager.getTransaction().commit();
		}

		entityManager.close();

	}
	
	public List<UserWatchList> findWatchListsOfUser(int userId)
	{
		System.out.println("Inside findWatchLists() method in UserRepository");
		EntityManager entityManager = factory.createEntityManager();
		entityManager.getTransaction().begin();
		List<UserWatchList> watchlists=entityManager.createNativeQuery("select * from dt_user_watchlist where user_id=" + userId,
						UserWatchList.class).getResultList();	
		System.out.println("User's watchLists"+watchlists);
	   return watchlists;
	}
	
	

	@Override
	public List<UserWatchListItems> findWatchList(int userId) {
		System.out.println("Inside findWatchList() method in UserRepository");
		EntityManager entityManager = factory.createEntityManager();
		entityManager.getTransaction().begin();
		List<UserWatchList> watchlists=entityManager.createNativeQuery("select * from dt_user_watchlist where user_id=" + userId,
						UserWatchList.class).getResultList();
		List<UserWatchListItems> items=new ArrayList<UserWatchListItems>();
		// find movies in watchlist of a user
		for(UserWatchList watchlist:watchlists)
		{
		List<UserWatchListItems> userWatchlistsItems = entityManager
				.createNativeQuery("select * from tt_user_watchlist_items where watchlist_id=" + watchlist.getWatchlistId(),
						UserWatchListItems.class)
				.getResultList();
		
		items.addAll(userWatchlistsItems);
		
		}
		System.out.println("watchListItems" +items);

		entityManager.getTransaction().commit();
		entityManager.close();
		return items;
	}

	@Override
	public List<Movie> findFavourites(int userId) {
		System.out.println("Inside findFavourites() method in UserRepository");
		EntityManager entityManager = factory.createEntityManager();
		entityManager.getTransaction().begin();
		List<UserMovie> userMovie = entityManager
				.createNativeQuery("select * from tt_user_movie where user_id=" + userId, UserMovie.class)
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
				"select * from tt_user_movie where user_id=" + userId + " and rating IS NOT NULL",
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
				.createNativeQuery("select * from tt_user_movie where user_id=" + userId + " and review IS NOT NULL",
						UserMovie.class)
				.getResultList();
		// print usermovie list
		System.out.println("usermovies :" + userMovies);
		entityManager.close();
		return userMovies;
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
		try {
			
			entityManager.getTransaction().begin();
			entityManager.merge(user);
			entityManager.getTransaction().commit();
		} catch (Exception e) {
			entityManager.getTransaction().rollback();
			e.printStackTrace();
		}

	}

	@Override
	public void updatePassword(User user) {
		System.out.println("Inside updatePassword() method in UserRepository");

		EntityManager entityManager = factory.createEntityManager();
		entityManager.getTransaction().begin();
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
	//repo.findProfile(1);
		// User user = repo.findProfile(1);
		// repo.giveMovieFeedback(us);
		// repo.addMovieToWatchlist(1,5);
		// repo.updatePassword(user);
		// repo.addMovieToFavourites(us);
		//repo.recommendMovie(us);
		// repo.findWatchList(1);
		// repo.findFavourites(2);
		// repo.findRatings(1);
		// repo.updateProfile(user);
		repo.findWatchListsOfUser(1);
	}
}