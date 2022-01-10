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

		public String getId() {
			return id;
		}

		public void setId(String id) {
			this.id = id;
		}

		public String getFirstName() {
			return firstName;
		}

		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}

		public String getLastName() {
			return lastName;
		}

		public void setLastName(String lastName) {
			this.lastName = lastName;
		}

		public String getDocument() {
			return document;
		}

		public void setDocument(String document) {
			this.document = document;
		}

		public String getType() {
			return type;
		}

		public void setType(String type) {
			this.type = type;
		}
		
		
	}


