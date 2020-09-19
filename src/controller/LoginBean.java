package controller;

import entity.User;

public class LoginBean 
{
	private User user = new User();

	  public String logar() 
	  {
	    if(user.equals(user.getEmail()) && user.equals(user.getPassword())) 
	    {
	      /* Se escrever o login e senha correto então vai para a tela principal do sistema. */
	      return "listagem de apartamentos";
	    }

	    //Caso erre o login ou senha fica na mesma tela.
	    return null;
	  }

	  public User getUser() 
	  {
	    return user;
	  }

	  public void setUser(User user) 
	  {
	    this.user = user;
	  }
}
