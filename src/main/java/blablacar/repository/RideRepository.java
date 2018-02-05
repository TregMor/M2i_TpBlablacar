package blablacar.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import blablacar.domain.Ride;

@Repository
public interface RideRepository extends CrudRepository<Ride, Integer>{
}
