package com.example.reactive.observables;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.example.reactive.observers.RXObserver;
import com.example.reactive.utils.RXUtils;

import io.reactivex.Observable;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;


public class ObservableWithoutBackPressure {

	
	private static final Logger logger = LoggerFactory.getLogger(ObservableWithoutBackPressure.class);
	
	public static void main(String ...args) {
		
		Observable<Integer> positiveNumberEvents = Observable.fromIterable(RXUtils.postiveNumbers(1000000))
				.repeat()
				.observeOn(Schedulers.newThread())
				.subscribeOn(Schedulers.newThread());
		
		positiveNumberEvents.subscribe( (Consumer<? super Integer>) new RXObserver());
		
	}
}
