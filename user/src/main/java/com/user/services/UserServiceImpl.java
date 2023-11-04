package com.user.services;


import com.user.domain.Musicas;
import com.user.domain.repository.UserRepository;
import com.user.resources.dto.UserDTO;
import com.user.resources.dto.UserRequest;
import com.user.resources.mapper.UserMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository repository;

    private final UserMapper mapper;


    @Override
    public UserDTO createUser(UserRequest user) {

       var usuario = mapper.requestToUser(user);

       return mapper.toDTO(repository.save(usuario));
    }

    @Override
    public List<UserDTO> listAll() {
        return mapper.toDTOList(repository.findAll());
    }

    @Override
    public Optional<UserDTO> getOneUser(String id) {
        return Optional.ofNullable(mapper.toDTO(repository.findById(id).get()));
    }

    @Override
    public List<Musicas> findMusicasByUserIdAndMusicasNomeMusica(String userId, String nomeMusica) {
        return null;
    }

    @Override
    public List<Musicas> findMusicasByUserIdAndMusicasGenero(String userId, String genero) {
        return null;
    }

    @Override
    public List<Musicas> findMusicasByUserIdAndMusicasAutor(String userId, String autor) {
        return null;
    }
}
