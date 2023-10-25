package com.wishlist.demo.VideoGame;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
/**
 *
 * @author Marcus Thompson
 */
@Entity
@Table(name = "/videoGame")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter

public class VideoGame {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String name;
    private String type;
    private double price;

    public VideoGame(String name, String console, double price) {
        this.name = name;
        this.type = type;
        this.price = price;
    }
}
