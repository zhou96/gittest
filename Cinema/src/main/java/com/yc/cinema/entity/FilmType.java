package com.yc.cinema.entity;

public class FilmType {
    private Integer typeid;

    private String typename;

    public Integer getTypeid() {
        return typeid;
    }

    public void setTypeid(Integer typeid) {
        this.typeid = typeid;
    }

    public String getTypename() {
        return typename;
    }

    public void setTypename(String typename) {
        this.typename = typename == null ? null : typename.trim();
    }

	@Override
	public String toString() {
		return "\nFilmType [typeid=" + typeid + ", typename=" + typename + "]";
	}
    
}