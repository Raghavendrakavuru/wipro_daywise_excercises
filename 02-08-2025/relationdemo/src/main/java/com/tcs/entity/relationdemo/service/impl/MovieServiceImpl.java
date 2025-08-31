package com.tcs.entity.relationdemo.service.impl;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.tcs.entity.relationdemo.entity.Movie;
import com.tcs.entity.relationdemo.repo.GenreRepo;
import com.tcs.entity.relationdemo.repo.MovieRepo;
import com.tcs.entity.relationdemo.service.MovieService;

@Service
public class MovieServiceImpl implements MovieService {
	
	@Autowired
	MovieRepo movieRepo;
	
	@Autowired
	GenreRepo genreRepo;

	@Override
	@Transactional
	public void save(Movie movie) {
		
		movieRepo.save(movie);
	}

	@Override
	public List<Movie> findAll() {
		
		return movieRepo.findAll();
	}

}
