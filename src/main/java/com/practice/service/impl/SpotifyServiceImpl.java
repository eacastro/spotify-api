package com.practice.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.practice.dto.TrackInfoDTO;
import com.practice.service.SpotifyService;

@Service
public class SpotifyServiceImpl implements SpotifyService {

	private final Logger log = LoggerFactory.getLogger(SpotifyServiceImpl.class);
	
	@Value("${spotify.clientid}")
	private String CLIENT_ID;

	@Value("${spotify.clientsecret}")
	private String CLIENT_SECRET;
	
	@Override
	public List<TrackInfoDTO> getMyTopSongs() {
		log.debug("getMyTopSongs");
		log.debug("CLIENT_ID: " + CLIENT_ID);
		log.debug("CLIENT_SECRET: " + CLIENT_SECRET);

		List<TrackInfoDTO> tracklist = new ArrayList<>();

		tracklist.add(new TrackInfoDTO("Molinos de Viento", "Mägo de Oz", "La leyenda de La Mancha"));
		tracklist.add(new TrackInfoDTO("La rosa de los vientos (Metal version)", "Mägo de Oz", "Belfast"));
		tracklist.add(new TrackInfoDTO("Gaia", "Mägo de Oz", "Gaia"));

		return tracklist;
	}

}
