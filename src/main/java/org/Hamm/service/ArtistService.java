package org.Hamm.service;

import org.Hamm.model.Artist;
import org.Hamm.model.CCAA;
import org.Hamm.model.Province;
import org.Hamm.repository.ArtistRepository;
import org.Hamm.utils.Hash;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class ArtistService {
    @Autowired
    ArtistRepository repo;

    public List<Artist> getAllArtists() {
       List<Artist> artists = repo.findAll();
       return artists;
    }

    public Artist getArtistById(int id) {
        Optional<Artist> artist = repo.findById(id);
        if(artist.isPresent()) {
            return artist.get();
        } else{
            throw new RuntimeException("Artist not found");
        }
    }

    public Artist getArtistByArtistName(String artistName) {
        Optional<Artist> artist = repo.findByArtistName(artistName);
        if(artist.isPresent()) {
            return artist.get();
        } else{
            throw new RuntimeException("Artist not found");
        }
    }

    public Artist getArtistByEmail(String email) {
        Optional<Artist> artist = repo.findByEmail(email);
        if(artist.isPresent()) {
            return artist.get();
        } else{
            throw new RuntimeException("Artist not found");
        }
    }

    public Artist getArtistByName(String name) {
        Optional<Artist> artist = repo.findByName(name);
        if(artist.isPresent()) {
            return artist.get();
        } else{
            throw new RuntimeException("Artist not found");
        }
    }

    public Artist getArtistByImage(String image) {
        Optional<Artist> artist = repo.findByImage(image);
        if(artist.isPresent()) {
            return artist.get();
        } else{
            throw new RuntimeException("Artist not found");
        }
    }

    public List<Artist> getArtistsByCCAA(CCAA CCAA) {
        Optional<List<Artist>> artists = repo.findByCCAA(CCAA);
        if(artists.isPresent()) {
            return artists.get();
        }else{
            throw new RuntimeException("Artist not found");
        }
    }

    public List<Artist> getArtistsByLocation (String location) {
        Optional<List<Artist>> artists = repo.findByLocation(location);
        if(artists.isPresent()) {
            return artists.get();
        }else{
            throw new RuntimeException("Artist not found");
        }
    }

    public List<Artist> getArtistsByProvince(Province province) {
        Optional<List<Artist>> artists = repo.findByProvince(province);
        if(artists.isPresent()) {
            return artists.get();
        }else{
            throw new RuntimeException("Artist not found");
        }
    }

    public List<Artist> getArtistsByAge(int age) {
        Optional<List<Artist>> artists = repo.findByAge(age);
        if(artists.isPresent()) {
            return artists.get();
        }else{
            throw new RuntimeException("Artist not found");
        }
    }

    @Transactional
    @Modifying
    @Query("UPDATE Artist a SET a.artistName = :artistName, a.name = :name, a.email = :email, a.password= :password, a.image = :image, a.age = :age, a.province = :province, a.location = :location WHERE a.id = :id")
    public Artist createOrUpdateArtist(Artist artist) {
        Artist end;
        if(artist.getId() > 0){
            Optional<Artist> result = repo.findById(artist.getId());
            if(result.isPresent()){
                artist = result.get();
                artist.setArtistName(artist.getArtistName());
                artist.setName(artist.getName());
                artist.setEmail(artist.getEmail());
                artist.setImage(artist.getImage());
                artist.setPassword(Hash.hashPassword(artist.getPassword()));
                artist.setAge(artist.getAge());
                artist.setProvince(artist.getProvince());
                artist.setLocation(artist.getLocation());
                end = repo.save(artist);
            }else{
                throw new RuntimeException("Artist not found with id: " + artist.getId());
            }
        } else{
            end = repo.save(artist);
        }
        return end;
    }

    @Transactional
    @Modifying
    @Query("UPDATE Artist a SET a.password = :newPassword WHERE a.id = :id")
    public void updatePassword(int id, String newPassword) {
        Optional<Artist> result = repo.findById(id);
        if(result.isPresent()){
            Artist artist = result.get();
            artist.setPassword(Hash.hashPassword(newPassword));
            repo.save(artist);
        }else{
            throw new RuntimeException("Artist not found with id: " + id);
        }
    }

    public void deleteArtist(int id) {
        Optional<Artist> result = repo.findById(id);
        if(result.isPresent()){
            repo.deleteById(id);
        }else{
            throw new RuntimeException("Artist not found with id: " + id);
        }
    }

   public List<Artist> getArtistByCCAA(CCAA ccaa){
       Optional<List<Artist>> artists = repo.findByCCAA(ccaa);
       if(artists.isPresent()) {
           return artists.get();
       }else{
           throw new RuntimeException("Artist not found");
       }
   }

   public List<Artist> getArtistByProvince(Province province){
       Optional<List<Artist>> artists = repo.findByProvince(province);
       if(artists.isPresent()) {
           return artists.get();
       }else{
           throw new RuntimeException("Artist not found");
       }
   }

    public List<Artist> getArtistsByAgeRange(int minAge, int maxAge) {
        Optional<List<Artist>> artists = repo.findByAgeBetween(minAge, maxAge);
        if (artists.isPresent()) {
            return artists.get();
        } else {
            throw new RuntimeException("No artists found within the specified age range");
        }
    }

    //quiero hacer update del password


}
