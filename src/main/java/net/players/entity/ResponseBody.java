package net.players.entity;

import lombok.Getter;
import lombok.Setter;

public class ResponseBody 
{
	@Getter @Setter
	private Object response;

	public ResponseBody()
	{}
	
	public ResponseBody(Object response)
	{
		this.response = response;
	}
}
