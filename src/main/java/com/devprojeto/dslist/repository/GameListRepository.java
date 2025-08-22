package com.devprojeto.dslist.repository;

import com.devprojeto.dslist.GameMinProjection;
import com.devprojeto.dslist.entities.GameList;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface GameListRepository extends JpaRepository<GameList, Long> {

}
