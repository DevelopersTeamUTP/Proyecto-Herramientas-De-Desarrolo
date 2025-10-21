package com.example.demo.jpa.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.jpa.Model.User;
import com.example.demo.jpa.services.UserService;

import org.springframework.web.bind.annotation.PathVariable;

@Controller
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    //#####################     CRUD      ###########################
    //LEER / READ
    @GetMapping
    public String mostrarUsers(Model model ) {
        model.addAttribute("users",userService.obtenerTodos());
        return "tablaUsuarios";
    }
    //CREAR / CREATE
    @PostMapping("/guardar")
    public String guardarUser(@ModelAttribute User user){
        userService.guardar(user);
        return "redirect:/users";
    }
    //ELIMINAR / DELETE
    @PostMapping("/eliminar/{id}")
    public String eliminarUser(@PathVariable Long id){
        userService.eliminar(id);
        return "redirect:/users";
    }
    //EDITAR / UPDATE
    @PostMapping("/editar/{id}")
    public String editarUser(@PathVariable Long id, @ModelAttribute User userEditado) {
        userEditado.setId(id);
        userService.guardar(userEditado);
        return "redirect:/users";
    }
    //###############################################################

    @PostMapping("/login")
    public String autentificacion(@RequestParam String email,@RequestParam String password,Model modeloLogin) {
        if(userService.login(email,password)){
           modeloLogin.addAttribute("successLogin",true);
            return "redirect:/inicio";
            
        }else{
            modeloLogin.addAttribute("errorLogin",true);
            return "inicioSesion";
        }
        
    }
}
