package controller;

import java.util.List;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import entity.User;
import service.UserService;


@ManagedBean(name = "listaImovel")
@RequestScoped
public class ListaImovelBean 
{
    private List<User> campistas;
    private User campista;

    @EJB
    UserService userService;

    public List<User> getCampistas() 
    {
        campistas = userService.getAllUsers();
        return campistas;
    }
    
    public void removeCampista(User user)
    {
        this.userService.delete(user);
       // addMessage("Campista removido com sucesso!");
    }
    
}