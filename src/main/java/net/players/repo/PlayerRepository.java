package net.players.repo;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;


import net.players.entity.Player;

public interface PlayerRepository extends JpaRepository<Player, Integer>
{
	// custom
	Player findById(String id);
	
	// custom
	List<Player> findBySurname(String surname);
	
	// custom
	List<Player> findByTeam(String team);
}