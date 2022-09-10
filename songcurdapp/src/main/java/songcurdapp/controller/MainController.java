package songcurdapp.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.view.RedirectView;

import songcurdapp.dao.SongDao;
import songcurdapp.model.Song;

@Controller
public class MainController 
{
	@Autowired
	private SongDao  songDao;
	@RequestMapping("/")
   public String home(Model m)
   {
		List<Song> songs=songDao.getSongs();
		m.addAttribute("songs", songs);
	  return"index";
   }
	
	// show the song form 
	@RequestMapping("/add-Song")
	public String addSong(Model m)
	{
		m.addAttribute("title", "Add Product");
		return "addSong";
	}
	
	//handle song song form
	@RequestMapping(value = "/handle-song", method = RequestMethod.POST)
	public RedirectView handleProduct(@ModelAttribute Song song, HttpServletRequest request) {
		//System.out.println(song);
		songDao.createSong(song);
		RedirectView redirectView = new RedirectView();
		redirectView.setUrl(request.getContextPath() + "/");
		return redirectView;
	}
	
	// delete handler
		@RequestMapping("/delete/{songId}")  
		public RedirectView deleteProduct(@PathVariable("songId") int songId, HttpServletRequest request) {
			this.songDao.deleteSong(songId);
			RedirectView redirectView = new RedirectView();
			redirectView.setUrl(request.getContextPath() + "/");
			return redirectView;
			
		}
		
		@RequestMapping("/update/{songId}")
		public String updateForm(@PathVariable("songId") int songId,Model model)
	{
			Song song = songDao.getSong(songId);
			model.addAttribute("song", song);
			return "update_form";
			
			
			
		}
}
