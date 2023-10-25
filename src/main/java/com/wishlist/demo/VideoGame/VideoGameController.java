package com.wishlist.demo.VideoGame;

import com.wishlist.demo.VideoGame.VideoGame;
import com.wishlist.demo.VideoGame.VideoGameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

/**
 *
 * @author Marcus Thompson
 */
@Controller
@RequestMapping("/videoGame")
public class VideoGameController {
    
    @Autowired
    VideoGameService videoGameService;

    @GetMapping("/all")
    public String getAllvideoGame(Model model) {
        model.addAttribute("videoGameList",
                videoGameService.getAllVideoGame());
        return "videoGame/list-videoGame";
    }

    @GetMapping("/search")
    public String getVideoGame(Model model, @Param("keyword") String keyword) {
        model.addAttribute("videoGameList",
                videoGameService.getAllVideoGame(keyword));
        model.addAttribute("keyword", keyword);
        return "videoGame/list-videoGame";
    }

    @GetMapping("/id={videoGameId}")
    public String getVideoGame(@PathVariable long videoGameId, Model model) {
        model.addAttribute("videoGame",
                videoGameService.getVideoGame(videoGameId));
        return "videoGame/videoGame-detail";
    }

    @GetMapping("/delete/id={videoGameId}")
    public String deleteVideoGame(@PathVariable long videoGameId, Model model) {
        videoGameService.deleteVideoGame(videoGameId);
        return "redirect:/videoGame/all";
    }

    @PostMapping("/create")
    public String createVideoGame(VideoGame videoGame) {

        videoGameService.saveVideoGame(videoGame);
        return "redirect:/videoGame/all";
    }

    @PostMapping("/update")
    public String updateVideoGame(VideoGame videoGame) {
        videoGameService.saveVideoGame(videoGame);
        return "redirect:/videoGame/all";
    }

    @GetMapping("/new-videoGame")
    public String newVideoGameForm(Model model) {
        return "videoGame/new-videoGame";
    }

    @GetMapping("/update/id={videoGameId}")
    public String updateVideoGameForm(@PathVariable long videoGameId, Model model) {
        model.addAttribute("videoGame",
                videoGameService.getVideoGame(videoGameId));
        return "videoGame/update-videoGame";
    }
}
