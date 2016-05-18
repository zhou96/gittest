package com.yc.cinema.entity;

import java.io.Serializable;
import java.math.BigDecimal;

public class FilmBean implements Serializable{
	private static final long serialVersionUID = -2786686780969638113L;
	    private String filmname;
	    private String typeid;
	    private String actor;
	    private String director;
	    private Double minprice;
	    private Double maxprice;

		public String getFilmname() {
			return filmname;
		}

		public void setFilmname(String filmname) {
			this.filmname = filmname;
		}

		public String getTypeid() {
			return typeid;
		}

		public void setTypeid(String typeid) {
			this.typeid = typeid;
		}

		public String getActor() {
			return actor;
		}

		public void setActor(String actor) {
			this.actor = actor;
		}

		public String getDirector() {
			return director;
		}

		public void setDirector(String director) {
			this.director = director;
		}

		public Double getMinprice() {
			return minprice;
		}

		public void setMinprice(Double minprice) {
			this.minprice = minprice;
		}

		public Double getMaxprice() {
			return maxprice;
		}

		public void setMaxprice(Double maxprice) {
			this.maxprice = maxprice;
		}

		public static long getSerialversionuid() {
			return serialVersionUID;
		}

		@Override
		public String toString() {
			return "\nFilmBean [filmname=" + filmname
					+ ", typeid=" + typeid + ", actor=" + actor + ", director="
					+ director + ", minprice=" + minprice + ", maxprice="
					+ maxprice + "]";
		}

}
