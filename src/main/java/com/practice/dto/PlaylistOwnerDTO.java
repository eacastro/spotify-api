package com.practice.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class PlaylistOwnerDTO {
	@JsonProperty(value = "display_name")
	private String ownerName;
	@JsonProperty(value = "external_urls")
	private ExternalUrlsDTO externalUrls;
	private String href;
	private String id;
	private String type;
	private String uri;	
}
