package chap04;

public class Song {
	private String title;
	private String artist;
	private String album;
	private String composer[];
	private String year;
	private String track;
	
	public Song(String title, String artist, String album, String[] composer, String year, String track) {
		this.title = title;
		this.artist = artist;
		this.album = album;
		this.composer = composer;
		this.year = year;
		this.track = track;
	}

	public Song() {
		
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getArtist() {
		return artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

	public String getAlbum() {
		return album;
	}

	public void setAlbum(String album) {
		this.album = album;
	}

	public String[] getComposer() {
		return composer;
	}

	public void setComposer(String[] composer) {
		this.composer = composer;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public String getTrack() {
		return track;
	}

	public void setTrack(String track) {
		this.track = track;
	}
	
	public void show() {
		System.out.println("제목 : "+ title);
		System.out.println("가수 : "+ artist);
		System.out.println("앨범 : "+ album);
		
		for(int i = 0; i<composer.length;i++) {
		System.out.println("작곡가 : "+ composer[i]);
		}
		
		System.out.println("연도 : "+year);
		System.out.println("트랙 번호 : "+track);
	}
	
	
	
	
}
