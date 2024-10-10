package com.Tech4good.Tech4good.CONTROLADORES;

import com.Tech4good.Tech4good.MODELOS.Donantes;
import com.Tech4good.Tech4good.REPOSITORIOS.DonantesRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/Donantes")
@CrossOrigin(origins = "http://127.0.0.1:5500")
public class DonantesController {

    DonantesRepository repositorio;

    public DonantesController(DonantesRepository repositorio) {
        this.repositorio = repositorio;
    }

    @GetMapping("/Registrados")
    public List<Donantes> usuariosRegistrados() {
        return repositorio.findAll();
    }

    @GetMapping("/Registrado/{id}")
    public ResponseEntity<Donantes> registroUsuario(@PathVariable Long id) {
        Optional<Donantes> opt = repositorio.findById(id);

        if (opt.isEmpty()) {
            return ResponseEntity.badRequest().build();
        } else {
            return ResponseEntity.ok(opt.get());
        }
    }

    @PostMapping("/crear")
    public ResponseEntity<Donantes> guardarUsuario(@RequestBody Donantes usuario) {
        Donantes donanteGuardado = repositorio.save(usuario);
        return ResponseEntity.ok(donanteGuardado);
    }

    @PutMapping("/Registrados")
    public ResponseEntity<Donantes> actualizarUsuario(@RequestBody Donantes usuario) {
        if (usuario.getIdUsuario() == null || !repositorio.existsById(usuario.getIdUsuario())) {
            return ResponseEntity.badRequest().build();
        }

        Donantes donanteActualizado = repositorio.save(usuario);
        return ResponseEntity.ok(donanteActualizado);
    }

    @DeleteMapping("/Registrados/{id}")
    public ResponseEntity<Void> borrarUsuario(@PathVariable Long id) {
        if (id == null || !repositorio.existsById(id)) {
            return ResponseEntity.badRequest().build();
        }

        repositorio.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}
