package jdev.mentoria.lojavirtual;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "hello_table")
public class HelloTable {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

}
