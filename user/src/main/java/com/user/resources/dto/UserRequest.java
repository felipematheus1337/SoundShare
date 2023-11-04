package com.user.resources.dto;


import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
@Getter
@Setter
public class UserRequest {

    public String nomeUsuario;

    public String email;
}
