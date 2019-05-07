package app110.books

import javax.inject.Singleton
import groovy.transform.CompileStatic
import groovy.util.logging.Slf4j
import javax.inject.Inject

import grails.gorm.transactions.Transactional

@Singleton
@CompileStatic
@Slf4j
@Transactional
class BookService {

	def saveBook(Book book){

		book.save(flush:true, failOnError:true)

		book
	}

}