package edu.ijse.gdse71.library.dto;

import lombok.*;

import java.sql.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString

public class AuthorDTO {
    private String authorID;
    private String name;
    private String biography;
    private Date regDate;

}
