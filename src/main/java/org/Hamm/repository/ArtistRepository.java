package org.Hamm.repository;

import org.Hamm.model.Artist;
import org.Hamm.model.CCAA;
import org.Hamm.model.Province;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ArtistRepository extends JpaRepository<Artist, Integer> {

    Optional<Artist> findById(int id);

    Optional<Artist> findByArtistName(String artistName);

    Optional<Artist> findByEmail(String email);
    Optional<Artist> findByName(String name);

    Optional<Artist> findByImage(String image);
    Optional<List<Artist>> findByCCAA(CCAA CCAA);
    Optional<List<Artist>> findByLocation(String location);

    Optional<List<Artist>> findByProvince(Province province);

    Optional<List<Artist>> findByAge(int age);

    List<Artist> findAll();
    Optional<List<Artist>> findByAgeBetween(int minAge, int maxAge);
}
