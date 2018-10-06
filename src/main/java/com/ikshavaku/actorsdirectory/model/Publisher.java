package com.ikshavaku.actorsdirectory.model;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="PUBLISHER")
public class Publisher {

	private String publisherName;
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long publisherId;
	@OneToMany(mappedBy="publisher", cascade = CascadeType.ALL)
	private Set<Book> Books;
	public String getPublisherName() {
		return publisherName;
	}
	public void setPublisherName(String publisherName) {
		this.publisherName = publisherName;
	}
	public Long getPublisherId() {
		return publisherId;
	}
	public void setPublisherId(Long publisherId) {
		this.publisherId = publisherId;
	}
	public Set<Book> getBooks() {
		return Books;
	}
	public void setBooks(Set<Book> books) {
		Books = books;
	}
	
	
}
