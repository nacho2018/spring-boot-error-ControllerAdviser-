package com.bolsadeideas.springboot.error.app.models.domain;

import lombok.*;

import java.util.List;

@Getter
@Setter
@RequiredArgsConstructor
public class Usuario {

	@NonNull
	private long id;
	@NonNull
	private String name;
	@NonNull
	private String city;
	@NonNull
	private List<String> hobbies;


}
