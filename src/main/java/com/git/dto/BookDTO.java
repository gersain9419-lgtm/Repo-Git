package com.git.dto;


import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class BookDTO {

private String title;
private String author;
private Integer pages;
private Integer price;

}
