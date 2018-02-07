package blablacar.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import blablacar.domain.Booking;

@Repository
public interface BookingRepository extends CrudRepository<Booking, Integer>{
}
