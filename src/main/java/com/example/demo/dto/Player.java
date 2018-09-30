package com.example.demo.dto;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
@Entity
public class Player {
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator = "player_Sequence")
    @SequenceGenerator(name = "player_Sequence", sequenceName = "PLAYER_SEQ")
    private Long id;
    @Column(name = "name")
    private String name;
    @Column(name = "num")
    private int num;
    @Column(name = "position")
    private String position;
    public Player() {
    }
        // getters/setters
}