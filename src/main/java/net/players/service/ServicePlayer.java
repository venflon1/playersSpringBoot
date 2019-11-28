package net.players.service;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.players.entity.Player;
import net.players.repo.PlayerRepository;

@Service
public class ServicePlayer 
{
	@Autowired
	private PlayerRepository playerRepo;
	
	public List<Player> getAllPlayers()
	{
		return playerRepo.findAll();
	}
	
	public Optional<Player> getPlayer(int id)
	{
		return playerRepo.findById(id);
	}
	
	public List<Player> getPlayerTeam(String team)
	{
		return playerRepo.findByTeam(team);
	}
	
	public Player createNewPlayer(Player player)
	{
		return playerRepo.save(player);
	}
	
	public void deletePlayer(int id)
	{
		playerRepo.deleteById(id);
	}
}