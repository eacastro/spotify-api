package com.practice.service;

import java.util.List;

import com.practice.dto.TrackInfoDTO;

public interface SpotifyService {	
	List<TrackInfoDTO> getMyTopSongs();	
}
