package com.crud.rest.dao;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;

import com.crud.rest.beans.Movies;
import com.crud.rest.beans.MyCustomer;

public class MoviesDaoImpl implements MoviesDao{

	@Autowired
	private SessionFactory sessionFactory;

	//setter for sessionFactory
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	public Movies getMovies() {
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		Movies movies = new Movies();
		String hql = "from com.crud.rest.beans.Movies where movieId='1' ";
		try {
			Query query = session.createQuery(hql);
			movies = (Movies) query.uniqueResult();
			transaction.commit();
			session.close();
		} catch (Exception e) {
			transaction.rollback();
			session.close();
		}
		return movies;
	}

	@Override
	public void setMovies(Movies movies) {
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		if (movies != null) {
			try {
				session.save(movies);
				transaction.commit();
			} catch (Exception e) {
				transaction.rollback();
				session.close();
			}

		}

		
	}
}
