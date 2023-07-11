package springintensivao.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import springintensivao.dslist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long> {
	
}
