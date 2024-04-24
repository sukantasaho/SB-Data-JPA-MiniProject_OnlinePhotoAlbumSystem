package com.main.entity;
import java.time.LocalDate;
import java.util.List;
import jakarta.persistence.*;
import lombok.*;
 
@Entity
@Table(name="ER_JPA_PHOTO")
@Data
@AllArgsConstructor
@RequiredArgsConstructor
public class Photo 
{
	@SequenceGenerator(name = "photo_gen1", sequenceName = "ER_JPA_PHOTO_SEQ1", initialValue = 1000, allocationSize = 1)
	@GeneratedValue(generator = "photo_gen1", strategy = GenerationType.SEQUENCE)
	@Id
    private Integer id;
     
	@OneToMany(targetEntity = Comment.class, cascade = CascadeType.ALL, mappedBy = "photoInfo")
    private List<Comment> commentInfo;
    
	
	@ManyToOne(targetEntity = Album.class, cascade = CascadeType.ALL)
	@JoinColumn(name="albumID", referencedColumnName = "id")
    private Album albumInfo;
	
	@ManyToOne(targetEntity = Location.class, cascade = CascadeType.ALL)
	@JoinColumn(name="locationID", referencedColumnName = "id")
    private Location locationInfo;
	
	@ManyToOne(targetEntity = Member.class, cascade = CascadeType.ALL)
	@JoinColumn(name="memberID", referencedColumnName = "id")
    private Member memberInfo;
    
	@NonNull
    private String title;
	@NonNull
    private String description;
	@NonNull
    private String privacy;
	@NonNull
    private LocalDate uploadDate;
}
