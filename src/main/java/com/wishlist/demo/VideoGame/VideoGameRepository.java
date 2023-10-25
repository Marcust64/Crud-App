package com.wishlist.demo.VideoGame;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 *
 * @author Marcus Thompson
 */
@Repository
public interface VideoGameRepository extends JpaRepository<VideoGame, Long>{
    
    public List<VideoGame> findByName(String name);

    @Query("SELECT vg FROM VideoGame vg WHERE CONCAT(vg.name, vg.type) LIKE %?1%")
    public List<VideoGame> search(String keyword);
    
}
