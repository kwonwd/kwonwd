package com.ssafy.ws.step2;

public class SeriesMovie extends Movie {
	//코드를 작성해주세요. 
	private int seriesNum;
	private String episode;
	
	public SeriesMovie() {
		
	}
	public SeriesMovie(int id, String title, String director, String genre, int runningTime, int seriesNum, String episode) {
		super(id, title, director, genre, runningTime);
		this.episode =episode;
		this.seriesNum =seriesNum;
	}
	
	public int getSeriesNum() {
		return seriesNum;
	}
	public void setSeriesNum(int seriesNum) {
		this.seriesNum = seriesNum;
	}
	public String getEpisode() {
		return episode;
	}
	public void setEpisode(String episode) {
		this.episode = episode;
	}
	
	@Override
	public String toString() {
		return "Movie [id="+getId()+", title="+ getTitle() + ", director="+ getDirector() +
					", genre="+ getGenre() +", runningTime="+  getRunningTime() +", seriesNum=" + seriesNum + ", episode=" + episode+ "]";
	}
	
	
}
