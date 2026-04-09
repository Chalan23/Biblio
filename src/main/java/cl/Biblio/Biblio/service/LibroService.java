package cl.Biblio.Biblio.service;

import cl.Biblio.Biblio.model.Libro;
import cl.Biblio.Biblio.repository.LibroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class LibroService {
    @Autowired
    private LibroRepository libroRepository;

    public List<Libro> getLibros(){
        return libroRepository.obteneLibros();
    }

    public Libro saveLibro(Libro libro){
        return libroRepository.guardar(libro);
    }

    public Libro getLibroId(int id){
        return libroRepository.buscaPorId(id);
    }

    public Libro updaLibro(Libro libro){
        return libroRepository.actualizar(libro);
    }

    public String deleteLibro(int id){
        libroRepository.eliminar(id);
        return "Producto eliminado";
    }

    public int totalLibrosV1(){
        return libroRepository.obteneLibros().size();
    }

    public int totalLibrosV2(){
        return libroRepository.totalLibros();
    }

}
