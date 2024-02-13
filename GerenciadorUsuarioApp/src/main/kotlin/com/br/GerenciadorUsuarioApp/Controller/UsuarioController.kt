package com.br.GerenciadorUsuarioApp.Controller
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping

@Controller
/**
 * Controlador responsável por lidar com as requisições relacionadas aos usuários.
 */
 class UsuarioController {

    @GetMapping("formulario-cadastro")
    fun abrirFormularioCadastro() : String{
        return "formulario-cadastro"
    }
}