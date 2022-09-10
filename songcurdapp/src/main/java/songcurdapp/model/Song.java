package songcurdapp.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Song {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int songId;
	private String artistic;
	private String song;
	private String dateofRealese;
	private String rating;

	
	public Song() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Song(int songId, String artistic, String song, String dateofRealese, String rating) {
		super();
		this.songId = songId;
		this.artistic = artistic;
		this.song = song;
		this.dateofRealese = dateofRealese;
		this.rating = rating;
	}


	@Override
	public String toString() {
		return "Song [songId=" + songId + ", artistic=" + artistic + ", song=" + song + ", dateofRealese="
				+ dateofRealese + ", rating=" + rating + "]";
	}


	public int getSongId() {
		return songId;
	}


	public void setSongId(int songId) {
		this.songId = songId;
	}


	public String getArtistic() {
		return artistic;
	}


	public void setArtistic(String artistic) {
		this.artistic = artistic;
	}


	public String getSong() {
		return song;
	}


	public void setSong(String song) {
		this.song = song;
	}


	public String getDateofRealese() {
		return dateofRealese;
	}


	public void setDateofRealese(String dateofRealese) {
		this.dateofRealese = dateofRealese;
	}


	public String getRating() {
		return rating;
	}


	public void setRating(String rating) {
		this.rating = rating;
	}
	
	
}
