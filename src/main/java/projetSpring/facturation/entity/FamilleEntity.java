package projetSpring.facturation.entity;



import javax.persistence.Id;

import javax.persistence.Table;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;


import lombok.Data;

@Data
@Entity
@Table(name = "tbl_famille")
public class FamilleEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(length = 10)
    private long id;

    @Column(name = "code",nullable = false,length = 10)
    private String code;

    @Column(name = "libelle", nullable = false,length = 255)
    private String libelle;
}
