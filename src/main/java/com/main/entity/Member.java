package com.main.entity;
import java.util.List;
import jakarta.persistence.*;
import lombok.*;
 

@Entity
@Table(name="ER_JPA_MEMBER")
@Data
@AllArgsConstructor
@RequiredArgsConstructor
public class Member 
{
	
	@SequenceGenerator(name = "member_gen1", sequenceName = "ER_JPA_MEMBER_SEQ1", initialValue = 4000, allocationSize = 1)
	@GeneratedValue(generator = "member_gen1", strategy = GenerationType.SEQUENCE)
	@Id
	private Integer id;
	 
	@OneToMany(targetEntity = Photo.class, cascade = CascadeType.ALL, mappedBy = "memberInfo")
    private List<Photo> photoInfo;
	
	@NonNull
	private String name;
	@NonNull
	private String phoneNum;
	@NonNull
	private String email;
	@NonNull
	private String address;
}
