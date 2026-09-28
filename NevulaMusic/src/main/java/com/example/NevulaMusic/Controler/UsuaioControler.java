package com.example.NevulaMusic.Controler;

import com.example.NevulaMusic.model.Usuario;
import com.example.NevulaMusic.service.UsuarioService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class UsuaioControler {
    private final UsuarioService usuarioService;

    public  UsuaioControler (UsuarioService usuarioService){
        this.usuarioService = usuarioService;
    }

    @GetMapping({"index.html", "index"})
    public  String index(){
        return "index";
    }

    @GetMapping({"/","/iniciar-sesion","/iniciar-sesion.html"})
    public String login(){
        return "iniciar-sesion";

    }

    @GetMapping({"/registro", "/registro.html"})
    public String registro(){
        return "registro";
    }

    @GetMapping({"/error", "/error.html"})
    public String error(){
        return "error";
    }

    @PostMapping({"/crear-cuenta"})
    public String crearCuenta(@ModelAttribute  Usuario usuario){
        if (usuarioService.existeCorreo(usuario.getCorreo())) {
            return "redirect:/error";
        }

        usuarioService.registrar(usuario);
        return "redirect:/iniciar-sesion";
    }

    @PostMapping("/autentication")
    public String autenticar(@RequestParam("correo") String correo,
                             @RequestParam("contrasenia") String contrasenia){
        if (usuarioService.autenticar(correo, contrasenia)){
            return "redirect:/index";
        }
        return "redirect:/error";
    }

    @GetMapping({"/cerrar-sesion"})
    public String cerrarSecion(){
        return "redirect:/iniciar-sesion?logout";
    }
}
