package com.user.domain.repository;


import com.user.domain.Musicas;
import com.user.domain.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends MongoRepository<User, String> {

    List<Musicas> findMusicasByUserIdAndMusicasNomeMusica(String userId, String nomeMusica);

    List<Musicas> findMusicasByUserIdAndMusicasGenero(String userId, String genero);

    List<Musicas> findMusicasByUserIdAndMusicasAutor(String userId, String autor);

}
