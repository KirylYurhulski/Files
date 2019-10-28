package ru.io.files.writer;

import java.io.IOException;

public interface Writer {
	public void save(String content) throws IOException;
}
