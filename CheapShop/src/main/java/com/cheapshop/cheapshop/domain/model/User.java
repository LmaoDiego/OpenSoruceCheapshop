package com.cheapshop.cheapshop.domain.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "users")
public class User extends AuditModel{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @Column(unique = true)
    private String email;

    @NotNull
    private String name;

    //-----------------------
    /*
    @ManyToMany(fetch = FetchType.LAZY,
            cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    @JoinTable(name ="user_tags",
            joinColumns =  {@JoinColumn(name = "user_id")},
            inverseJoinColumns = {@JoinColumn(name = "user_id")})
     */
    //------------------------

    public User() {    }

    public User(@NotNull String email, @NotNull String name) {
        this.email = email;
        this.name = name;
    }

    public Long getId()                 {   return id;   }

    public User setId(Long id)          {   this.id = id;   return this;}

    public String getEmail()            {  return email;  }

    public User setEmail(String email)  {   this.email = email;   return this; }

    public String getName()              {    return name;    }

    public User setName(String name)      {  this.name = name;   return this; }
}
