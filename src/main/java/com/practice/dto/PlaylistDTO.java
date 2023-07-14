package com.practice.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PlaylistDTO {
	private Boolean collaborative;
	private String description;
	@JsonProperty(value = "external_urls")
	private ExternalUrlsDTO externalUrls;
	private FollowersDTO followers;
	private String href;
	private String id;
	private List<SpotifyImageDTO> images;
	private String name;
	private PlaylistOwnerDTO owner;
	@JsonProperty(value = "primary_color")
	private String primaryColor;
	@JsonProperty(value = "public")
	private Boolean playlistPublic;
	@JsonProperty(value = "snapshot_id")
	private String snapshotId;	
	private TracksDTO tracks;
	
	
}
