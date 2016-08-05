package main.holiday.controller;

import main.holiday.model.*;

import java.util.*;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.config.Projection;
import org.springframework.data.querydsl.QueryDslPredicateExecutor;

import java.text.ParseException;
import java.text.SimpleDateFormat;

//@Projection(name = "noHolidayweek", types = {main.holiday.model.Holiday.class})
//interface NoHolidayweek{
//	Long getLongHoliday_id();
//	String getStrTitle();
//	Byte getByteHolidayReason();
//	Boolean getBolEnabled();
//}

public interface HolidayRepository extends PagingAndSortingRepository<Holiday, Long>,
		QueryDslPredicateExecutor<Holiday> {
	
	//List<Holiday> findByLongHoliday_id(@Param("LongHoliday_id") Long LongHoliday_id);
}