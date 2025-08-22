package com.devprojeto.dslist.services;

import com.devprojeto.dslist.dto.GameDTO;
import com.devprojeto.dslist.dto.GameListDTO;
import com.devprojeto.dslist.dto.GameMinDTO;
import com.devprojeto.dslist.entities.Game;
import com.devprojeto.dslist.entities.GameList;
import com.devprojeto.dslist.repository.GameListRepository;
import com.devprojeto.dslist.repository.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class GameListService {

    @Autowired
    private GameListRepository gameListRepository;

    @Transactional(readOnly = true)
    public List<GameListDTO> findAll() {
        List<GameList> result = gameListRepository.findAll();
        return result.stream().map(x -> new GameListDTO(x)).toList();
    }


}


