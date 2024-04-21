package kamarpelajar.travuget.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import kamarpelajar.travuget.entity.Negara;

@Repository
public interface NegaraRepository extends JpaRepository<Negara, String>{

}
