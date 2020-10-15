package service;

import com.herogi.server.model.Pace;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface PaceService {

    List<Pace> allPaces();

}
