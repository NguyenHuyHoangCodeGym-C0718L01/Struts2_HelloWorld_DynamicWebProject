package com.huyhoang.action;

public class LoginAction {
	private String idUser;
	private String password;
	public String getIdUser() {
		return idUser;
	}
	public void setIdUser(String idUser) {
		this.idUser = idUser;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public String execute() {
		if(getIdUser().equals("admin") && getPassword().equals("1234")){
			return"success";
		}else{
			return"failure";
		}
	}
}
