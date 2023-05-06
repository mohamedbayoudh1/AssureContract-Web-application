package tn.esprit.kaddem.entity;


import lombok.*;
import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.Set;

@Entity
@Table(name = "T_BENEFICIAIRE")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Beneficiaire implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "B_ID")
    private Long id; // Identifiant  (Clé primaire)
    @Column(name = "B_CIN")
    private Long cin;
    @Column(name = "B_NOM")
    private String nom;
    @Column(name = "B_PRENOM")
    private String prenom;
    @Column(name = "B_PROFESSION")
    private String profession;
    @Column(name = "B_SALAIRE")
    private float salaire;


    @OneToMany(cascade = CascadeType.ALL, mappedBy="beneficiaire")
    private Set<Assurance> Assurances;
}
