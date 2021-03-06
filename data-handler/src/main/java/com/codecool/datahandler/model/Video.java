package com.codecool.datahandler.model;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Video {
    private Long id;
    private String name;
    private String url;
}
