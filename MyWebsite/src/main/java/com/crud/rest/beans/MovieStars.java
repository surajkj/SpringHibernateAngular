package com.crud.rest.beans;
// Generated May 26, 2017 2:03:11 PM by Hibernate Tools 4.3.1


import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * MovieStars generated by hbm2java
 */
@Entity
@Table(name="movie_stars"
    ,catalog="mywebsite"
)
public class MovieStars  implements java.io.Serializable {


     /**
	 * 
	 */
	private Long movieCastId;
     private Movies movies;
     private Stars stars;
     private Character status;
     private Date createdDate;

    public MovieStars() {
    }

    public MovieStars(Movies movies, Stars stars, Character status, Date createdDate) {
       this.movies = movies;
       this.stars = stars;
       this.status = status;
       this.createdDate = createdDate;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="MOVIE_CAST_ID", unique=true, nullable=false)
    public Long getMovieCastId() {
        return this.movieCastId;
    }
    
    public void setMovieCastId(Long movieCastId) {
        this.movieCastId = movieCastId;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="MOVIE_ID")
    public Movies getMovies() {
        return this.movies;
    }
    
    public void setMovies(Movies movies) {
        this.movies = movies;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="STARS_ID")
    public Stars getStars() {
        return this.stars;
    }
    
    public void setStars(Stars stars) {
        this.stars = stars;
    }

    
    @Column(name="STATUS", length=1)
    public Character getStatus() {
        return this.status;
    }
    
    public void setStatus(Character status) {
        this.status = status;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="CREATED_DATE", length=19)
    public Date getCreatedDate() {
        return this.createdDate;
    }
    
    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }




}

