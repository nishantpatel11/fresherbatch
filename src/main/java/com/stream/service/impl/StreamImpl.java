package com.stream.service.impl;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Function;
import java.util.function.Predicate;

import com.stream.model.Fruit;
import com.stream.model.News;
import com.stream.model.Transaction;

public class StreamImpl {

	public static void main(String[] args) {

		List<Fruit> fruits = new ArrayList<Fruit>();


//		Display fruit  name of low calories sorted in descending order
		fruits.stream().filter(fruit -> fruit.getCalories() < 100).sorted(new Comparator<Fruit>() {
			public int compare(Fruit fruit1, Fruit fruit2) {
				return fruit2.getCalories().compareTo(fruit1.getCalories());
			}
		}).forEach(fruit -> System.out.println(fruit.getName()));


//		Display color wise list of fruit name
		fruits.stream().sorted(Comparator.comparing(Fruit::getColor)).forEach(fruit->System.out.println("Color :"+fruit.getColor()+"Fruit Name :"+fruit.getName()));


//		Display only Red color fruit and ascending order
		fruits.stream().filter(fruit -> fruit.getColor().equals("RED")).sorted(new Comparator<Fruit>() {
			public int compare(Fruit fruit1, Fruit fruit2) {
				return fruit1.getPrice().compareTo(fruit2.getPrice());
			}
		}).forEach(fruit -> System.out.println(fruit.getName()));


		
		
		
//		--------------------------------------------------------------------------------------
		
		
		List<News> newsList = new ArrayList<News>();

//		Budget arrived in user comment all news
		Optional<News>  newsl = newsList.stream().max(Comparator.comparing(News::getComment));
		System.out.println(newsl);


		//
		Long numberBudget = newsList.stream().filter(news -> news.getComment().equals("budget")).count();
		System.out.println(numberBudget);


		//		Long numberBudget = newsList.stream().anyMatch(news->)

		
//		----------------------------------------------------------------------------------------

//		All transaction in 2011 and sort by name
		List<Transaction> transactionList = new ArrayList<Transaction>();
		transactionList.stream().filter(transaction -> transaction.getYear() == 2011).sorted(Comparator.comparing(Transaction::getValue)).forEach(System.out::println);
		
//		All uniquines cities
		transactionList.stream().filter( distinctByKey(transaction -> transaction.getTrader().getCity())).forEach(System.out::println);

		
//		All Trader from Pune and sort by name
		transactionList.stream().filter(transaction -> transaction.getTrader().getCity().equalsIgnoreCase("Pune")).sorted(new Comparator<Transaction>() {
			public int compare(Transaction t1,Transaction t2) {
				return t1.getTrader().getName().compareTo(t2.getTrader().getName());
			}
		}).forEach(System.out::println);


		
//		Any traders based in Indore
		transactionList.stream().filter(transaction -> transaction.getTrader().getCity().equalsIgnoreCase("Indore")).forEach(System.out::println);
		
		
		
		
	}

	public static <T> Predicate<T> distinctByKey(Function<? super T, Object> keyExtractor)
	{
		Map<Object, Boolean> map = new ConcurrentHashMap<>();
		return t -> map.putIfAbsent(keyExtractor.apply(t), Boolean.TRUE) == null;
	}
}
