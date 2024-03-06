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
    public Post updatePost(Post post) {
        Optional<Post> existingPost = repo.findById(post.getId());
        if (existingPost.isPresent()) {
            existingPost.get().setTitle(post.getTitle());
            existingPost.get().setContent(post.getContent());
            return repo.save(existingPost.get());
        } else {
            throw new RuntimeException("Post not found with id: " + post.getId());
        }
    }

    @Transactional
    public Post createPost(Post post) {
        return repo.save(post);
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
