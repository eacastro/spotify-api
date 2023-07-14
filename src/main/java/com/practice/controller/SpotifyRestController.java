package com.practice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.practice.dto.ServiceInfoDTO;
import com.practice.dto.TrackInfoDTO;
import com.practice.service.SpotifyService;

@RestController
@RequestMapping("/api/")
public class SpotifyRestController {
	
	@Autowired
	private SpotifyService spotifyService;

	@GetMapping("/status")
	public ServiceInfoDTO getStatus() {
		var info = new ServiceInfoDTO();
		
		info.setSuccess(true);
		info.setStatusMessage("Successful process");
		
		return info;
	}
	
	@GetMapping("/top-songs")
	public List<TrackInfoDTO> getMyTopSongs() {
		return spotifyService.getMyTopSongs();
	}
	
}
