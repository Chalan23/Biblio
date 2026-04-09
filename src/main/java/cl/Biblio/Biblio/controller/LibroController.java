package cl.Biblio.Biblio.controller;

import cl.Biblio.Biblio.model.Libro;
import cl.Biblio.Biblio.service.LibroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/libros")

public class LibroController {
    @Autowired
    private LibroService libroService;

    @GetMapping
    public List<Libro>listaLibros(){
        return libroService.getLibros();
    }

    @PostMapping
    public Libro agregaLibro(@RequestBody Libro libro){
        return libroService.saveLibro(libro);
    }

    @GetMapping("/{id}")
    public Libro buscaLibro(@PathVariable int id){
        return libroService.getLibroId(id);
    }
    
    @PutMapping("/{id}")
    public Libro actuaLibro(@PathVariable int id, @RequestBody Libro libro){
        return libroService.updaLibro(libro);
    }

    @DeleteMapping("/{id}")
    public String eliminarLibro(@PathVariable int id){
        return libroService.deleteLibro(id);
    }

    @GetMapping("/total")
    public int totalLibrosV2(){
        return libroService.totalLibrosV2();
    }

}
