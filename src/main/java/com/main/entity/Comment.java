package com.main.entity;
import java.time.LocalDate;
import jakarta.persistence.*;
import lombok.*;
 

@Entity
@Table(name="ER_JPA_COMMENT")
@Data
@AllArgsConstructor
@RequiredArgsConstructor
public class Comment 
{
    
	@SequenceGenerator(name = "comment_gen1", sequenceName = "ER_JPA_COMMENT_SEQ1", initialValue = 5000, allocationSize = 1)
	@GeneratedValue(generator = "comment_gen1", strategy = GenerationType.SEQUENCE)
	@Id
	private Integer id;
	
	@ManyToOne(targetEntity = Photo.class, cascade = CascadeType.ALL)
	@JoinColumn(name="PhotoID", referencedColumnName = "id")
	private Photo photoInfo;
	
	@NonNull
	private LocalDate postDate;
	@NonNull
	private String content;
}
