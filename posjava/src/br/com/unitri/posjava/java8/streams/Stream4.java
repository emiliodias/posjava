package br.com.unitri.posjava.java8.streams;

import java.io.IOException;
import java.io.UncheckedIOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class Stream4 {
	
	static Stream<String> lines(Path p) {
	    try {
	        return Files.lines(p);
	    } catch(IOException e) {
	    	throw new UncheckedIOException(e);
	    }
	}

	public static void main(String[] args) throws Exception {

		Files.list(Paths.get("/tmp")).filter(p -> p.toString().endsWith(".txt"))
				.map(p -> lines(p))
				.forEach(System.out::println);

	}

}

