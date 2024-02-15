package org.Hamm.controller;

import org.Hamm.model.Artist;
import org.Hamm.model.CCAA;
import org.Hamm.model.Post;
import org.Hamm.model.Province;
import org.Hamm.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/post")
public class PostController {
    @Autowired
    PostService service;

    @GetMapping
    public ResponseEntity<List<Post>> getAllPosts() {
        List<Post> posts = service.getAllPosts();
        return ResponseEntity.ok(posts);
    }

    @GetMapping("/id")
    public ResponseEntity<Post> getPostById(int id) {
        Post post = service.getPostById(id);
        return ResponseEntity.ok(post);
    }

    @GetMapping("/title")
    public ResponseEntity<Post> getPostByTitle(String title) {
        Post post = service.getPostByTitle(title);
        return ResponseEntity.ok(post);
    }

    @GetMapping("/content")
    public ResponseEntity<Post> getPostByContent(String content) {
        Post post = service.getPostByContent(content);
        return ResponseEntity.ok(post);
    }

    @GetMapping("/media_url")
    public ResponseEntity<Post> getPostByMediaUrl(String mediaUrl) {
        Post post = service.getPostByMediaUrl(mediaUrl);
        return ResponseEntity.ok(post);
    }

    @GetMapping("/artist")
    public ResponseEntity<List<Post>> getPostsByArtist(Artist artist) {
        List<Post> posts = service.getPostsByArtist(artist);
        return ResponseEntity.ok(posts);
    }

    @GetMapping("/ccaa")
    public ResponseEntity<List<Post>> getPostsByCCAA(CCAA CCAA) {
        List<Post> posts = service.getPostsByArtistCCAA(CCAA);
        return ResponseEntity.ok(posts);
    }

    @GetMapping("/province")
    public ResponseEntity<List<Post>> getPostsByProvince(Province province) {
        List<Post> posts = service.getPostsByArtistProvince(province);
        return ResponseEntity.ok(posts);
    }

    @PostMapping
    public ResponseEntity<Post> createOrUpdatePost(@RequestBody Post post) {
        Post createdPost = service.createOrUpdatePost(post);
        return ResponseEntity.ok(createdPost);
    }

    @DeleteMapping
    public ResponseEntity<String> deletePost(int id) {
        service.deletePost(id);
        return ResponseEntity.ok("Post deleted");
    }

    //contar posts de una CCAA
    @GetMapping("/count-posts-by-ccaa/{ccaa}")
    public ResponseEntity<List<Post>> countPostsByCCAA(@PathVariable CCAA ccaa) {
        List<Post> count = service.getPostsByCCAA(ccaa);
        return ResponseEntity.ok(count);
    }

    //contar posts de una provincia
    @GetMapping("/count-posts-by-province/{province}")
    public ResponseEntity<List<Post>> countPostsByProvince(@PathVariable Province province) {
        List<Post> count = service.getPostsByProvince(province);
        return ResponseEntity.ok(count);
    }

}
