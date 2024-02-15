package org.Hamm.controller;

import org.Hamm.model.Artist;
import org.Hamm.model.CCAA;
import org.Hamm.model.Post;
import org.Hamm.model.Province;
import org.Hamm.service.ArtistService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/artist")
public class ArtistController {
    @Autowired
    ArtistService service;

    @GetMapping
    public ResponseEntity<List<Artist>> getAllArtists() {
        List<Artist> artists = service.getAllArtists();
        return ResponseEntity.ok(artists);
    }

    @GetMapping("/id")
    public ResponseEntity<Artist> getArtistById(int id) {
        Artist artist = service.getArtistById(id);
        return ResponseEntity.ok(artist);
    }

    @GetMapping("/artist_name")
    public ResponseEntity<Artist> getArtistByArtistName(String artistName) {
        Artist artist = service.getArtistByArtistName(artistName);
        return ResponseEntity.ok(artist);
    }

    @GetMapping("/name")
    public ResponseEntity<Artist> getArtistByName(String name) {
        Artist artist = service.getArtistByName(name);
        return ResponseEntity.ok(artist);
    }

    @GetMapping("/email")
    public ResponseEntity<Artist> getArtistByEmail(String email) {
        Artist artist = service.getArtistByEmail(email);
        return ResponseEntity.ok(artist);
    }

    @GetMapping("/image")
    public ResponseEntity<Artist> getArtistByImage(String image) {
        Artist artist = service.getArtistByImage(image);
        return ResponseEntity.ok(artist);
    }

    @GetMapping("/location")
    public ResponseEntity<List<Artist>> getArtistsByLocation(String location) {
        List<Artist> artists = service.getArtistsByLocation(location);
        return ResponseEntity.ok(artists);
    }

    @GetMapping("/ccaa")
    public ResponseEntity<List<Artist>> getArtistsByCCAA(CCAA CCAA) {
        List<Artist> artists = service.getArtistsByCCAA(CCAA);
        return ResponseEntity.ok(artists);
    }

    @GetMapping("/province")
    public ResponseEntity<List<Artist>> getArtistsByProvince(Province province) {
        List<Artist> artists = service.getArtistsByProvince(province);
        return ResponseEntity.ok(artists);
    }

    @GetMapping("/age")
    public ResponseEntity<List<Artist>> getArtistsByAge(int age) {
        List<Artist> artists = service.getArtistsByAge(age);
        return ResponseEntity.ok(artists);
    }

    @PostMapping("/artist")
    public ResponseEntity<Artist> createOrUpdateArtist(@RequestBody Artist artist) {
        Artist createdArtist = service.createOrUpdateArtist(artist);
        return ResponseEntity.ok(createdArtist);
    }

    @PostMapping("/artist/password")
    public ResponseEntity<String> updatePassword(int id, String newPassword) {
        service.updatePassword(id, newPassword);
        return ResponseEntity.ok("Password updated successfully");
    }

    @DeleteMapping
    public ResponseEntity<String> deleteArtist(int id) {
        service.deleteArtist(id);
        return ResponseEntity.ok("Artist deleted successfully");
    }


    @GetMapping("/count-artists-by-ccaa/{ccaa}")
    public ResponseEntity<List<Artist>> countPostsByCCAA(@PathVariable CCAA ccaa) {
        List<Artist> count = service.getArtistByCCAA(ccaa);
        return ResponseEntity.ok(count);
    }

    @GetMapping("/count-artists-by-province/{province}")
    public ResponseEntity<List<Artist>> countPostsByProvince(@PathVariable Province province) {
        List<Artist> count = service.getArtistByProvince(province);
        return ResponseEntity.ok(count);
    }

    @GetMapping("/artists-by-age-range/{minAge}/{maxAge}")
    public ResponseEntity<List<Artist>> getArtistsByAgeRange(int minAge, int maxAge) {
        List<Artist> artists = service.getArtistsByAgeRange(minAge, maxAge);
        return ResponseEntity.ok(artists);
    }

}
