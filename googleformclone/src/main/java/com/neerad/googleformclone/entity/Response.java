package com.neerad.googleformclone.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
public class Response {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne // Many Response in one form
    @JoinColumn(name = "form_id")
    private Form form;

    @OneToMany // One Response Many Answers
    private List<Answer> answers;
}
