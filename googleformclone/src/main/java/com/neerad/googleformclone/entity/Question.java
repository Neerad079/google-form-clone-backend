package com.neerad.googleformclone.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Question {
       @Id
       @GeneratedValue(strategy = GenerationType.IDENTITY) // auto increments id
       private int id;
       private String questionText;
       @ManyToOne
       @JoinColumn(name = "form_id")
       private Form form;
}
