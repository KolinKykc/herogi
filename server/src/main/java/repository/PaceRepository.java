package repository;

import com.herogi.server.model.Pace;
import com.herogi.server.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface PaceRepository extends JpaRepository<Pace, String> {
        Optional<Pace> findById(String userid);

        List<Pace> findAll();
        }
