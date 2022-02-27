package Entities;

import java.time.LocalDate;

public class Player {
	
	private int playerId;
	private String playerFirstName;
	private String playerLastName;
	private LocalDate birthOfDate;
	private String nationalityId;
	
	
	public Player(){
		
	}
	public Player(int playerId, String playerFirstName, String playerLastName, LocalDate birthOfDate, String nationalityId) {
		super();
		this.playerId = playerId;
		this.playerFirstName = playerFirstName;
		this.playerLastName = playerLastName;
		this.birthOfDate = birthOfDate;
		this.nationalityId = nationalityId;
	}


	public int getPlayerId() {
		return playerId;
	}


	public void setPlayerId(int playerId) {
		this.playerId = playerId;
	}

	public String getPlayerFirstName() {
		return playerFirstName;
	}
	
	public void setPlayerFirstName(String playerFirstName) {
		this.playerFirstName = playerFirstName;
	}
	
	public String getPlayerLastName() {
		return playerLastName;
	}
	
	public void setPlayerLastName(String playerLastName) {
		this.playerLastName = playerLastName;
	}
	
	public LocalDate getBirthOfDate() {
        return birthOfDate;
    }

    public void setBirthOfDate(LocalDate birthOfDate) {
        this.birthOfDate = birthOfDate;
    }


	public String getNationalityId() {
		return nationalityId;
	}


	public void setNationalityId(String nationalityId) {
		this.nationalityId = nationalityId;
	}
	
	
	

}
