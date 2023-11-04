package com.user.resources.dto;

import com.user.domain.Musicas;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;


@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class UserDTO {

    public String id;

    public String nomeUsuario;


    public String email;


    public Set<Musicas> musicas;



}
