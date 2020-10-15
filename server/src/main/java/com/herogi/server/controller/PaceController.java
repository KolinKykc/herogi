package com.herogi.server.controller;

import com.herogi.server.model.Pace;
import com.herogi.server.reader.PaceReader;
import org.springframework.core.io.ClassPathResource;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.File;
import java.util.List;


@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class PaceController {


    List<Pace> paces;

    public PaceController() throws Exception {
        File file = new ClassPathResource("pace.csv").getFile();
        this.paces = PaceReader.readFile(file);
    }

    @GetMapping(value = "/paces", produces = "application/json")
    public List<Pace> getPace() {

        return paces;
    }
}
