package com.teste;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TemporaryFolder;

import java.io.File;
import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

//As rules são executadas antes do testes começarem

public class ruleTeste {

    @Rule
    public TemporaryFolder tmpFolder = new TemporaryFolder();

    @Test
    public void shouldCreateNewFile() throws IOException {
        File created = tmpFolder.newFile("file.txt");
        assertTrue(created.isFile());
        assertEquals(tmpFolder.getRoot(), created.getParentFile());

    }

}
