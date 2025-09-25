package BackEndBosques.Foro.Repositorios;
import BackEndBosques.Foro.Model.Publicacion;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositorioPublicacion extends MongoRepository<Publicacion,String> {
}
