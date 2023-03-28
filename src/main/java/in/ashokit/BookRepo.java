package in.ashokit;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;



public interface BookRepo<bookentity> extends JpaRepository<BookEntity,Integer > {
	
	
	// sql query
	@Query (value="select*from bookentity",nativeQuery=true)
    public List<bookentity>getallbooks();
    
    // hql query
    @Query ("from bookentity")
    public List <bookentity>getbooks();
}