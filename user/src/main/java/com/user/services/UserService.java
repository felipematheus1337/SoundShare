package com.user.services;

import com.user.domain.Musicas;
import com.user.resources.dto.UserDTO;
import com.user.resources.dto.UserRequest;

import java.util.List;
import java.util.Optional;

public interface UserService {

    UserDTO createUser(  UserRequest user);

    List<UserDTO> listAll();

    Optional<UserDTO> getOneUser(String id);

    List<Musicas> findMusicasByUserIdAndMusicasNomeMusica(String userId, String nomeMusica);

    List<Musicas> findMusicasByUserIdAndMusicasGenero(String userId, String genero);

    List<Musicas> findMusicasByUserIdAndMusicasAutor(String userId, String autor);

}
