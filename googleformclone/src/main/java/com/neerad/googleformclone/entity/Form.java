package com.neerad.googleformclone.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity
public class Form {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int  id;
    private String title;
    @OneToMany(mappedBy = "form",cascade = CascadeType.ALL)

    private List<Question> questions;
    public void addQuestion(Question question){
        questions.add(question); // 1. Adds the question to the Form's list
        question.setForm(this); // 2. Sets this Form as the question's parent

    }
}
