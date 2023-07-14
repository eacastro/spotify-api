package com.practice.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class TrackItemDTO {
	@JsonProperty(value = "added_at")
	private String addedAt;
	@JsonProperty(value = "added_at")
	private String addedAt;
	
}
