package com.dio.dio_project.controller;

import com.dio.dio_project.Model.Mensagem;
import com.dio.dio_project.repository.MensagemRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/mensagens")
public class MensagemController {

    private final MensagemRepository repository;

    public MensagemController(MensagemRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public List<Mensagem> listar() {
        return repository.findAll();
    }

    @PostMapping
    public Mensagem criar(@RequestBody Mensagem mensagem) {
        return repository.save(mensagem);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
    repository.deleteById(id);
}

}
