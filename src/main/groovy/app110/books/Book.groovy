package app110.books

import grails.gorm.annotation.Entity

@Entity
class Book {

	String name
	Date dateCreated
}