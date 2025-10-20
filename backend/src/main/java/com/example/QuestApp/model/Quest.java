package com.example.QuestApp.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalTime;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Quest {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column
    private String description;

    @Column(nullable = false)
    private boolean important;

    @Column(nullable = false)
    private boolean completed;

    @Column(columnDefinition = "LONGTEXT") // Set the column type to LONGTEXT
    private String imageUrl; // Store the path or URL to the image

    @Column(nullable = false)
    private boolean repeatable; // Whether the quest is repeatable

    @Column(columnDefinition = "TEXT") // Store days as a comma-separated string (e.g., 'MONDAY,TUESDAY')
    private String repeatDays; // Days of the week for repeatable quests

    private LocalTime repeatTime; // Time when the quest repeats

    // Getter and Setter methods can be added as needed
}
