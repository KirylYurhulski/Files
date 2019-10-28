package ru.io.files.parser;

import java.io.IOException;

public final class FileParserWithoutUnicode implements Parser {
	private final SimpleFileParser simpleFileParser;
	private static final int UNICODE_CHAR = 0x80;

	public FileParserWithoutUnicode(SimpleFileParser simpleFileParser) {
		this.simpleFileParser = simpleFileParser;
	}

	public String content() throws IOException {
		StringBuilder output = new StringBuilder();
		String fileContent = simpleFileParser.content();
		for(int i = 0; i < fileContent.length(); i++){
			char symbol = fileContent.charAt(i);
			if((int)symbol < UNICODE_CHAR){
				output.append(symbol);
			}
		}
		return output.toString();
	}
}