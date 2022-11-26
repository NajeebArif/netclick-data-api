package narif.poc.netclickdataapi.repo;

import narif.poc.netclickdataapi.entity.Film;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface FilmRepository extends PagingAndSortingRepository<Film, Integer> {
}
