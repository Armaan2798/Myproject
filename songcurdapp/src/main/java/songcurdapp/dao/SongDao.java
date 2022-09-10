package songcurdapp.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;

import songcurdapp.model.Song;

@Component
public class SongDao {
	@Autowired
	private HibernateTemplate hibernateTemplate;

	// create
	@Transactional
	public void createSong(Song song) {
		this.hibernateTemplate.saveOrUpdate(song);;
	}
	
	@Transactional
	public void updateSong(Song song) {
		this.hibernateTemplate.update(song);
	}

	// getting the all songs
	public List<Song> getSongs() {
		List<Song> songs = this.hibernateTemplate.loadAll(Song.class);
		//System.out.println(songs);
		return songs;

	}

	// delete a single song
	@Transactional
	public void deleteSong(int songId) {
		Song s = this.hibernateTemplate.load(Song.class, songId);
		this.hibernateTemplate.delete(s);
	}

	/*
	 * // to get the single song public Song getSong(String songArtistic) { return
	 * this.hibernateTemplate.get(Song.class, songArtistic); }
	 */

	public Song getSong(int songId) {
		// TODO Auto-generated method stub
		return this.hibernateTemplate.get(Song.class, songId);
	}
	
	
}
