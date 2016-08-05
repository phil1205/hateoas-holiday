package main.occupancy.controller;

import main.occupancy.model.*;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.querydsl.QueryDslPredicateExecutor;

//@RepositoryRestResource(collectionResourceRel = "occupancy", path = "occupancy")
public interface OccupancyRepository extends PagingAndSortingRepository<Occupancy, Long>,
		QueryDslPredicateExecutor<Occupancy> {

	/*
	List<Occupancy> findByFKOID(@Param("FKOEID") int intOEID);
	List<Occupancy> findByFKOEIDAndFKHolidayWeekID(@Param("FKOEID") int intOEID, @Param("FKHolidayWeekID") short shortHolidayWeekID);
	List<Occupancy> findByFKHolidayWeekID(@Param("FKHolidayWeekID") short shortHolidayWeekID);
	*/
}
