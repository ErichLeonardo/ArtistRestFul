package org.Hamm.model;

import jakarta.persistence.*;
import org.Hamm.utils.Hash;

@Entity
@Table(name="artist")
public class Artist {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name="artist_name", nullable = false, unique = true)
    private String artistName;

    @Column(name="email", nullable = false, unique = true)
    private String email;

    @Column(name="password", nullable = false)
    private String password;

    @Column(name="name", nullable = false)
    private String name;

    @Column(name="image", nullable = false)
    private String image;

    @Column(name="age", nullable = false)
    private int age;

    @Enumerated(EnumType.STRING)
    @Column(name="CCAA", nullable = false)
    private CCAA CCAA;

    @Enumerated(EnumType.STRING)
    @Column(name="province", nullable = false)
    private Province province;

    @Column(name="location", nullable = false)
    private String location;

    @OneToOne(mappedBy = "artist")
    @JoinColumn(name = "id_post")
    private Post post;




    public Artist() {
    }

    public Artist(int id, String artistName, String name, String image, int age, CCAA CCAA, Province province,  String location, Post post) {
        this.id = id;
        this.artistName = artistName;
        this.email = email;
        this.password = password;
        this.name = name;
        this.image = image;
        this.age = age;
        this.CCAA = CCAA;
        this.province = province;
        this.location = location;
        this.post = post;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getArtistName() {
        return artistName;
    }

    public void setArtistName(String artistName) {
        this.artistName = artistName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = Hash.hashPassword(password);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public CCAA getCCAA() {
        return CCAA;
    }

    public void setCCAA(CCAA CCAA) {
        this.CCAA = CCAA;
    }

    public Province getProvince() {
        return province;
    }

    public void setProvince(Province province) {
        this.province = province;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String city) {
        this.location = city;
    }

    public Post getPost() {
        return post;
    }

    public void setPost(Post post) {
        this.post = post;
    }

    @Override
    public String toString() {
        return "Artist{" +
                "id=" + id +
                ", artistName='" + artistName + '\'' +
                ", email='" + email + '\'' +
                ", name='" + name + '\'' +
                ", image='" + image + '\'' +
                ", age=" + age +
                ", CCAA='" + CCAA + '\'' +
                ", province='" + province + '\'' +
                ", location='" + location + '\'' +
                ", post=" + post +
                '}';
    }
}

