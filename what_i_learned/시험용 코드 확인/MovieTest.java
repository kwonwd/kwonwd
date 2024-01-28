package com.ssafy.ws.step2;

public class MovieTest {

	public static void main(String[] args) {
		//코드를 작성해주세요. 
//		Movie movie1 = new Movie(20179985, "코코", "Lee Unkrich", "Animation",126);
//		Movie movie2 = new Movie(20190280, "날씨의 아이", "Makoto Shinkai", "Animation",112);
//		Movie movie3 = new Movie(20127494, "늑대아이", "Mamoru Hosoda", "Animation",117);
//		SeriesMovie smovie1 = new SeriesMovie(20020222, "해리포터와 비밀의 방", "Chris Columbus","Fantasy", 161, 2,"비밀의 방");
//		SeriesMovie smovie2 = new SeriesMovie(20010291, "해리포터와 마법사의 돌", "Chris Columbus","Fantasy", 152, 1,"마법사의 돌");
//		
//		IMovieManager mm = MovieManagerImpl.getInstance();
//		
//		mm.add(movie1);
//		mm.add(movie2);
//		mm.add(movie3);
//		mm.add(smovie1);
//		mm.add(smovie2);
//		
//		mm.saveData();
//		
//		
		IMovieManager mm = MovieManagerImpl.getInstance();
		System.out.println("-------------getList-------------");
		Movie[] movieList = mm.getMovies();
		for (Movie m : movieList)
			System.out.println(m);
		System.out.println();
		System.out.println("-------------getSeriesList-------------");
		for (SeriesMovie sm : mm.getSeriesMovies())
			System.out.println(sm);
		System.out.println();
		System.out.println("등록된 영화들의 평균 상영시간 : " + mm.getRunningTimeAvg());
		System.out.println();
		System.out.println("-------------searchByTitle 나니아 로검색-------------");
		
		try {
			for(Movie m : mm.searchByTitle("나니아")) {
				System.out.println(m.toString());
			}
		} catch (TitleNotFoundException e) {
//			System.out.println("Error Message");
//			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		
	}
}
