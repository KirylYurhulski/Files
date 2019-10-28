package ru.io.files.parser;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public final class SimpleFileParser implements Parser {
	private final File file;

	public SimpleFileParser(File file) {
		this.file = file;
	}

	public String content() throws IOException {
		try (FileInputStream inputStream = new FileInputStream(this.file)) {
			StringBuilder output = new StringBuilder();
			int data;
			while ((data = inputStream.read()) > 0) {
				output.append((char) data);
			}
			return output.toString();
		}
	}
}