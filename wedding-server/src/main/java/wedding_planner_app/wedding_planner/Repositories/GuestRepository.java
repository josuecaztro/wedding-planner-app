package wedding_planner_app.wedding_planner.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import wedding_planner_app.wedding_planner.Models.Guest;

@Repository
public interface GuestRepository extends JpaRepository<Guest, Long> {
}
