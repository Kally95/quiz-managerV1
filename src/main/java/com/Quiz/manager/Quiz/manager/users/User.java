package com.Quiz.manager.Quiz.manager.users;

import lombok.*;

@ToString
@Getter
@Setter
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
public class User {
    private Long id;
    private String username;
    private String email;
    private String password;
    private Permission permission;
}
