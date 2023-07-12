package springintensivao.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import springintensivao.dslist.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long> {
	
}
