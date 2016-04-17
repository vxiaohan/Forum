package com.f1020.forum;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport{
  private String username;
  private String password;
  public String getPassword() {
	return password;
  }
  public void setPassword(String password) {
	this.password = password;
  }
  public String getUsername() {
	return username;
  }
  public void setUsername(String username) {
	this.username = username;
  }
  public String login()throws Exception{
	  Users users=new Users();
	  users.setName(username);
	  users.setPassword(password);
	  UsersDAO usersDAO=new UsersDAO();
	  boolean flag=usersDAO.login(users);
	  if (flag) {
		ActionContext.getContext().getSession().put("username", username);
		return SUCCESS;
	 } else {
        return INPUT;
	 }
  }
}
