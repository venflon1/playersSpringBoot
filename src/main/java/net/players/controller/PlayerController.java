package net.players.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import net.players.entity.Player;
import net.players.service.ServicePlayer;

@RestController
public class PlayerController 
{
	@Autowired
	private ServicePlayer servicePlayer;
	
	@RequestMapping(value="/players", method=RequestMethod.GET)
	public List<Player> getAllPlayers()
	{
		return servicePlayer.getAllPlayers();
	}
	
	@RequestMapping(value="/player/{id}", method=RequestMethod.GET)
	public Optional<Player> getPlayer(@PathVariable int id)
	{
		return servicePlayer.getPlayer(id);
	}
	
	@RequestMapping(value = "/players", method = RequestMethod.POST)
	public void creeateNewPlayer(@RequestBody Player player)
	{
		servicePlayer.createNewPlayer(player);
	}	
	
	@RequestMapping(value = "/players/{id}", method = RequestMethod.DELETE)
	public void deletePlayer(@PathVariable int id)
	{
		servicePlayer.deletePlayer(id);
	}
}