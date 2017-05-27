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
 * MovieGenere generated by hbm2java
 */
@Entity
@Table(name="movie_genere"
    ,catalog="mywebsite"
)
public class MovieGenere  implements java.io.Serializable {


     private Long movieGenereId;
     private Genre genre;
     private Movies movies;
     private Character status;
     private Date createdDate;

    public MovieGenere() {
    }

    public MovieGenere(Genre genre, Movies movies, Character status, Date createdDate) {
       this.genre = genre;
       this.movies = movies;
       this.status = status;
       this.createdDate = createdDate;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="MOVIE_GENERE_ID", unique=true, nullable=false)
    public Long getMovieGenereId() {
        return this.movieGenereId;
    }
    
    public void setMovieGenereId(Long movieGenereId) {
        this.movieGenereId = movieGenereId;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="GENRE_ID")
    public Genre getGenre() {
        return this.genre;
    }
    
    public void setGenre(Genre genre) {
        this.genre = genre;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="MOVIE_ID")
    public Movies getMovies() {
        return this.movies;
    }
    
    public void setMovies(Movies movies) {
        this.movies = movies;
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

