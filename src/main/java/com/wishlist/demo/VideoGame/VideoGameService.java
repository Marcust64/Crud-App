package com.wishlist.demo.VideoGame;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;
/**
 *
 * @author Marcus Thompson
 */
@Service
public class VideoGameService {
     @Autowired
    private VideoGameRepository repo;

    /**
     * Get all video games.
     *
     * @return the list of video games.
     */
    public List<VideoGame> getAllVideoGame() {
        return repo.findAll();
    }

    /**
     * Get all games that match the keyword.
     *
     * @param keyword the search term.
     * @return the list of games.
     */
    public List<VideoGame> getAllVideoGame(String keyword) {
        if (keyword != null) {
            return repo.search(keyword);
        }
        return repo.findAll();
    }

    /**
     * Get a single game by its ID
     *
     * @return the game
     */
    public VideoGame getVideoGame(long videoGameId) {
        return repo.getReferenceById(videoGameId);
    }

    /**
     * Delete a single game by its ID
     *
     * @param videoGameId
     */
    public void deleteVideoGame(long videoGameId) {
        repo.deleteById(videoGameId);
    }

    /**
     * Save a product entry.
     *
     * @param videoGame
     */
    public void saveVideoGame(VideoGame videoGame) {
        repo.save(videoGame);
    }

}
