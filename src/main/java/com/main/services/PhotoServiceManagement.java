package com.main.services;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

 
import com.main.entity.*;
import com.main.repository.IAlbumRepository;
import com.main.repository.ICommentRepository;
import com.main.repository.ILocationRepository;
import com.main.repository.IMemberRepository;
import com.main.repository.IPhotoRepository;

 

@Service("pService")
public class PhotoServiceManagement implements IPhotoServiceManagement 
{

	@Autowired
	private IPhotoRepository photoRepo;
	@Autowired
	private IAlbumRepository albumRepo;
	@Autowired
	private ICommentRepository commentRepo;
	@Autowired
	private ILocationRepository locationRepo;
	@Autowired
	private IMemberRepository memberRepo;
	
	@Override
	public void savePhoto()
	{
		 Photo p1 = new Photo("God Image","This god very famous for hindu","This photo not privacy",LocalDate.now());
		 Photo p2 = new Photo("Film Image","This is very famous film an india","This photo not privacy",LocalDate.now());
		 
		 Album album = new Album("Personal Album","This album contains many photos");
		 album.setPhotoInfo(List.of(p1, p2));
		 p1.setAlbumInfo(album);
		 p2.setAlbumInfo(album);  //try save album repo
		 
		 Comment c1 = new Comment(LocalDate.now(),"This is super");
		 c1.setPhotoInfo(p1);
		 Comment c2 = new Comment(LocalDate.now(),"This is awseom");
		 c2.setPhotoInfo(p1);
		 
		 p1.setCommentInfo(List.of(c1, c2));//try save photo repo
		 
		 Comment c3 = new Comment(LocalDate.now(),"Nice picture ");
		 c3.setPhotoInfo(p2);
		 Comment c4 = new Comment(LocalDate.now(),"This is mine blowing");
		 c4.setPhotoInfo(p2);
		 
		 p2.setCommentInfo(List.of(c3, c4));//try save photo repo
		 
		 Location location = new Location("Karnataka Bangalore","Bangalore");
		 location.setPhotoInfo(List.of(p1, p2));
		 p1.setLocationInfo(location);//try save location repo
		 
		 Member member = new Member("Sukanta","9883993300","ssukanta531@gmail.com","Bangalore");
		 member.setPhotoInfo(List.of(p1, p2));
		 p1.setMemberInfo(member);//try member repo
		 
		 albumRepo.save(album); photoRepo.save(p1);photoRepo.save(p2);locationRepo.save(location); memberRepo.save(member);
		 
		 System.out.println("Photo with its associated object saved");
		 
		 
	}

}
