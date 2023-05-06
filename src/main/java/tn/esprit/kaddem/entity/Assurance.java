package tn.esprit.kaddem.entity;
import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
@Entity
@Table(name = "T_ASSURANCE")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Assurance implements Serializable {
    private static final long serialVersionUID = 1L;


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "A_ID")
    private Long id; // Identifiant Assurance (Clé primaire)
    @Column(name = "A_DESIGNATION")
    private String designation;
    @Column(name = "A_MONTANT")
    private float montant;

    @ManyToOne
    private Contrat contrat;

    @ManyToOne
    private Beneficiaire beneficiaire;

}




