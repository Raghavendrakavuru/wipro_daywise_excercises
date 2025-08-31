package com.wipro.ananymous;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.function.Consumer;

public class ConsumerTest {
	public static void main(String[] args) {
		
		 Consumer<ZoneId> CurrentTime = zone -> {
			ZoneDateTime currentTime = ZonedDateTime.now(zone);
		 };

	        // Get the next even number and print it
	       // printEven.accept(.get());
		 printCurrentTime.accept(ZoneId.of("Europe/London"));
	    }
	}


