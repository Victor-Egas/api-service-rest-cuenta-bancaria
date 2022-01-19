package com.banca.model;

	import org.springframework.data.annotation.Id;

	import org.springframework.data.mongodb.core.mapping.Document;
	import org.springframework.data.mongodb.core.mapping.Field;

	import lombok.AllArgsConstructor;
	import lombok.Getter;
	import lombok.NoArgsConstructor;
	import lombok.extern.slf4j.Slf4j;

	@Getter
	@AllArgsConstructor
	@NoArgsConstructor
	@Slf4j
	@Document(collection="customer")
	public class Customer {
		
		@Id
		private String id;
		
		@Field(name="firstName")
		private String firstName;
		
		@Field(name="lastName")
		private String lastName;
		
		@Field(name="document")
		private String document;
		
		@Field(name="type")
		private String type;

	}


