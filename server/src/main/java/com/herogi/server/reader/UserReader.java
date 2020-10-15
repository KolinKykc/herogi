package com.herogi.server.reader;

import com.fasterxml.jackson.databind.MappingIterator;

import java.io.File;
import java.util.List;

import com.fasterxml.jackson.dataformat.csv.CsvMapper;
import com.herogi.server.model.User;

public class UserReader {
    public static List<User> readFile(File csvFile) throws Exception {
        MappingIterator<User> personIter = new CsvMapper().readerWithTypedSchemaFor(User.class).readValues(csvFile);

        return personIter.readAll();
    }
}
