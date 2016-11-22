package data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableAutoConfiguration
@Entity
public class Crossword {
	
	@Id
	@GeneratedValue
	private Long id;
	
	@Column(nullable = false)
	private int number;
	
	@Column(nullable = false)
	private String state;
	
	@Column(nullable = false)
	private String definition;
	
	@Column(nullable = false)
	private String answer;
	
	private Crossword(){}
	
	public Crossword(int number, String state, String definition, String answer){
		this.number = number;
		this.state = state;
		this.definition = definition;
		this.answer = answer;
	}

	public int getNumber(){
		return this.number;
	}
	
	public String getState(){
		return this.state;
	}
	
	public String getDefinition(){
		return this.definition;
	}
	
	public String getAnswer(){
		return this.answer;
	}
	
	
}
