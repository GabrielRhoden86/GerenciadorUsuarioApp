package com.br.GerenciadorUsuarioApp.Controller
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping


@Controller
class UsuarioController {

    @GetMapping("formulario-cadastro")
    fun abrirFormularioCadastro() : String{
        return "formulario-cadastro"
    }

    @GetMapping("testes")
    fun teste() : String{
        return "teste"
    }

    @GetMapping("masters")
    fun master() : String{
        return "master"
    }


}