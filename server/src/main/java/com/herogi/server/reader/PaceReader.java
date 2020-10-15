package com.herogi.server.reader;


import com.fasterxml.jackson.databind.MappingIterator;
import com.fasterxml.jackson.dataformat.csv.CsvMapper;
import com.herogi.server.model.Pace;

import java.io.File;
import java.util.List;

public class PaceReader {
    public static List<Pace> readFile(File csvFile) throws Exception {
        MappingIterator<Pace> paceMappingIterator = new CsvMapper().readerWithTypedSchemaFor(Pace.class).readValues(csvFile);

        return paceMappingIterator.readAll();
    }
}
