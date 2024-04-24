package com.main.entity;
import java.util.List;
import jakarta.persistence.*;
import lombok.*;


@Entity
@Table(name="ER_JPA_LOCATION")
@Data
@AllArgsConstructor
@RequiredArgsConstructor
public class Location 
{
	
	@SequenceGenerator(name = "location_gen1", sequenceName = "ER_JPA_LOCATION_SEQ1", initialValue = 3000, allocationSize = 1)
	@GeneratedValue(generator = "location_gen1", strategy = GenerationType.SEQUENCE)
	@Id
	private Integer id;
	
	@OneToMany(targetEntity = Photo.class, cascade = CascadeType.ALL, mappedBy = "locationInfo")
    private List<Photo> photoInfo;
	
	@NonNull
	private String name;
	@NonNull
	private String shortName;
}
