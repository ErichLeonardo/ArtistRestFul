package org.Hamm.repository;

import org.Hamm.model.Artist;
import org.Hamm.model.CCAA;
import org.Hamm.model.Post;
import org.Hamm.model.Province;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface PostRepository extends JpaRepository<Post, Integer> {
    Optional<Post> findById(int id);
    Optional<Post> findByTitle(String title);
    Optional<Post> findByContent(String content);

    Optional<Post> findByMediaUrl(String mediaUrl);
    Optional<List<Post>> findByArtist(Artist artist);

    List<Post> findAll();

    Optional<List<Post>> findByArtistLocation(String location);

    Optional<List<Post>> findByArtistCCAA(CCAA CCAA);

    Optional<List<Post>> findByArtistProvince(Province province);

}
