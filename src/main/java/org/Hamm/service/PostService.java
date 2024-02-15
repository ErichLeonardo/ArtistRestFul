package org.Hamm.service;

import org.Hamm.model.Artist;
import org.Hamm.model.CCAA;
import org.Hamm.model.Post;
import org.Hamm.model.Province;
import org.Hamm.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class PostService {
    @Autowired
    PostRepository repo;

    public List<Post> getAllPosts() {
        List<Post> posts = repo.findAll();
        return posts;
    }

    public Post getPostById(int id) {
        Optional<Post> post = repo.findById(id);
        if(post.isPresent()) {
            return post.get();
        } else{
            throw new RuntimeException("Post not found");
        }
    }

    public Post getPostByTitle(String title) {
        Optional<Post> post = repo.findByTitle(title);
        if(post.isPresent()) {
            return post.get();
        } else{
            throw new RuntimeException("Post not found");
        }
    }

    public Post getPostByContent(String content) {
        Optional<Post> post = repo.findByContent(content);
        if(post.isPresent()) {
            return post.get();
        } else{
            throw new RuntimeException("Post not found");
        }
    }

    public Post getPostByMediaUrl(String mediaUrl) {
        Optional<Post> post = repo.findByMediaUrl(mediaUrl);
        if(post.isPresent()) {
            return post.get();
        } else{
            throw new RuntimeException("Post not found");
        }
    }

    public List<Post> getPostsByArtist(Artist artist) {
        Optional<List<Post>> posts = repo.findByArtist(artist);
        if(posts.isPresent()) {
            return posts.get();
        }else{
            throw new RuntimeException("Post not found");
        }
    }

    public List<Post> getPostsByArtistLocation(String location){
        Optional<List<Post>> posts = repo.findByArtistLocation(location);
        if(posts.isPresent()) {
            return posts.get();
        }else{
            throw new RuntimeException("Post not found");
        }
    }

    public List<Post> getPostsByArtistCCAA(CCAA CCAA){
        Optional<List<Post>> posts = repo.findByArtistCCAA(CCAA);
        if(posts.isPresent()) {
            return posts.get();
        }else{
            throw new RuntimeException("Post not found");
        }
    }

    public List<Post> getPostsByArtistProvince(Province province){
        Optional<List<Post>> posts = repo.findByArtistProvince(province);
        if(posts.isPresent()) {
            return posts.get();
        }else{
            throw new RuntimeException("Post not found");
        }
    }

    @Transactional
    @Modifying
    @Query("UPDATE Post p SET p.title = :title, p.content = :content WHERE p.id = :id")
    public Post createOrUpdatePost(Post post) {
        Post end2;
        if(post.getId() > 0){
            Optional<Post> result = repo.findById(post.getId());
            if(result.isPresent()){
                post = result.get();
                post.setTitle(post.getTitle());
                post.setContent(post.getContent());
                end2 = repo.save(post);
            }else{
                throw new RuntimeException("Post not found with id: " + post.getId());
            }
        } else{
            end2 = repo.save(post);
        }
        return end2;
    }

    public void deletePost(int id) {
        Optional<Post> result = repo.findById(id);
        if(result.isPresent()){
            repo.deleteById(id);
        }else{
            throw new RuntimeException("Post not found with id: " + id);
        }
    }

    public List<Post> getPostsByCCAA(CCAA ccaa){
        Optional<List<Post>> posts = repo.findByArtistCCAA(ccaa);
        if(posts.isPresent()) {
            return posts.get();
        }else{
            throw new RuntimeException("Post not found");
        }
    }

    public List<Post> getPostsByProvince(Province province){
        Optional<List<Post>> posts = repo.findByArtistProvince(province);
        if(posts.isPresent()) {
            return posts.get();
        }else{
            throw new RuntimeException("Post not found");
        }
    }
}
