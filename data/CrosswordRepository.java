package data;

import java.util.List;

import org.springframework.data.repository.*;

public interface CrosswordRepository extends Repository<Crossword, Long>{
	
	Crossword findByDefinition(String definition);
	
	List<Crossword> findByNumberAndState(int number, String state);

}
