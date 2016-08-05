package main.holidayweek.controller;

import main.holidayweek.model.*;
import main.user.model.User;

import java.util.*;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.querydsl.QueryDslPredicateExecutor;

import java.text.ParseException;
import java.text.SimpleDateFormat;

//@RepositoryRestResource(collectionResourceRel = "holidayweek", path = "holidayweek")
public interface HolidayweekRepository extends PagingAndSortingRepository<Holidayweek, Long>,
		QueryDslPredicateExecutor<Holidayweek> {
	
//	List<Holidayweek> findByByteWeekAndShortYear(@Param("Week") byte byteWeek, @Param("Year") short shortYear);
//	List<Holidayweek> findByBolEnabled(@Param("Enabled") boolean bolEnabled);
//	List<Holidayweek> findByShortYear(@Param("Year") short shortYear);
//
	
//	public static int getActualCalendarWeek(){
//		String inputFormat = "yyyyMMdd";
//
//		SimpleDateFormat dateFormat = new SimpleDateFormat(inputFormat);
//		Date date = new Date();
//
//		Calendar calendar = Calendar.getInstance();
//		calendar.setTime(date);
//		int weekNumber = calendar.get(Calendar.WEEK_OF_YEAR);
//		
//		return weekNumber;
//	}
//	
//	public static int getActualYear(){
//		String inputFormat = "yyyyMMdd";
//
//		SimpleDateFormat dateFormat = new SimpleDateFormat(inputFormat);
//		Date date = new Date();
//
//		Calendar calendar = Calendar.getInstance();
//		calendar.setTime(date);
//		int yearNumber = calendar.get(Calendar.YEAR);
//		
//		return yearNumber;
//	}
}