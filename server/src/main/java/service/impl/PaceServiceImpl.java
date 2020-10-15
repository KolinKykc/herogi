package service.impl;

import com.herogi.server.model.Pace;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.PaceRepository;
import service.PaceService;

import java.util.List;
import java.util.Optional;

@Service
public class PaceServiceImpl implements PaceService {

    private PaceRepository paceRepository;

    @Override
    public List<Pace> allPaces() {
        return paceRepository.findAll();
    }


    @Autowired
    public void setUserRepository(PaceRepository paceRepository) {
        this.paceRepository = paceRepository;
    }

    public Optional<Pace> findPace(String userid) {
        Optional<Pace> pace = paceRepository.findById(userid);

        return pace;
    }
}
