package com.user.domain;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Set;

@Document
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class User {


    @Id
    public String id;

    public String nomeUsuario;

    public String email;

    public Set<Musicas> musicas;



}
