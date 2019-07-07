package com.github.mouse0w0.jsr269lib;

import javax.tools.FileObject;
import javax.tools.JavaFileManager;
import java.io.IOException;

public class Files {
    public static FileObject createFile(JavaFileManager.Location location, String relativeName) {
        try {
            return Environment.getFiler().createResource(location, "", relativeName);
        } catch (IOException e) {
            Messages.error(e.getMessage());
            e.printStackTrace();
        }
        return null;
    }
}
