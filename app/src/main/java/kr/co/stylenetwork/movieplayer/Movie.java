/*
* 이 클래스는 로직을 담기 위함이 아니라, 단순히 데이터만을 담기 위한
* 클래스로 사용하기 위함이다. DTO, VO
* */
package kr.co.stylenetwork.movieplayer;
public class Movie {
    private int movie_id;
    private String title;
    private String actor;
    private String openDay;
    private String iconExtend;
    private String fileExtend;

    public String getActor() {
        return actor;
    }

    public void setActor(String actor) {
        this.actor = actor;
    }

    public String getFileExtend() {
        return fileExtend;
    }

    public void setFileExtend(String fileExtend) {
        this.fileExtend = fileExtend;
    }

    public String getIconExtend() {
        return iconExtend;
    }

    public void setIconExtend(String iconExtend) {
        this.iconExtend = iconExtend;
    }

    public int getMovie_id() {
        return movie_id;
    }

    public void setMovie_id(int movie_id) {
        this.movie_id = movie_id;
    }

    public String getOpenDay() {
        return openDay;
    }

    public void setOpenDay(String openDay) {
        this.openDay = openDay;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
