package com.example.tasklist.domain.user;

import lombok.Data;

@Data
public class Task {
    private  Long id;
    private String title;
    private String description;
    
}
