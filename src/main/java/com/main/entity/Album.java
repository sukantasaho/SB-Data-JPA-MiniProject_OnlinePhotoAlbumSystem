package com.main.entity;
import java.util.List;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name="ER_JPA_ALBUM")
@Data
@AllArgsConstructor
@RequiredArgsConstructor
public class Album 
{
	
	@SequenceGenerator(name = "album_gen1", sequenceName = "ER_JPA_ALBUM_SEQ1", initialValue = 2000, allocationSize = 1)
	@GeneratedValue(generator = "album_gen1", strategy = GenerationType.SEQUENCE)
	@Id
	private Integer id;
	
	 @OneToMany(targetEntity = Photo.class, cascade = CascadeType.ALL, mappedBy = "albumInfo")
	 private List<Photo> photoInfo;
	 
	 @NonNull
	 private String title;
	 @NonNull
	 private String description;
}
