package com.practice.dto;

import java.util.List;

import lombok.Data;

@Data
public class TracksDTO {
	private String href;
	private List<TrackItemDTO> items;
}
