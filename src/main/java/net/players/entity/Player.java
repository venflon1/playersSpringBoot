package net.players.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="Player")
public class Player 
{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	@Getter @Setter
	@Column(name="name")
	private String name;
	
	@Getter @Setter
	@Column(name="surname")
	private String surname;
	
	@Getter @Setter
	@Column(name="team")
	private String team;
	
	public Player()
	{}
}