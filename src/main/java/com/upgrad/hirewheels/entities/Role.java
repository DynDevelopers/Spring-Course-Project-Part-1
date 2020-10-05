package com.upgrad.hirewheels.entities;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;


@Getter
@Setter
@Entity
public class Role {
//    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    private int roleId;

    @Column(name = "role_name", nullable = false, unique = true)
    private String roleName;

    @OneToMany(fetch = FetchType.EAGER, mappedBy = "role")
    private List<User> users;

//    @Override
//    public String toString() {
//        return "Role{" +
//                "roleId=" + roleId +
//                ", roleName='" + roleName + '\'' +
//                ", users=" + users +
//                '}';
//    }
}
