package ru.io.files.writer;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public final class FileWriter implements Writer{
	private final File file;
	
	public FileWriter(File file){
		this.file = file;
	}

	@Override
	public void save(String content) throws IOException {
        try (FileOutputStream fileOutputStream = new FileOutputStream(this.file)) {
            for (int i = 0; i < content.length(); i++) {
                fileOutputStream.write(content.charAt(i));
            }
        }
	}
}
